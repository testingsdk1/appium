package cucumberTest;

import java.util.Properties;

class ConfigFileReader
{
	static Properties properties;
	//String reportConfigPath="/Users/ankush.vashist/Documents/workspace/genericCucumber/extent-config.xml";
public static String getReportConfigPath(){
	
	
properties= new Properties();
 String reportConfigPath=	cucumberTest.seleniumMethods.fetchResponse("reportConfigPath");
 System.out.println("Value of reportConfigPath is " +reportConfigPath);
 if(reportConfigPath!= null) return reportConfigPath;
 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
}


//end of the class
}