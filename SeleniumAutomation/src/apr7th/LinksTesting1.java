package apr7th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTesting1 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		String expURL=driver.findElement(By.linkText("Forgot Password?")).getAttribute("href");
		
		System.out.println("expected URL "+expURL);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		System.out.println(driver.getTitle());
		
		String actURL=driver.getCurrentUrl();
		
		System.out.println("actual URL "+actURL);
		
		driver.quit();
		

	}

}
