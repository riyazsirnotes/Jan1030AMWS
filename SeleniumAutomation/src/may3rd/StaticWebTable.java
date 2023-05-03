package may3rd;

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

public class StaticWebTable {


	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void staticWebTableTest() throws InterruptedException, IOException
	{

		String part1="//table/tbody/tr[";

		String part2="]/td[1]/a";


		for(int i=1;i<=36;i++)
		{
			System.out.println(driver.findElement(By.xpath(part1+i+part2)).getText());
		}


	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);

		driver.quit();
	}

}
