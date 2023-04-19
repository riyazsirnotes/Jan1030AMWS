package apr19th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver(co);
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	public void multipleWindowsTest() throws InterruptedException
	{
		
		String homeWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Set<String>  allWindowIds=driver.getWindowHandles();
		
		Iterator<String> it=allWindowIds.iterator();
		
		while(it.hasNext())
		{
			
			String currentWindowId=it.next();
			
			driver.switchTo().window(currentWindowId);
			
			if(driver.getTitle().equals("Android Apps on Google Play"))
			{
				break;
			}
			
		}
		
		//driver.findElement(By.xpath("//span[text()='Games']")).click();
		
		driver.findElement(By.xpath("//span[text()='Games']/parent::span/parent::button")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		 allWindowIds=driver.getWindowHandles();
		 
		it=allWindowIds.iterator();
		
		while(it.hasNext())
		{
			
			String currentWindowId=it.next();
			
			driver.switchTo().window(currentWindowId);
			
			Thread.sleep(2000);
			
			if(driver.getTitle().equals("TestFlight - Apple"))
			{
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}


}
