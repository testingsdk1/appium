package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.lift.TestContext;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumberTest.createDriver;




 
public class javaUtilities extends createDriver{

	public static Date currentDate()
	{
		Date date = new Date(); 
		//System.out.println("current date and time: " + date.toString());
		return date;
	}

	
		 public static void takeScreenShot(Scenario result)
			{
		// Copy files to specific location here it will save all screenshot in our project home directory and
		// result.getName() will return name of test case so that screenshot name will be same

	    //In order to take the screen shot of the passed test case jus add ! or use same code in else
	 //   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Date date = currentDate(); 
				if(result.isFailed())
				{
				
				try {
				  // now copy the  screenshot to desired location using copyFile method
					
				// FileUtils.copyFile(src, new File("/Users/ankush.vashist/Documents/workspace/webApp/Screenshots/Fail/" +result.getName() +" "+date+".png"));
				 //
					File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// File sourcePath = ((TakesScreenshot) cucumberTest.createDriver.createDriver()).getScreenshotAs(OutputType.FILE);
				 System.out.println("Source value" +sourcePath);	
					//Building up the destination path for the screenshot to save
					//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
					File destinationPath = new File(System.getProperty("user.dir") + "/Screenshots/Fail/" + result.getName() +" "+date+".png");
					System.out.println("Destination value" +destinationPath);
					//Copy taken screenshot from source location to destination location
					Files.copy(sourcePath, destinationPath);   
					
					//This attach the specified screenshot to the test
					Reporter.addScreenCaptureFromPath(destinationPath.toString());
				
				 
				 
				 
				 //
				 
				 
				 
				}
				 
				catch (IOException e)
				 
				{
				 
				System.out.println(e.getMessage());
				 
				    }
				 System.out.println("---------- Scenario Fail ----------");
				 
				}
				else 
				{
					try {
						  // now copy the  screenshot to desired location using copyFile method
							
						// FileUtils.copyFile(src, new File("/Users/ankush.vashist/Documents/workspace/webApp/Screenshots/Pass/" +result.getName() +" "+date+".png"));
						
						 //
						File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						// File sourcePath = ((TakesScreenshot) cucumberTest.createDriver.createDriver()).getScreenshotAs(OutputType.FILE);
						 System.out.println("Source value " +sourcePath);	
							//Building up the destination path for the screenshot to save
							//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
							File destinationPath = new File(System.getProperty("user.dir") + "/Screenshots/Pass/" + result.getName() +" "+date+".png");
							System.out.println("Destination value" +destinationPath);
							//Copy taken screenshot from source location to destination location
							Files.copy(sourcePath, destinationPath);   
							
							//This attach the specified screenshot to the test
							Reporter.addScreenCaptureFromPath(destinationPath.toString());
						
						 //
						 
						}
						 
						catch (IOException e)
						 
						{
						 
						System.out.println(e.getMessage());
						 
						}
					
					 System.out.println("---------- Scenario Pass ----------");
				}
			}


			

 
//End of the class Hooks 
}
 
 


