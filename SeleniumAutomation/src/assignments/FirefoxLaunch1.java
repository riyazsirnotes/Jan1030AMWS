package assignments;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		new FirefoxDriver();

	}

}
