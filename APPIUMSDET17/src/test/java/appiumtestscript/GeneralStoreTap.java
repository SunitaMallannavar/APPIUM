package appiumtestscript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreTap {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi");  
		 
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("UDID", "d6c768cf9804");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.androidsample.generalstore");
			dc.setCapability("appActivity", ".SplashActivity");
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		
		AndroidDriver driver = new AndroidDriver(url, dc);

		 
		  
	}

}
