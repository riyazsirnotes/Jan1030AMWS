package apr20th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling2 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver(co);
		
		driver.get("https://www.angelfire.com/super/badwebs/");
		
		driver.manage().window().maximize();
		
		
		
	}
	@Test
	public void frameHandlingTest() throws InterruptedException
	{
		
		//frame(String)
		
		driver.switchTo().frame("contents");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//font[contains(text(),'Hate Frames Page')]/parent::a")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("main");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'monkeyspaw')]")).click();
	
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
