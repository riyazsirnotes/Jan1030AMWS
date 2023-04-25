package assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	public static void main(String[] args) {
		
	   WebDriverManager.chromedriver().setup();	
	   WebDriver driver= new ChromeDriver();
		//new WebDriverWait(driver, Duration.ofSeconds(20));
	}

}
