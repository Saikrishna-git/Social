package generic_methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	Select s;
public Dropdown(WebElement ele)
{
  s=new Select(ele);	
}
	
public void selectindex(int i)//WebElement ele
 {
	//Select s=new Select(ele);
	s.selectByIndex(i);
 }
public void selectbyvalue(String value) //WebElement ele
 {
	//Select s=new Select(ele);
	s.selectByValue(value);
 }
public void selectbyvtext(String text) 
 {
	//Select s=new Select(ele);
	s.selectByVisibleText(text);
 }
public void deselectall()
 {
	//Select s=new Select(ele);
	s.deselectAll();
 }
public void deselectbyindex(int i)
{
//	Select s=new Select(ele);
	s.deselectByIndex(i);
}
public void deselectbyvalue(String value)
{
	//Select s=new Select(ele);
	s.deselectByValue(value);
}
public void deselectbyvtext(String text)
{
	//Select s=new Select(ele);
	s.deselectByVisibleText(text);
}
public int getselectedoptions() 
 {
	//Select s=new Select(ele);
	List<WebElement> options = s.getAllSelectedOptions();
	int count = options.size();
	return count;
 }
public WebElement getfirstselectedoptions()
{
	//Select s=new Select(ele);
	WebElement option = s.getFirstSelectedOption();
	return option;
}
public void options()
 {
	//Select s=new Select(ele);
	List<WebElement> options = s.getOptions();
	int count = options.size();
	System.out.println(count);
	for (WebElement we : options)
	{
		String text=we.getText();
		System.out.println(text);
	}
 }
public boolean Imultiple()
 {
	//Select s=new Select(ele);
	boolean b = s.isMultiple();
	return b;
	
 }
	
	
 
}




