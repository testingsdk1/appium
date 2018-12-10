package cucumberTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;






public class seleniumMethods
	
{

	public static String geckoDriver="/Users/ankush.vashist/Documents/workspace/com.til.automation/geckodriver.exe";
	public static WebDriver driver;

	//This method is used to create the driver
//	public static WebDriver createdriver(String driverType)
//	{
//		   switch(driverType)
//		      {
//			 case "dtFirefox":
//				 driver = new FirefoxDriver();
//				 seleniumMethods.implicitWait();
//				 
//			   break;
//			 
//			 default:
//			   System.out.println("Default ");
//			 
//		      }
//		   
//		return driver;
//
//		
//		}


	
	public static void maximizeWebpage()
	{
		driver.manage().window().maximize();
	}

	
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS) ;	
	}



	public static void getUrl(String URL)
	{
		driver.get(URL);
		

		
	}
	
	
	
	public static void printConsole(String Text)
	{
		System.out.println(Text);
	}

	public static void closeDriver()
	{
		driver.close();
	}

	
	
	public static void setGeckoDriver()
	{
		System.setProperty("webdriver.gecko.driver,", geckoDriver);
		
	}
	
	
	
	public static void enterTextbyID(String configValue, String textToEnter)
	{
		String iD=seleniumMethods.fetchResponse(configValue);
		String entertext=seleniumMethods.fetchResponse(textToEnter);
		driver.findElement(By.id(iD)).sendKeys(entertext);
	
		
	}
	
	public static void tapByID(String id)
	{
		String idfromconfig=seleniumMethods.fetchResponse(id);
		driver.findElement(By.id(idfromconfig)).click();	
		
	}
	
	public static void enterTextbyName(String name, String textToEnter)
	{
		
		driver.findElement(By.name(name)).sendKeys(textToEnter);	
		
	}
	
	
	public static void tapByXpath(String locator,String str)
	{
	
	String stringfromConfig=seleniumMethods.fetchResponse(str);
	//System.out.println(stringfromConfig);
	driver.findElement(By.xpath("//*["+locator+"='"+stringfromConfig+"']")).click();
	}
	
	public static void sendKeysByXpath(String locatortype,String locatorStr,String enterText)
	{
	
	driver.findElement(By.xpath("//*["+locatortype+"='"+locatorStr+"']")).sendKeys(enterText);
	}
	
	public static String getTextByClassname(String className)
	{
		 String text = driver.findElement(By.xpath("//*[@class='"+className+"']")).getText();
		
		 
		 printConsole(text);
		 return text;
	}
	
	
	
	
public static String fetchResponse(String key) {
	Properties prop = new Properties();
	InputStream input = null;
	String value = null;

	try {
//Read the property file
		input = new FileInputStream("config.properties");

		// load a properties file
		prop.load(input);

		// get or fetch the properties value

		value = prop.getProperty(key);
		// String result = new String(value);
		System.out.println("Value from Config: " + value);
		
		

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	
	return prop.getProperty(key);
}
//End of fetchResponse Method


		
		
//End of the class		
}		
