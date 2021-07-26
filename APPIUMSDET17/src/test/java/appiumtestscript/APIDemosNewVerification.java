package appiumtestscript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosNewVerification {

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
		  driver.findElementByAccessibilityId("Views").click();
		  driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Controls']")).click(); 
		  driver.findElementByAccessibilityId("2. Dark Theme").click();
		  MobileElement element=(MobileElement) driver.findElement(By.id("io.appium.android.apis:id/edit"));
		  element.sendKeys("sunita");
		  String name=element.getAttribute("text");
		  System.out.println(name);
		  
		  MobileElement checkbox1=(MobileElement) driver.findElementByAccessibilityId("Checkbox 1");


		  
		  if(!(checkbox1.isSelected()))
			{
			  checkbox1.click();
			}
			System.out.println("checkbox1 is selected--"+!(checkbox1.isSelected()));
		 
		  String checked=checkbox1.getAttribute("text");
			//String checked=checkbox1.getText();
		  System.out.println(checked);
		 
		
			 
		  MobileElement radio2= (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/radio2"));

  
		  if(!(radio2.isSelected()))
		  {
				  radio2.click();
				 
		  }
		  System.out.println("checkbox1 is selected--"+!(radio2.isSelected()));
		  String radioslecet=radio2.getAttribute("text");
		  //String radioslecet=radio2.getText();
		  System.out.println(radioslecet);
		  
	}

}
