package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class CommonConfig {
	
	public static Properties getProperty(String filename) throws Exception{
		
		InputStream fileReader;
		
		Properties property = new Properties();
		
		fileReader = new FileInputStream(filename);
		
		property.load(fileReader);
		
		return property;
	}

}
