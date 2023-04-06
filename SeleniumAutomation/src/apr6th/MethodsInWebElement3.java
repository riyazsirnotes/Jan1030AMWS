package apr6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.name("username")).sendKeys("reyaz0617");
		
		//System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		
		//driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		driver.findElement(By.className("login_button")).click();
		
		Thread.sleep(3000);
		
		String text=driver.findElement(By.id("username_span")).getText();
		System.out.println(text);
		
		System.out.println(driver.findElement(By.id("username_span")).getTagName());
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));
		
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-size"));
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));

		driver.quit();
	}

}
