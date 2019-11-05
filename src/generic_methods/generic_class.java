package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class generic_class implements autoconstant
{
	public WebDriver driver;
	
	
	
	
	static 
	{
		System.setProperty(gecko_key,gecko_value);
		System.setProperty(chrome_key,chrome_value);
		
	}
	
 @Parameters({"browser"})
 @BeforeMethod
 public void test_parallel(String browser)
 {	

	 if(browser.equals("firefox"))
	 {
		 driver=new FirefoxDriver();
		 driver.get("https.flipkart.com/");
	 }
	 else {
		 driver=new InternetExplorerDriver();
		 driver.get("https://flipkart.com/");
	}
 }
 @AfterMethod
 public void closeapp()
 {
	 driver.quit();
 }
}
