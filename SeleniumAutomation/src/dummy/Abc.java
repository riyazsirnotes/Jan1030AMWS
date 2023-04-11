package dummy;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abc {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();

	}

}
