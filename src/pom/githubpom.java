package pom;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class githubpom
{
	@FindBy(xpath="//a[@href='/login']")
	private WebElement signin;
	@FindBy(xpath="//input[@id='login_field']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@value='Sign in']")
	private WebElement sign;
	@FindBy(xpath="//a[.='Start a project']")
	private WebElement startproj;
	@FindBy(xpath="//input[@id='repository_name']")
	private WebElement repository;
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement creat;
	@FindBy(xpath="//input[@id='empty-setup-clone-url']")
	private WebElement url;
	@FindBy(xpath="//pre[@id='empty-setup-new-repo-echo']")
	private WebElement text;
	@FindBy(xpath="(//span[@class='dropdown-caret'])[2]")
	private WebElement logout;
	
	public githubpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void github(String name,String pass,String pname) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		signin.click();
		username.sendKeys(name);
		password.sendKeys(pass);
		sign.click();
		startproj.click();
		repository.sendKeys(pname);
		Thread.sleep(3000);
		creat.click();
		String text1 = url.getAttribute("value");
		Reporter.log(text1, true);
		String text2 = text.getText();
		Reporter.log(text2, true);
		
			FileInputStream fis=new FileInputStream("./excel/data.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sh1 = wb.getSheet("sheet1");
			Sheet sh2 = wb.getSheet("sheet2");
			Row r1 = sh1.createRow(0);
			Row r2 = sh2.createRow(0);
			Cell c1 = r1.createCell(0);
			Cell c2 = r2.createCell(0);
			c1.setCellValue(text1);
			c2.setCellValue(text2);
			FileOutputStream fos=new FileOutputStream("./excel/data.xlsx");
			wb.write(fos);
			
			
			
	
		
	}
	
}
