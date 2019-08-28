package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	
Properties pro;
	
	
	public ConfigDataProvider(){
		
		
		File src=new File("./Configuration/config.properties");
		try {
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} 
		
		catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());
		}
		
		
	}
	
	public String getApplicationurl(){
		
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getChromePath()
	{
		String ChromePath=pro.getProperty("chromePath");
		return ChromePath;
	}
	
	public String getIEPath()
	{
		String IEPath=pro.getProperty("IEPath");
		return IEPath;
	}
	
	public String getusername()
	{
		String Username=pro.getProperty("UserName");
		return Username;
	}
	
	public String getpassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}

}
