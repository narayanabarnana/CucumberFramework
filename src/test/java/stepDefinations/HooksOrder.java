package stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.LoginPage;
import utilities.CucumberBaseClass;
import utilities.LoggerHelper;
import utilities.MyScreenRecorder;

public class HooksOrder extends CucumberBaseClass{
	
	
	private CucumberBaseClass base;
	public HooksOrder(CucumberBaseClass base)
	{
		this.base=base;
		
	}
	
	
	
	ExtentReports extent;
    ExtentTest test;
    
    public static LoginPage loginpage;
    
    Logger log=LoggerHelper.getLogger(HooksOrder.class);
	
	
	
	@Before(order=0)
	public void StartRecording(Scenario scenario) throws Exception {
		
		MyScreenRecorder.startRecording(scenario.getName());		
		
	}
	
	@Before(order=1)
	public void driverSetUp(Scenario scenario) {
		
		extent = new ExtentReports("C:\\Users\\1024812\\Downloads\\Framework-master\\target\\cucumber-extent\\ExtentReport.html", true);
		test = extent.startTest("driverSetUp");
        test.log(LogStatus.INFO, "startTest() method will return the Extent Test object ");
        test.log(LogStatus.INFO, "I am in actual test method");
        test.log(LogStatus.INFO, "We Can Write The Actual Test Logic In This Test");
		
		this.scenario=scenario;
		System.out.println("********* Test Environment Setup *************");
		System.out.println("Executing the scenario " + scenario.getName());
		System.out.println("Chrome Browser Test Environment created");
		
		driver = BrowserFactory.getBrowser("Chrome");
		
		log.info("Launchig the Application");
		//driver.get("https://www.freecrm.com");
		//this will provide the URL from the config.properties file
		driver.get(DataProviderFactory.getConfig().getApplicationurl());
		
		log.info("Initializing the PageFactory");
		loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
		
		log.info("Maximising the browser");
		driver.manage().window().maximize();
		
	}
	
	@SuppressWarnings("static-access")
	@Before(order=2)
	public void CRMApplicationLogin(Scenario scenario) {
		
		
		log.info("Entering the username");
		loginpage.txtbx_UserName.sendKeys(DataProviderFactory.getConfig().getusername());
		
		log.info("Entering the password");
		loginpage.txtbx_Password.sendKeys(DataProviderFactory.getConfig().getpassword());
		//driver.findElement(By.name("username")).sendKeys("naveenk");
//		driver.findElement(By.name("password")).sendKeys("test@123");
		
		WebElement login=loginpage.btn_Login;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login);
		
		
	}
	
//	@Before(order=3)
//	 public WebDriver getDriver() {
//	      return driver;
//	   }
	
	@After(order=0)
	public void tearDown (Scenario scenario)throws Exception
	{
		scenario.write("Finished scenario");
		if (scenario.isFailed())
				{
					log.info(scenario.getName() + " is Failed ");
					final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png");
					//scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
				}
		System.out.println("Test Environment Destroyed ");
		System.out.println("----------------------------------------------------------------------");
		driver.close();
		driver.quit();
		
		extent.endTest(test);
        test.log(LogStatus.INFO, "endTest() method will stop capturing information about the test log");
        extent.flush();
        test.log(LogStatus.INFO, "flush() method of ExtentReports wil push/write everything to the document");
        test.log(LogStatus.INFO, "close() method will clear/close all resource of the ExtentReports object");
        extent.close();
        MyScreenRecorder.stopRecording();
	}

}
