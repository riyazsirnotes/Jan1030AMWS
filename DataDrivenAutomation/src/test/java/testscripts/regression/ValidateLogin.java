package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin extends BaseTest {
	
	
	@Test
	public void validateLoginTest()
	{
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0617");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
	}
	
	

}
