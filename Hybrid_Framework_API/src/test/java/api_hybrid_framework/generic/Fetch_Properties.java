package api_hybrid_framework.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_Properties 
{
	public static String getProperties_value() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\eclipse_neon\\Hybrid_Framework_API\\src\\test\\java\\api_hybrid_framework\\utils\\GlobalProperties.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String a1 = pro.getProperty("baseURI");
		return a1;
		
	}

	

}
