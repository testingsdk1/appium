
package cucumberTest;
 

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumberTest.ConfigFileReader;

//Below are the testng details
//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue="stepDefinition",
        plugin = {"html:/Users/ankush.vashist/Documents/workspace/android/Reports/HTML/cucumber-reports",
        		"junit:/Users/ankush.vashist/Documents/workspace/android/Reports/HTML/cucumber-reports/Cucumber.xml",
        		"com.cucumber.listener.ExtentCucumberFormatter:/Users/ankush.vashist/Documents/workspace/android/Reports/ExtentReport/ExtentReport.html",
        	    "rerun:Reports/failed_scenarios.txt"},
        monochrome = true
        )
 
public class TestRunner {
	
	@AfterClass
    public static void report() {
	       Reporter.loadXMLConfig(new File("/Users/ankush.vashist/Documents/workspace/android/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.assignAuthor("Ankush Vashist");
	        Reporter.setSystemInfo("Java", "1.8.0_161");
	        Reporter.setSystemInfo("MAVEN", "3.5.3");
	        Reporter.setSystemInfo("APPIUM", "1.9.1");
	        Reporter.setSystemInfo("java-client", "4.1.2");
	        Reporter.setSystemInfo("Test Framework", "Junit");
	        Reporter.setSystemInfo("Reporting", "Extent");

	   
    }
	 
	 @BeforeClass
	 public static void setup() {
	  
		 
	 }
	 
	}
 
