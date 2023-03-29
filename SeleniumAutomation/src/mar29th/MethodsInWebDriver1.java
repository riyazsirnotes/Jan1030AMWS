package mar29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//get Method
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(3000);
		
		//close
		
		//driver.close();
		
		//quit
		
		driver.quit();

	}

}
