package apr21st;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void alertHandleTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(3000);
		
		
		//switch the control to alert
		
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		//to click ok button alert
		
		al.accept();
		
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	

}
