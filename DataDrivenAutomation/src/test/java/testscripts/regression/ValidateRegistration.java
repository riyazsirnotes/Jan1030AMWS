package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateRegistration extends BaseTest {
	
	@Test
	public void registrationTest()
	{
		
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - New User Registration");
		
	}

}
