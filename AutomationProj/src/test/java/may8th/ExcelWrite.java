package may8th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis1= new FileInputStream("D:\\001 Live Tech\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//case1 : modifying an existing cell

		//ws.getRow(1).getCell(2).setCellValue("java");
		
		//case2: creating a cell in existing Row

		//ws.getRow(2).createCell(1).setCellValue(456);
		
		//case3: creating a Row and cell in it 
		
		ws.createRow(3).createCell(0).setCellValue("LiveTech");
		
		FileOutputStream fos= new FileOutputStream("D:\\001 Live Tech\\Book1.xlsx");

		wb.write(fos);
		
		wb.close();
		
		System.out.println("End of Program");
	}

}
