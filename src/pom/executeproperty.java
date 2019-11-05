package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class executeproperty 
{
 public static void main(String[]args) throws FileNotFoundException, IOException
 {
	 Properties p = new Properties();
	 p.load(new FileInputStream("./prp.properties"));
	 String data = p.getProperty("url");
	 System.out.println(data);
	 
 }
}
