package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_methods.mousehoverAction;

public class filpend1 
{
	@FindBy(xpath="//span[.='Electronics']")
	private WebElement electo;
	@FindBy(xpath="//a[@title='Realme']")
	private WebElement headphone;
	public filpend1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	public void mouse(WebDriver driver)
	{
		mousehoverAction mo = new mousehoverAction(driver);
		mo.mouseover(electo);
		
	}
	public void sele()
	{
		headphone.click();
	}
}
