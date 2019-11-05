package generic_methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlwrite_generic 
{
 public void write(String name,int no, String value) throws EncryptedDocumentException, InvalidFormatException, IOException
 {
	 FileInputStream fis = new FileInputStream("./xlsheet/data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(name);
		Row r = sh.createRow(no);
		Cell c = r.createCell(0);
		c.setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./xlsheet/data.xlsx");
		wb.write(fos);
 }
}
