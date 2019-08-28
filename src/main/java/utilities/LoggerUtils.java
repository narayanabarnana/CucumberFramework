package utilities;


import java.util.Date;
import java.util.Properties;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;

public class LoggerUtils {
	
	public static Logger log = Logger.getLogger(LoggerUtils.class);
	public static Properties configProperty;
	
	public static void configLogger() throws Exception{
		
		configProperty = CommonConfig.getProperty("//Users//agnibhaghosh//Downloads//GIT//src//Configuration//config.properties");		

		PropertyConfigurator.configure(configProperty.getProperty("log4jConfigFilePath"));
										
		SimpleLayout layout = new SimpleLayout(); 
		
		FileAppender appender = new FileAppender(layout,"logs/OrangeWebpage."+new Date().getTime()+".log",false);
		
		log.addAppender(appender); 
		
	}

}
