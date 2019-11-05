package generic_methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptexe 
{
 public void handle_disable(WebDriver driver,String id,String s)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("Document.getelementByid(id).value='s'");
 }
 public void handle_disable_clear(WebDriver driver,String id)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("Document.getelementByid(id).value=''");
 }
 public void scroll(WebDriver driver,Point x,Point y)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	
	 js.executeScript("Window.ScrollBy(x,y)");
 }
}
