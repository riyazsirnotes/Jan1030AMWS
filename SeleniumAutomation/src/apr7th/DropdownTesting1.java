package apr7th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//conventional way 

		//using SendKeys method

		//driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		//Car & Motorbike
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Car & Motorbike");
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
