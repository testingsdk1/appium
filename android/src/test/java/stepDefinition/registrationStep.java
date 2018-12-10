package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.ExecuteException;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.PendingException;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.createDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import testCases.*;
import Generics.*;
//import brainbaazi.com.til.seleniumMethods;

public class registrationStep extends createDriver{

  static AndroidDriver driver;

//Verified
	@Given("^The application is launched$")
	public void the_application_is_launched() throws InterruptedException{

	Reporter.addStepLog("The app is launched");
	}

	//Verified
	@Then("^The text \"([^\"]*)\" for id \"([^\"]*)\" is verified$")
	public void assertionMethod(String expectedData, String elementID) throws InterruptedException{

	String actualData=Generics.appiumMethods.getText(elementID);
	
	Assert.assertEquals(expectedData, actualData);

	}	

	//Verified
	@Then("^I enter \"([^\"]*)\" having className \"([^\"]*)\" with (\\d+) index$")
	public void enterText(String mobileNumber,String  classNme , int index ) throws InterruptedException {

		String elementfromConfig=appiumMethods.fetchResponse(mobileNumber);
		String classname=appiumMethods.fetchResponse(classNme);
		Generics.appiumMethods.enterEditTextView(classname,index,elementfromConfig);
	}

	//Verified
	@Then("^I tap on \"([^\"]*)\" with (\\d+) index$")
	public void clickOnImageView(String  classNme , int index ) throws InterruptedException {

	
		String classname=appiumMethods.fetchResponse(classNme);
		Generics.appiumMethods.clickImageView(classname,index);
	}
	
//Verified
	@When("^I tap on \"([^\"]*)\" element$")
	public static void clickOnElementByID(String textFromFeatureFile)
	{
		Generics.appiumMethods.clickElementID(textFromFeatureFile);
		Reporter.addStepLog("The element: " +textFromFeatureFile+ " is clicked");
		
	}
//Verified	
	@Then("^I Tear down the driver$")
	public static void endCycle()
	{
		System.out.println("############################### inside endCycle ");
		cucumberTest.createDriver.tearDown();
	}

	//Verified	
		@Then("^The user waits for sms to get autofiled$")
		public static void waitUntilSmsAutoFiled() throws InterruptedException
		{
			Thread.sleep(20000);
		}


	//Verified
	@When("^I Click on \"([^\"]*)\" with \"([^\"]*)\" text using List$")
	public static void clickOnElementByText(String className,String clickOnText)
	{
		Generics.appiumMethods.clickOnElementList(className, clickOnText);
		Reporter.addStepLog("The element: " +clickOnText+ " is clicked");
		
	}
	
	@When("^I Verify the hotelnames$")
	public static void hotelNames()
	{
		
		List<WebElement> elementList = driver.findElements(By.id("com.makemytrip:id/tvHotelName"));
		System.out.println("List Size: " +elementList.size());
		
		
		for(int i=0;i<5; i++){
			
			{
			//	if(elementList.get(i).)
				System.out.println("The first five hotel names are " +elementList.get(i).getText());
			//	assertEquals(elementList.get(i).getText().toString(), elementfromConfig);
				//elementList.get(i).click();
				break;
			}
		}

		
	}
	
	

	//in progress
	@When("^The user hides the keyboard$")
	public static void hideKeyboard()
	{
		driver.hideKeyboard();
		
	}
	
	
	

 
}

