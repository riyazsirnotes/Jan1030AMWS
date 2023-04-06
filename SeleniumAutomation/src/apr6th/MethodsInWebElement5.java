package apr6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement5 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		
		driver.quit();
		
	}

}
