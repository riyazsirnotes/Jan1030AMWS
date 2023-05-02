package may2nd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo3 {
	

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void waitsTest() throws InterruptedException, IOException
	{
		
		WebDriverWait myWait=new WebDriverWait(driver, 30);
	
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@data-gtm-bnr-imgname,'GuessDeisel-Upto70')])[1]")));
		
		driver.findElement(By.xpath("(//a[contains(@data-gtm-bnr-imgname,'GuessDeisel-Upto70')])[2]")).click();
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}

}
