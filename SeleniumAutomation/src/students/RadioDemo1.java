package students;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioDemo1 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void scrollTest() throws InterruptedException
	{
		
		
		for(int k=1;k<=2;k++)
		{
			
			List<WebElement>  allRadios=driver.findElements(By.xpath("//input[@name='group"+k+"']"));
			
			for(int i=0;i<allRadios.size();i++)
			{
				allRadios.get(i).click();
				Thread.sleep(3000);
				for(int j=0;j<allRadios.size();j++)
				{
					System.out.println(allRadios.get(j).getAttribute("checked"));
				}
				
				System.out.println("----------------------------------");
			}
			System.out.println("*****************************");
			
			
		}
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
	}
	

}
