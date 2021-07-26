package appium.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebApp {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi");  
		 
		  dc.setCapability(MobileCapabilityType.AUTOMATION_NAME ,"appium");
		  dc.setCapability(MobileCapabilityType.PLATFORM_NAME ,"Android");
		  dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		  dc.setCapability(MobileCapabilityType.UDID, "c74bf4a40106");
		  dc.setCapability(MobileCapabilityType.NO_RESET,true);
		  
		 // dc.setCapability("deviceName", "Redmi");  
			 
		 // dc.setCapability("platformName", "Android");
		 // dc.setCapability("platformVersion", "9");
		 // dc.setCapability("automationName", "appium");
		//  dc.setCapability("UDID", "d6c768cf9804");
		  //DC for Android 
		  //dc.setCapability("appPackage", "com.androidsample.generalstore");
			//dc.setCapability("appActivity", ".SplashActivity");
		 
		  
		  //Launcg brwoser
		  dc.setCapability("browserName","Chrome");
		  
		  //Appium server port
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
			
			AndroidDriver driver = new AndroidDriver(url, dc);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 driver.get("http://www.facebook.com");
	}

}
