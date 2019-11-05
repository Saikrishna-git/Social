package generic_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webelements 
{
 public String attribute(WebElement ele,String title)
 {
	String att = ele.getAttribute("title");
	return att;
 }
 public boolean isselected(WebElement ele,String title)
 {
	 boolean sel = ele.isSelected();
	return sel;
 }
 public boolean isdisplayed(WebElement ele,String title)
 {
	 boolean dis = ele.isDisplayed();
	return dis;
 }
 public boolean isenable(WebElement ele,String title)
 {
	 boolean ena = ele.isEnabled();
	return ena;
 }
 public void clear(WebElement ele)
 {
	 ele.clear();
 }
 public void toclick(WebElement ele)
 {
	 ele.click();
 }
 public String cssvalue(WebElement ele,String font_size)
 {
	String value = ele.getCssValue(font_size);
	return value;
 }
 public Point location(WebElement ele)
 {
	 Point loc = ele.getLocation();
	 return loc;
 }
 public Dimension size(WebElement ele)
 {
	  Dimension count = ele.getSize();
	 return count;
 }
 public String text(WebElement ele)
 {
	  String text = ele.getText();
	 return text;
 }
 public void sendkey(WebElement ele,String value)
 {
	 ele.sendKeys(value);
 }
 public String tagname(WebElement ele)
 {
	 String name = ele.getTagName();
	 return name;
 }
 public void navigate(WebDriver driver,String url) 
 {
	driver.navigate().to("url");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
 }
}
