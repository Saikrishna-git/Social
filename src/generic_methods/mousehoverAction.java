package generic_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mousehoverAction 
{
	Actions act;
public mousehoverAction(WebDriver driver)
{
	 act=new Actions(driver);
}
public void mouseover(WebElement ele)
{
	//Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
}
public void DragDrop(WebElement ele,WebElement ele1)
{
	//Actions act=new Actions(driver);
	act.dragAndDrop(ele, ele1).perform();
}
public void RightClick(WebElement ele)
{
	//Actions act=new Actions(driver);
	act.contextClick(ele).perform();
}
public void Doubleclick(WebElement ele)
{
	//Actions act=new Actions(driver);
	act.doubleClick(ele).perform();

}
public void open_link_newtab(WebElement ele) throws AWTException
{
	//Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);

}
public void open_link_newwindow(WebElement ele) throws AWTException
{
	//Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
	r.keyRelease(KeyEvent.VK_W);

}
public void open_link_newprivatewindow(WebElement ele) throws AWTException
{
	//Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_P);

}
 public void minimizebrowser(WebElement ele) throws AWTException
 {
	//Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);

 }
 public void alterclosebrowser(WebElement ele) throws AWTException
 {
 	//Actions act=new Actions(driver);
 	act.contextClick(ele).perform();
 	Robot r=new Robot();
 	r.keyPress(KeyEvent.VK_ALT);
 	r.keyPress(KeyEvent.VK_SPACE);
 	r.keyPress(KeyEvent.VK_W);
 	r.keyRelease(KeyEvent.VK_ALT);
 	r.keyRelease(KeyEvent.VK_SPACE);
 	r.keyRelease(KeyEvent.VK_W);


 }
}
