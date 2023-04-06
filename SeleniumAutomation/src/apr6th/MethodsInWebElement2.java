package apr6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement usernameTextbox=driver.findElement(By.id("username"));
		
		usernameTextbox.sendKeys("reyaz0617");
		
		Thread.sleep(3000);
		
		usernameTextbox.clear();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
