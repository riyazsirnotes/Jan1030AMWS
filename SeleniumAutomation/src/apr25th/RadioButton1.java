package apr25th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton1 {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void radioButtonTest() throws InterruptedException
	{
		
		Assert
		.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		
		Assert
		.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		
		Assert
		.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
}
