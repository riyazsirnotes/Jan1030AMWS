package may8th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream fis1= new FileInputStream("src\\test\\resources\\Properties\\demo.properties");
		 
		 Properties pr=new Properties();
		 
		 pr.load(fis1);
		 
		 
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("key1"));
		System.out.println(pr.getProperty("url"));
		
		 

	}

}
