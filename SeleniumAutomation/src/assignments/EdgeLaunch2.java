package assignments;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunch2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		
		new EdgeDriver();

	}

}
