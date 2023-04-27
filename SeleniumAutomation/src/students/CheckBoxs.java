package students;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxs 
{

	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		
		List<WebElement>allcheck=driver.findElements(By.xpath("//td[@class='table5']/child::input"));
		
		
		
		
		for(int i=0;i<allcheck.size();i++)
		{
			allcheck.get(i).click();
			
			
				if(allcheck.get(i).isSelected())
				{
					for(int j=0;j<allcheck.size();j++)
					{
						System.out.println(allcheck.get(j).getAttribute("checked"));
					}
				
				}

		}
	}

}