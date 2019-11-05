package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class filpend 
{
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement un;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath="(//span[.='Login'])[3]")
	private WebElement log;
	
	@FindBy(xpath="(//div[@class='LDZ3w-'])[1]")
	private WebElement earphone;
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addcart;
	@FindBy(xpath="//span[.='Cart']")
	private WebElement cart;
	public filpend(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	public void fplog()
	{
		un.sendKeys("8050947566");
	}
	public void fppas()
	{
		pass.sendKeys("24562456");
	}
	public void fplogin()
	{
		log.click();
		
	}

	
	
	
}
