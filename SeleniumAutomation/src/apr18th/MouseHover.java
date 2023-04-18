package apr18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver(co);
		
		driver.get("https://www.icicibank.com/");
		
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	public void mouseHoverTest() throws InterruptedException
	{
		
		WebElement loans=driver.findElement(By.xpath("//span[text()='Loans']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(loans)
		         .pause(2000)
		         .moveToElement(driver.findElement(By.xpath("//label[text()='Agri and Rural Finance']")))
		         .pause(3000)
		         .click(driver.findElement(By.xpath("//a[text()='Tractor Loan']")))
		         .build()
		         .perform();
		
		Thread.sleep(5000);
		
		
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
