package appiumtestscript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTap {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi");  
		 // dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("UDID", "d6c768cf9804");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.miui.calculator");
		  dc.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		
		AndroidDriver driver = new AndroidDriver(url, dc);

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 MobileElement five= (MobileElement) driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		 driver.tap(1,five,500);
		 
		  //Thread.sleep(1000);
		 
		  MobileElement plus= (MobileElement) driver.findElementByAccessibilityId("plus");
		  driver.tap(1,plus,200);
		  
		  //Thread.sleep(1000);
		  
		  MobileElement three=(MobileElement) driver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
		  driver.tap(1,three,500);
		  
		  //Thread.sleep(1000);
		  
		  MobileElement equals= (MobileElement) driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		  driver.tap(1,equals,200);
		 // Thread.sleep(1000);
		  
		  String result=driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		 // Thread.sleep(1000);
		  System.out.println(result);
	}

}
