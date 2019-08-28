//package ImplementedClassLib;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//import utilities.LoggerUtils;
//import interfaceLib.ICommonDriver;
//
////import utils.LoggerUtils;
//
//public class CommonDriver implements ICommonDriver {
//	
//	private WebDriver driver;
//	private long pageLoadTimeout;
//	private long elementDetectionTimeout;
//	public TakeScreenshot screenshot;
//
//	
//	public CommonDriver(String browserType) throws Exception{
//		
//		LoggerUtils.configLogger();		
//		browserType = browserType.trim();
//		
//		LoggerUtils.log.info("=======Starting Base Scenario Pack========");
//
//		
//		switch (browserType.toLowerCase()) {
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver","/Users/agnibhaghosh/Downloads/chromedriver");
//			driver = new ChromeDriver();
//			LoggerUtils.log.info("Chrome Browser is Initialised");
//			break;
//			
//		case "mozilla":
//			driver = new FirefoxDriver();
//			LoggerUtils.log.info("Firefox Browser is Initialised");
//			break;
//		
//		case "ie":	
//			System.setProperty("webdriver.ie.driver","");
//			driver = new InternetExplorerDriver();
//			LoggerUtils.log.info("IE Browser is Initialised");
//			break;
//
//		default:
//			LoggerUtils.log.error("Invalid Browser type : "+ browserType);
//			throw new Exception("Invalid Browser Type : "+ browserType);
//		}
//		
//		pageLoadTimeout = 60;
//		LoggerUtils.log.info("Setting default pageload time as "+pageLoadTimeout);
//		elementDetectionTimeout = 20;
//		LoggerUtils.log.info("Setting default implict wait time as "+ elementDetectionTimeout);
//	}
//
//	@Override
//	public void invokeBrowser(String url) throws Exception {
//		
//		driver.manage().window().maximize();
//		
//		//driver.manage().deleteAllCookies();
//		
//		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
//		
//		driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
//		
//		driver.get(url);
//		
//	}
//
//	@Override
//	public void setPageLoadTimeOut(long pageLoadTimeout) throws Exception {
//		
//		this.pageLoadTimeout = pageLoadTimeout;
//	}
//
//	@Override
//	public void setElementDetectionTimeout(long elementDetectionTimeout) throws Exception {
//		
//		this.elementDetectionTimeout = elementDetectionTimeout;
//	}
//	
//	public WebDriver getDriver() throws Exception{
//		return driver;
//	}
//
//	public TakeScreenshot getScreenshot() throws Exception{
//		screenshot=new TakeScreenshot(driver);
//		return screenshot;
//	
//	}
//	
//	@Override
//	public String getTitle() throws Exception {
//		
//		String titleOfThePage = driver.getTitle();
//		return titleOfThePage;
//	}
//
//	@Override
//	public void closeBrowser() throws Exception {
//		if(driver!=null){
//			driver.close();
//		}
//		
//	}
//
//	@Override
//	public void closeAllBrowser() throws Exception {
//		if(driver!=null){
//			driver.quit();
//		}
//		
//	}
//
//	@Override
//	public void naviagteToUrl(String url) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void naviagteBack(String url) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void naviagteForward(String url) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void reloadpage(String url) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
