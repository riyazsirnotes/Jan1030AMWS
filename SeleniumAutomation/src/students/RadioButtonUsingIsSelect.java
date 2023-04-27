package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonUsingIsSelect 
{

	public static void main(String[] args)
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement elm1=driver.findElement(By.xpath("//input[@value='Wine']"));
		System.out.println(elm1.isSelected());
		
		WebElement elm2=driver.findElement(By.xpath("//input[@value='Beer']"));
		System.out.println(elm2.isSelected());
		
		WebElement elm3=driver.findElement(By.xpath("//input[@value='Water']"));
		System.out.println(elm3.isSelected());
		
		driver.quit();
	}

}