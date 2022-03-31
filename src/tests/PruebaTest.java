package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

class PruebaTest {

	public static void main(String[] args) {
		
//		WebDriverManager.firefoxdriver().driverVersion("0.30.0").setup();

		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.edgedriver().setup();
		
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://es.wikipedia.org/wiki/");
			
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Java");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
		
	}

}
