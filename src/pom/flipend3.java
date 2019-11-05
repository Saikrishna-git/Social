package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_methods.Popup_generic;

public class flipend3
{
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	
	private WebElement addcart;
//	@FindBy(xpath=("//span[.='Cart']"))
//	private WebElement cart;
	@FindBy(xpath=("//div[.='Remove']"))
	private WebElement remove;
	@FindBy(xpath=("//div[.='Remove']"))
	private WebElement rem;
	public flipend3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addcart() throws InterruptedException
	{
		addcart.click();
		Thread.sleep(3000);
//		cart.click();
		remove.click();
		rem.click();
		
		
	}
}
