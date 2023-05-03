package may3rd;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("D:\\001 Live Tech\\hello.html");
		
		f.createNewFile();
		
		System.out.println("End of Program");
		

	}

}
