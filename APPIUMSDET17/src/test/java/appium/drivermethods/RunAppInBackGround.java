package appium.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class RunAppInBackGround {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi");  
		 
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("UDID", "d6c768cf9804");
		  //DC for Android 
		  dc.setCapability("appPackage", "io.appium.android.apis");
		  dc.setCapability("appActivity", ".ApiDemos");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement views=driver.findElementByAccessibilityId("Views");
		  views.click();
		  
		  driver.runAppInBackground(10);
		  

	}

}
