package apr4th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebDriver4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.livetech.in/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-facebook']/parent::a")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getWindowHandles());
		
		
		driver.quit();

	}

}
