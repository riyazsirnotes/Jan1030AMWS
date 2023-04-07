package apr7th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(drop);
		
		//selectByIndex(int) : void
		
		//s1.selectByIndex(10);
		
		//selectByValue(String) : void
		
		//s1.selectByValue("search-alias=stripbooks");
		
		//selectByVisibleText(String) : void
		
		s1.selectByVisibleText("Books");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
