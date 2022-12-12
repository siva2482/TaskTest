package Config;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	

	public static  FileInputStream fis;
	public static Properties pro;
	public static String getLocator(String key)
	{
		try
		{
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\config.properties");
			pro=new Properties();
			pro.load(fis);
			return pro.getProperty(key);
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
	 return null;
	

}

}
