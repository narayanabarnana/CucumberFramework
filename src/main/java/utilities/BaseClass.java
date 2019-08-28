//package utilities;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
////import cucumber.api.java.Before;
//import factory.BrowserFactory;
//import factory.DataProviderFactory;
//import pages.LoginPage;
//
//public class BaseClass {
//	
//	private WebDriver driver;
//	public static ExtentReports extent;
//	public static ExtentTest logger;
//	public static ExtentHtmlReporter htmlReporter;
//	
//	 public WebDriver getDriver() {
//	      return driver;
//	   }
//	public void setUP()
//	{
//		
//		logger = extent.createTest("AppOrangeHRMLogin");
//		//this will automatically opens the browser, maximize the browser
//		driver = BrowserFactory.getBrowser("Chrome");
//										
//		//this will provide the URL from the config.properties file
//		driver.get(DataProviderFactory.getConfig().getApplicationurl());
//								
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
//		
//		LoginPage.FreeCRMLogin(DataProviderFactory.getConfig().getusername(), DataProviderFactory.getConfig().getpassword());
//		
//		
//	}
//
//}
