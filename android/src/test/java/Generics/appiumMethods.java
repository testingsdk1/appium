package Generics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

import cucumberTest.*;
import io.appium.java_client.android.AndroidDriver;

public class appiumMethods extends createDriver{

//Verified	
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
	
//Verified
public static void implicitlyWait(String stringFromConfig)
{
String elementfromConfig=fetchResponse(stringFromConfig);
int result = Integer.parseInt(elementfromConfig);	
driver.manage().timeouts().implicitlyWait(result, TimeUnit.SECONDS);
}

//Verified
public static void clickElementID(String stringFromConfig)
{
	WebElement element=null;
	String elementfromConfig=fetchResponse(stringFromConfig);

try
 
	{
	element = driver.findElement(By.id(elementfromConfig));
	
	if(element.isDisplayed())
	{
		
		System.out.println("The text from clickElementID() method : " +element.getText().toString());
		element.click();
	
		
	}

	}catch (Exception e) {
		System.out.println("Element not found : " +elementfromConfig.toString());
		org.testng.Assert.fail("The element searched was not found");
		e.printStackTrace();
	      
	    }

	
}

//Verified
public static String getText(String elementID)
{
	String elementfromConfig=appiumMethods.fetchResponse(elementID);
	String element = driver.findElement(By.id(elementfromConfig)).getText().toString();
	return element;
	
}

//Verified
public static void enterEditTextView(String className,int index,String enterText)
{
	
	List<WebElement> editTextField = driver.findElementsByClassName(className);
	WebElement enterMobileNumber = editTextField.get(index);   
	if(enterMobileNumber.isEnabled()){
		System.out.println("Element is enabled");
	enterMobileNumber.sendKeys(enterText);
	}
	else
	{
		System.out.println("Element not enabled");
	}

	
}

//Verified
public static void clickImageView(String className,int index)
{
	
	List<WebElement> editTextField = driver.findElementsByClassName(className);
	System.out.println("The classname is: " +className);
	WebElement enterMobileNumber = editTextField.get(index); 
	System.out.println("The index is: " +index);
	if(enterMobileNumber.isEnabled()){
		System.out.println("Element is enabled");
	enterMobileNumber.click();
	}
	else
	{
		System.out.println("Element not enabled");
	}
	

	
}


public static void clickOnElementList(String className, String stringFromConfig)
{
	String classNameFromConfig=appiumMethods.fetchResponse(className);
	List<WebElement> elementList = driver.findElements(By.className(classNameFromConfig));
	System.out.println("List Size: " +elementList.size());
	String elementfromConfig=appiumMethods.fetchResponse(stringFromConfig);
	
	for(int i=0;i<elementList.size(); i++){
		if(elementList.get(i).getText().contains(elementfromConfig))
		{
			System.out.println("Element to be clicked is " +elementList.get(i).getText());
			assertEquals(elementList.get(i).getText().toString(), elementfromConfig);
			elementList.get(i).click();
			break;
		}
	}
}

public static void sendKeys(String stringFromConfig, String enterText)
{
	
	
	String elementfromConfig=appiumMethods.fetchResponse(stringFromConfig);
	
	WebElement element = driver.findElement(By.id(elementfromConfig));
	
	String textToEnter=appiumMethods.fetchResponse(enterText);
	element.sendKeys(textToEnter);
	Reporter.addStepLog("The text: " + textToEnter + " is entered");
	
	//WebElement enterText = driver.findElement(By.id("com.brainbaazi:id/phoneNumberEV"));
//	enterText.sendKeys("8766322413");
}



public static String waitforelementonpage(String element)

{
	WebDriverWait wait;
	wait = new WebDriverWait(driver, 15);
	String elementfromConfig=fetchResponse(element);
	wait.until(ExpectedConditions.elementToBeClickable(By.id(elementfromConfig)));
	System.out.println("Element exists");
	return elementfromConfig;

}

public static void checkelementpresentbytext(String text) {

	System.out.println("inside checkelementpresentbytext");
	System.out.println("The value of text is :::::::" + text);
	if (!driver.findElements(By.name(text)).isEmpty()) {
		System.out.println("Element Found");
	

	}

}
	
	
}
