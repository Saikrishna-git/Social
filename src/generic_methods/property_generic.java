package generic_methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property_generic 
{
	public String prop_file(String path,String key) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		 p.load(new FileInputStream("path"));
		 String data = p.getProperty("key");
		 System.out.println(data);
		 return data;
	}
	
}
