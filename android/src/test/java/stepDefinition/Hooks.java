package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.lift.TestContext;
import org.testng.ITestResult;

import com.cucumber.listener.Reporter;

//import brainbaazi.com.til.Utilities;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumberTest.createDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;



 
public class Hooks{
	static Scenario scenario;
	String testName;
	String failedClassName;
	TestContext testContext;
	static int i =0;
	AppiumDriver driver=null;
	
	  
	@Before
	    public void beforeScenarioStart(Scenario s){
	        System.out.println("----This method is used for initial setUp, It works before every scenario ---");
	       
	    if(driver == null)
	     {
	    	 
	    	 AppiumDriver driver = cucumberTest.createDriver.createDriver();
	    	 System.out.println("########### DRIVER CREATED ###########");
	    	 
	     }
	    else
	    {
	    	
	    	System.out.println("DRIVER NOT NULL");
	    }
	 
	}
	 
	 @After
    public void afterScenario(Scenario s) throws IOException{
    	
	    	  Utilities.javaUtilities.takeScreenShot(s);
	    	  System.out.println("*********** The runs after every scenario *********** ");
	    	  if(s.isFailed())
	    	  {
	    	  Reporter.addScenarioLog("Scenario Fail");
	    	  }
	    	  else
	    	  {
	    		  Reporter.addScenarioLog("Scenario Pass");
	    	  }
	      
        }
	 


public static Date currentDate()
{
	Date date = new Date();
	return date;
}


	    
    
	 
	 public static String failedScenarioName()
	 {
		 String failedScenarioName= scenario.getName().toString();
		 return failedScenarioName;
	 }
	 
	 public static String failedClassName()
	 {
		 String failedClassName= scenario.getClass().toString();
		 return failedClassName;
	 }


//End of the class Hooks 
}
 
 


