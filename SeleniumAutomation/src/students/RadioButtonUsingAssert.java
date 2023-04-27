package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonUsingAssert
{

	public static void main(String[] args)
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Wine']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Beer']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Water']")).isSelected());
		
		
		driver.quit();
	}

}