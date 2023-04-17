package apr17th;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class TestNgDemo1 {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Starting the browser ...");
		System.out.println("Launching app..");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser Closed ....");
	}
	@Test(priority=2)
	public void validateLogin()
	{
		Assert.assertTrue(true);
		System.out.println("Login Succesful...");
		
	}
	
	@Test(priority=1)
	public void validateRegistration()
	{
		
		System.out.println("Registration Succesful...");
		
	}
	
	@Test(priority=3)
	public void validateForgotPassword()
	{
		
		System.out.println("Forgot Password Succesful...");
		
	}
	
	@Test(priority=4,dependsOnMethods="validateLogin")
	public void validateChangePassword()
	{
		
		System.out.println("Change Password Succesful...");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
