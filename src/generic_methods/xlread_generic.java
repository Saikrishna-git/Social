package generic_methods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlread_generic 
{
	public static String getdata(String sheet,int row,int cell)
	{
		String val="";
		try{
			FileInputStream fis= new FileInputStream("./excel/data.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			val=c.toString();
		   }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return val;
	}
	
}
