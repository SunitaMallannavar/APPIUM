package appiumtestscript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreScroll {
	static AndroidDriver driver;
	

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi");  
		 
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("UDID", "c74bf4a40106");
		  dc.setCapability("appPackage", "com.androidsample.generalstore");
			dc.setCapability("appActivity", ".SplashActivity");
		  //DC for Android 
		 dc.setCapability("app","C:\\Users\\Admin\\Downloads\\APPs\\General-Store (1).apk");
		 
		 //appium server port no
		 
		 URL url = new URL("http://localhost:4723/wd/hub");
		  
			  driver = new AndroidDriver(url, dc);

			  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			 // driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			  
			  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).click();
			  scrollToElement(driver,"text","India");
			  
			  driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
			
	}
			  
	public static void scrollToElement(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

	}


