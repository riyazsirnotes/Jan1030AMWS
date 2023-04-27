package students;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https:/www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		
		Thread.sleep(3000);
				
		driver.switchTo().frame("packageListFrame");
		
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No.Of Links: "+allLinks.size());
		
		
		int i=1;
		for(WebElement links:allLinks)
		{
			System.out.println(i+". "+links.getText());
			i++;
		}
		
		
		driver.quit();
		
	}

}