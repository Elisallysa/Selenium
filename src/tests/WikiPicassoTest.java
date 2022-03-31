package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikiPicassoTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		try {
			driver.get("https://es.wikipedia.org/wiki/");

			// BUSCAR "PABLO PICASSO" Y COMPROBAR QUE LA IMAGEN ESTÁ EN LA DERECHA
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Pablo Picasso");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[2]/td/a/img")).getLocation()
					.getX();

			// Compruebo el ancho de la ventana
			int winWidth = driver.manage().window().getSize().getWidth();
			System.out.println(winWidth);
			
			//Si la posición de la imagen se encuentra de la mitad en adelante del eje X, estará en la derecha
			if (driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[2]/td/a/img")).getLocation().getX()>525) {
				System.out.println("La imagen está en la parte derecha de la pantalla.");
			} else {
				System.out.println("La imagen está en la parte izquierda de la pantalla.");
			}
			
			// BUSCAR "IES PABLO PICASSO" Y COMPROBAR QUE NO HAY RESULTADOS
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("IES Pablo Picasso");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
			Thread.sleep(3000);
			if (driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText().equals("Resultados de la búsqueda")) {
				System.out.println("No se encuentra \"IES Pablo Picasso\" en Wikipedia");
			} else {
				System.out.println("Se han encontrado resultados.");
			}
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
