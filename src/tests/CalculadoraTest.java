package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class CalculadoraTest {	
	
	@Test
	void operaciones() {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://testsheepnz.github.io/BasicCalculator.html");
			
			System.out.println("Suma");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("8");
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("6");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			Thread.sleep(5000);
			String resultado = driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value");
			assertEquals("14", resultado);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
			
			System.out.println("Resta");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("17");
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("4");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			Thread.sleep(3000);
			resultado = driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value");
			assertEquals("13", resultado);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
			
			System.out.println("Multiplicación");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("13");
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("9");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			Thread.sleep(3000);
			resultado = driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value");
			assertEquals("117", resultado);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
			
			System.out.println("División");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("26");
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("4");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			Thread.sleep(3000);
			resultado = driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value");
			assertEquals("6.5", resultado);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
	
			System.out.println("Concatenar");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[5]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("10");
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("4");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			Thread.sleep(3000);
			resultado = driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value");
			assertEquals("104", resultado);
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
			
			driver.quit();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
