package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmiCalculate2 
	{
		WebDriver driver;
		
		@BeforeMethod
		public void commoncode1()
		{
			ChromeOptions co=new ChromeOptions();	
			co.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();
			
			driver =new ChromeDriver(co);
			
			driver.get("https://emicalculator.net/");
			driver.manage().window().maximize();
		}
		
		
		@AfterMethod
		public void commoncode2() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.quit();
		}
		
		@Test
		public void emicalculator() throws InterruptedException
		{
			
			Thread.sleep(10000);
			
			System.out.println(driver.findElement(By.xpath("//div[@id='loantermslider']/descendant::span")).getRect().getX());
			
	    }

}
