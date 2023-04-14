package apr14th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LinksTesting4 {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
			
		ChromeDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));

		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of Links in this Block "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			String linkText=allLinks.get(i).getText();
			
			System.out.println("Link Text of Link "+(i+1)+" is "+linkText);
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
