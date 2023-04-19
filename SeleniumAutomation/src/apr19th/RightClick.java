package apr19th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	
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
	public void mouseHoverTest() throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		
		action.contextClick(driver.findElement(By.xpath("//img[@alt='Hotel Image 3']")))
		          .perform();
		
		
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
