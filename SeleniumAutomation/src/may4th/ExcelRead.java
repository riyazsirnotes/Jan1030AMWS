package may4th;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\001 Live Tech\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet");
		
		Iterator<Row>  rows=ws.iterator();
		
		Row row=null;
		Cell cell=null;
		
		while(rows.hasNext())
		{
			row=rows.next();
			
			Iterator<Cell>  cells=row.iterator();
			
			while(cells.hasNext())
			{
				cell=cells.next();
				
				if(cell.getCellType()==CellType.STRING)
				{
					System.out.println(cell.getStringCellValue());
				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue());
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue());
				}
			}
		}
		
		FileOutputStream fos= new FileOutputStream("D:\\001 Live Tech\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		
		System.out.println("End of Program");
		
	}
}
