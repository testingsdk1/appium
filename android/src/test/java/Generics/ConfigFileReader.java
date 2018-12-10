package Generics;

class ConfigFileReader
{

public static String getReportConfigPath()
{

	String reportConfigPath=	cucumberTest.seleniumMethods.fetchResponse("pathExtentXml");
 //String reportConfigPath = properties.getProperty("extent-config.xml");
 if(reportConfigPath!= null) return reportConfigPath;
 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
}

//End of the class
}