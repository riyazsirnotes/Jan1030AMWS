package may3rd;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("D:\\001 Live Tech\\Sample.txt");
		
		f.createNewFile();
		
		System.out.println("End of Program");
		

	}

}
