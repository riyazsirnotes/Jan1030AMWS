package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.name("birthday_day")).sendKeys("2");
		
		//driver.findElement(By.name("birthday_month")).sendKeys("Oct");
		
		//driver.findElement(By.id("year")).sendKeys("1969");
		
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("2");
		
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Oct");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1969");		
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
