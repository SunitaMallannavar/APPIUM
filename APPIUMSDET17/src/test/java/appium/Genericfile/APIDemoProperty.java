package appium.Genericfile;

import java.net.URL;

import org.openqa.selenium.Capabilities;

import appium.GenericUtils.AppiumPropertyUtil;
import io.appium.java_client.android.AndroidDriver;

public class APIDemoProperty {
//using property file AppiumPropertyUtil

	AppiumPropertyUtil apUtil=new AppiumPropertyUtil();  
	String DEVICENAME=apUtil.getPropertyKeyValue("Redmi");
	String AUTONAME=apUtil.getPropertyKeyValue("appium");
	String PLATFORMNAME=apUtil.getPropertyKeyValue("Android");
	String PLATFORMVERSION=apUtil.getPropertyKeyValue("9");
	String UDIDPATH=apUtil.getPropertyKeyValue("c74bf4a40106");
	String APPPACKAGE=apUtil.getPropertyKeyValue("io.appium.android.apis");
	String APPACTIVITY=apUtil.getPropertyKeyValue(".ApiDemos");
	
	//using JSON file 
	
	//JsonUtil jUtil=new JsonUtil ();
	//String DEVICENAME=jUtil.getdataFrom("Redmi");
	//String AUTONAME=jUtil.getdataFrom("appium");
	//String PLATFORMNAME=jUtil.getdataFrom("Android");
	//String PLATFORMVERSION=jUtil.getdataFrom("9");
	//String UDIDPATH=jUtil.getdataFrom("c74bf4a40106");
	//String APPPACKAGE=jUtil.getdataFrom("io.appium.android.apis");
	//String APPACTIVITY=jUtil.getdataFrom(".ApiDemos");
	
	
	
	 URL url = new URL("http://localhost:4723/wd/hub");
	  
		
		AndroidDriver driver = new AndroidDriver(url, (Capabilities) apUtil);

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
}
	
	

}
