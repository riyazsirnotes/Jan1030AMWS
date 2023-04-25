package apr25th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void checkBoxTest() throws InterruptedException
	{
		
		
		List<WebElement>  allChecks=driver.findElements(By.xpath("//td[@class='table5']/descendant::input"));
		
		for(WebElement check:allChecks)
		{
			System.out.println(check.getAttribute("checked"));
		}
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}
	

}
