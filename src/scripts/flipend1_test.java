package scripts;

import java.awt.AWTException;


import org.testng.annotations.Test;

import generic_methods.Popup_generic;
import generic_methods.generic_pom;
import pom.filpend;
import pom.filpend1;
import pom.flipend2;
import pom.flipend3;

public class flipend1_test extends generic_pom
{
	@Test
	public void test() throws InterruptedException, AWTException
	{
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
	ip2.newwind(driver) ;
	
	Thread.sleep(3000);
	flipend3 ip3 = new flipend3(driver);
	ip3.addcart();
	
	Popup_generic pop = new Popup_generic();
	pop.alert_accept(driver);
	
}
}
