package generic_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup_generic 
{
	public String alert_popup(WebDriver driver)
	{
	   Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		return text;
	}
	public void alert_accept(WebDriver driver)
	{
	   Alert a = driver.switchTo().alert();
		a.accept();//to accept and also to close
	}
	public void filedown_popup(WebElement ele) throws AWTException
	{
		ele.sendKeys(Keys.ENTER);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void fileuplod_popup(WebElement ele,String path)
	{
		ele.sendKeys(path);
	}
		
}
