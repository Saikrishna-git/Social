package scripts;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generic_methods.generic_class;
import generic_methods.generic_pom;
import pom.filpend;
import pom.filpend1;
import pom.flipend2;
import pom.flipend3;

public class test_flipend extends generic_pom
{
	@Test
	
	public void test() throws InterruptedException, AWTException
	{
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		filpend ip = new filpend(driver);
		ip.fplog();
		ip.fppas();
		ip.fplogin();Thread.sleep(3000);
		filpend1 ip1 = new filpend1(driver);
		ip1.mouse(driver);
		Thread.sleep(3000);
		ip1.sele();
		Thread.sleep(3000);
		flipend2 ip2 = new flipend2(driver);
		ip2.newwind(driver);
		
		Thread.sleep(3000);
		flipend3 ip3 = new flipend3(driver);
		ip3.addcart();
		
	}
}
