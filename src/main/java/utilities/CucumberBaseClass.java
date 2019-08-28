package utilities;

//import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;

public class CucumberBaseClass {
	
	
	public static WebDriver driver;
	public Scenario scenario;
	Logger log;
	
	
	
	
//	@Before()
//	public void driverSetUp(Scenario scenario)
//	{
//		this.scenario=scenario;
//		System.out.println("********* Test Environment Setup *************");
//		System.out.println("Executing the scenario " + scenario.getName());
//		
//		System.out.println("Chrome Browser Test Environment created");
//		
//		System.setProperty("webdriver.chrome.driver", "E:\\Latest Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.get("https:www.freecrm.com");
//		driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		
//	}
//	
//	public WebDriver getDriver() {
//	      return driver;
//	   }
//	
//	
//	@After()
//	public void tearDown(Scenario scenario)throws NullPointerException
//	{
//		scenario.write("Finished scenario");
//		if (scenario.isFailed())
//				{
//					scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
//				}
//		System.out.println("Test Environment Destroyed ");
//		System.out.println("----------------------------------------------------------------------");
//		driver.close();
//		driver.quit();
//	}
	
	
	

}
