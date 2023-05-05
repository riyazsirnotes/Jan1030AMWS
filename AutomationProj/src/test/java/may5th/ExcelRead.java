package may5th;

import java.io.FileInputStream;
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
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
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
					System.out.println(cell.getStringCellValue()+" is a String");
				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue()+" is a Number");
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue()+" is a boolean");
				}
			}
		}
		
		System.out.println("End of Program");
	}

}
