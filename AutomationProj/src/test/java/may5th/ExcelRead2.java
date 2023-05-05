package may5th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\001 Live Tech\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//System.out.println("getLastRowNum  : "+ws.getLastRowNum());
		
		//System.out.println("getPhysicalNumberOfRows  : "+ws.getPhysicalNumberOfRows());
		
		//System.out.println("getLastCellNum :"+ ws.getRow(1).getLastCellNum());
		
		//System.out.println("getPhysicalNumberOfCells :"+ ws.getRow(1).getPhysicalNumberOfCells());
		
		Row row=null;
		Cell cell=null;
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			
			row=ws.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				if(!(row.getCell(j)==null))
				{
				cell=row.getCell(j);
				
				
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
		}
		
		System.out.println("End of Program");
	}

}
