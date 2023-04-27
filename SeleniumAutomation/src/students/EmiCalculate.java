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

public class EmiCalculate 
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
			Actions act=new Actions(driver);
			
			WebElement source1=driver.findElement(By.xpath("//div[@id='loanamountslider']/span"));
			act.dragAndDropBy(source1, 80, 0).perform();
			
			WebElement source2=driver.findElement(By.xpath("//div[@id='loaninterestslider']/descendant::span"));
			act.dragAndDropBy(source2, 150, 0).perform();
//			
			WebElement source3=driver.findElement(By.xpath("//div[@id='loantermslider']/descendant::span"));
			act.dragAndDropBy(source3, -108, 0).perform();
			
			Thread.sleep(3000);
//			JavascriptExecutor js = ((JavascriptExecutor)driver);
//			
//			js.executeAsyncScript("window.scrollBy(0,300)");
//			
//			Thread.sleep(3000); 
//			
//			WebElement elm=driver.findElement(By.xpath("//span[text()='92,439']"));
//			
//			String str="92,439";
//			
//			Assert.assertEquals(elm, str);
	    }

}
