package students;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingOnlyNavigation {
	static ChromeOptions co;
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(co);
		driver.get("https://www.livetech.in/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
				
		driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
		
		switchToWindow("LiveTech - Home | Facebook");
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@aria-label='Accessible login button']/descendant::span[text()='Log in']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//i[@class='fa fa-instagram'])[1]")).click();
		Thread.sleep(3000);
		switchToWindow("LiveTech Testingtools (@livetechqa) | Instagram");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(3000);	
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
	
		
		Thread.sleep(3000);
		
		driver.quit();
	}

	private static void switchToWindow(String title) {
		
		Set<String>  allWindowIds=driver.getWindowHandles();
		
		Iterator<String> it=allWindowIds.iterator();
		
		while(it.hasNext())
		{
			
			String currentWindowId=it.next();
			
			driver.switchTo().window(currentWindowId);
			
			if(driver.getTitle().equals(title))
			{
				break;
			}
	
		}
	}

}
