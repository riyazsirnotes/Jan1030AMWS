package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDropdown {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> allItems=drop.findElements(By.tagName("option"));
		
		System.out.println(allItems.size());
		
		for(WebElement item: allItems)
		{
			System.out.println(item.getText());
		}
		
		driver.quit();
		

	}

}
