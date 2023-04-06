package apr6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement4 {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Butter']"))
				.getAttribute("checked"));
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Milk']"))
				.getAttribute("checked"));
		
		driver.quit();
	}

}
