package generic_methods;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Webdriver_generic 
{
  public void close(WebDriver driver)
  {
	  driver.close();
  }
  public void getmethod(WebDriver driver,String url)
  {
	  driver.get(url);
  }
  public String currenturl(WebDriver driver)
  {
	  String url = driver.getCurrentUrl();
	  return url;
  }
  public String pagesource(WebDriver driver)
  {
	  String src = driver.getPageSource();
	  return src;
	  
  }
  public String title(WebDriver driver)
   {
	   String title = driver.getTitle();
	   return title;
   }
  public String windohandel(WebDriver driver)
  {
	  String id = driver.getWindowHandle();
	  return id;
  }
  public ArrayList<String> windowhandels(WebDriver driver)
  {
	  Set<String> all = driver.getWindowHandles();
	  ArrayList<String> list=new ArrayList<String>();
	  int count=all.size();
	  System.out.println(count);
	  for (String wh :all)
	  {
		  list.add(wh);
	  }
	  return list;
  }
  public void switchto(WebDriver driver,int i)
  {
	  Set<String> all = driver.getWindowHandles();
	  ArrayList<String> list=new ArrayList<String>(all);
	  list.get(i);
	  int count=all.size();
	 // System.out.println(count);
	  for (String wh :list)
	  {
		  driver.switchTo().window(wh);
		 
	  }
	  
  }
  
  
  
  
}
