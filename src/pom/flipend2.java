package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_methods.Webdriver_generic;
import generic_methods.mousehoverAction;

public class flipend2
{
	@FindBy(xpath="(//div[.='Realme C2 (Diamond Black, 32 GB)'])[1]")
	private WebElement earphone;
	
	public flipend2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void newwind(WebDriver driver) throws AWTException
	{
		//mousehoverAction mo = new mousehoverAction();
		//mo.open_link_newtab(driver, earphone);
		earphone.click();
		Webdriver_generic wb = new Webdriver_generic();
		wb.switchto(driver, 1);
		
	}
	
}
