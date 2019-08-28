package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserFactory {
	
	
	public static WebDriver driver;
	 public BrowserFactory(WebDriver driver){
		 this.driver=driver;
	 }
	
	public static WebDriver getBrowser(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			//ConfigDataProvider config=new ConfigDataProvider();
			//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("test-type");
			//capabilities.setCapability("chrome.binary", "<Path to binary>");
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			//System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
			//driver = new ChromeDriver(capabilities);

			
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
			driver=new ChromeDriver();
			
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
			
			

//			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
//			driver=new ChromeDriver();

		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			//ConfigDataProvider config=new ConfigDataProvider();
			DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
	        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	        System.setProperty("webdriver.ie.driver", DataProviderFactory.getConfig().getIEPath());
	        //System.setProperty("webdriver.ie.driver", "D:\\Selenium Drivers\\IEDriverServer.exe");
	        //WebDriver driver =  new InternetExplorerDriver(cap);
	        driver =  new InternetExplorerDriver(cap);
	        System.out.println("***************Browser Started*********************");
			
			
			
			//driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
	
	
	
	

}
