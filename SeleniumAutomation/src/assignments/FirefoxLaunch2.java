package assignments;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunch2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		new FirefoxDriver();
		
		
	}

}
