package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic_pom 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://flipkart.com/");
	}
	//@AfterMethod
	//public void closeappln()
	//{
		//driver.quit();
	//}
}
