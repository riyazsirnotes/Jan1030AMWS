package assignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDropdown2 {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Select s1=new Select(driver.findElement(By.id("searchDropdownBox")));
	
		List<WebElement> allItems=s1.getOptions();
		
		System.out.println(allItems.size());
		
		Iterator<WebElement> it=allItems.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println(it.next().getText());
		}
		
		driver.quit();
		

	}

}
