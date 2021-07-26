package appium.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class KeyPressOnCamera {

	private static final int AndroidKeyCode = 0;
	private static final Integer KEYCODE_VOLUME_DOWN = null;
	private static final Integer KEYCODE_VOLUME_UP = null;
	private static final Integer KEYCODE_CAMERA = null;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi");  
		 // dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("UDID", "d6c768cf9804");
		  dc.setCapability("noReset", true);
		  
		  
		  //DC for Android 
		  dc.setCapability("appPackage", "com.android.camera");
		  dc.setCapability("appActivity", ".Camera");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("App").click();
		driver.pressKeyCode(AndroidKeyCode, KEYCODE_CAMERA);
		
		driver.pressKeyCode(AndroidKeyCode, KEYCODE_VOLUME_DOWN);
		driver.pressKeyCode(AndroidKeyCode, KEYCODE_VOLUME_UP);
		

}
}
