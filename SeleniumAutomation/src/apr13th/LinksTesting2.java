package apr13th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LinksTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
			
		ChromeDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(co);
		
		//WebDriverManager.edgedriver().setup();
		
		//WebDriver driver=new EdgeDriver();
		
		//driver.get("https://adactinhotelapp.com/");
		
		driver.get("https://www.icicibank.com/");
		
		driver.manage().window().maximize();
		
		//collect all links in page
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links "+allLinks.size());
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
