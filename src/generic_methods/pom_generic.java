package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_generic
{
	//declaration
	@FindBy(xpath="//div[.='Login ']")
	private WebElement Login;
	//initialization
	public pom_generic(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public void clicklogin()
	{
		Login.click();
	}
}
