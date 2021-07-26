package appium.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwitchingMultipleAPP {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		  
			  AndroidDriver driver = new AndroidDriver(url, dc);

			  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			  
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sunita");
	    
	    driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	    
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
	     
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    
	    
	    Set<String> windows=driver.getContextHandles();
	    for(String window:windows)
	    {
	    	System.out.println("Active Application: "+window);
	    }
	    
	    Thread.sleep(3000);
	    driver.context(null);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	    
	}

}
