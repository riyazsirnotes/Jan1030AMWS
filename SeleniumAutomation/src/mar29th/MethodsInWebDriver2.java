package mar29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebDriver2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
