package appium.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;



public class AppiumPropertyUtil {
	/*
	 * this method is used to read the data from the properties and return the values based on key specified
	 * @parameter key
	 * @throws throwable
	 * @return values
	 */
	public String getPropertyKeyValue(String key)throws Throwable 
	{
		FileInputStream file=new FileInputStream(".\\Data\\appium.properties");
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(key);
	}
}

}
