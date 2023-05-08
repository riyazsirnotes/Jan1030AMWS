package may8th;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateLogin extends BaseTest {
	

	WebDriver driver;
	
	

	@BeforeMethod
	public void setUp()
	{
		String browserName=pr.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
			
		driver.manage().window().maximize();
		driver.get(pr.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void validateLoginTest() throws InterruptedException
	{

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0617");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);

		driver.quit();
	}


}
