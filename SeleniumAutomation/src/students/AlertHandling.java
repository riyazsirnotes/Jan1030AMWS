package students;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://demo.guru99.com/v4/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr266311");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123$");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1729");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy,(0,100)");
		
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
	
		driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();

		driver.quit();
	}

}

