package students;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsBothButtons 
{

	public static void main(String[] args)
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		List<WebElement> allbtns=driver.findElements(By.xpath("//td[@class='table5']/child::input"));
		
		
		for(int i=0;i<allbtns.size();i++)
		{
			allbtns.get(i).click();
			
			
				if(allbtns.get(i).isSelected())
				{
					for(int j=0;j<allbtns.size();j++)
					{
						System.out.println(allbtns.get(j).getAttribute("checked"));
					}
				
				}

		}
		
		
	}
}