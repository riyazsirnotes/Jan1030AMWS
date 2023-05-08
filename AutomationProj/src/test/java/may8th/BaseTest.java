package may8th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	Properties pr;
	
	@BeforeClass
	public void fileSetUp() throws IOException
	{
		FileInputStream fis1= new FileInputStream("src\\test\\resources\\Properties\\demo.properties");
		 
		  pr=new Properties();
		 
		 pr.load(fis1);
		
	}

}
