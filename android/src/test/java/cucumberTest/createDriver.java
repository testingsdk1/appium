package cucumberTest;




import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import testCases.registrationFlow;


public class createDriver {

	public static  AndroidDriver driver;

	
	
	//public static void createDriver() throws ExecuteException, IOException, InterruptedException
//	@Before
	public static AndroidDriver createDriver()
	{
		
		
		String apkpath = "/Users/ankush.vashist/Documents/workspace/android/mmt.apk";

		File app = new File(apkpath);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Moto G5 Plus");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.makemytrip");

		capabilities.setCapability("appActivity", "com.mmt.travel.app.home.ui.SplashActivity");
		capabilities.setCapability("autoGrantPermissions", "true");
	
		capabilities.setCapability("platformVersion", "7.0");
	
		
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appiumVersion", "1.9.1");
		capabilities.setCapability("reset", "true");
		capabilities.setCapability("automationName","uiautomator2");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Generics.appiumMethods.implicitlyWait("implicitWait");
		System.out.println("Inside the junit before function");
		return driver;
		
	}
	
//@After
	public static void tearDown()
	{
	System.out.println("******************************** before the ****************tearDown() ");
		driver.close();
		System.out.println("******************************** After the ****************tearDown() ");
	}

}
