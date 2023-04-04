package apr4th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebDriver3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Payment Gateway Project")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
	}

}
