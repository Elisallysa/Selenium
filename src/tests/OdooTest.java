package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

class OdooTest {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.odoo.com/es_ES");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"top_menu\"]/div/a[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[1]/div[1]/div[4]/label[1]/div/div[3]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[1]/div[1]/div[4]/label[2]/div/div[3]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[1]/div[1]/div[5]/label[3]/div/div[3]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[1]/div[2]/div/div/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sergio Ramírez");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sergioramirez@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"company-name\"]")).sendKeys("IES Antonio Machado");
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("603254800");
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[5]/div[1]/div/select")).click();
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[5]/div[1]/div/select/option[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"plan\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"plan\"]/option[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[8]/div[2]/button")).click();
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
		
	}

}
