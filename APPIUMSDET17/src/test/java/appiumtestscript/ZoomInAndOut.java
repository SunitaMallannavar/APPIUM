package appiumtestscript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZoomInAndOut {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi");  
		 
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("UDID", "d6c768cf9804");
		  //DC for Android 
		  dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
		  dc.setCapability( "appActivity",".MainActivity");


		 
		 //appium server port no
		 
		 URL url = new URL("http://localhost:4723/wd/hub");
		  
			 AndroidDriver driver = new AndroidDriver(url, dc);

			  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			  driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
			  WebElement img=driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
			  driver.zoom(img);
			  
			  Thread.sleep(3000);
			  
			  driver.pinch(img);

	}

}
