package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingWebDriverWithoutExeFile {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//to launch chrome  driver
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//To launch Firefox driver
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		
		//To launch operadriver
		//WebDriverManager.operadriver().setup();
		//driver=new OperaDriver();
		
		//To launch phantomjs driver
		//WebDriverManager.phantomjs().setup();
		//driver=new PhantomJSDriver();
		
		//To launch edgedriver
		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
		
		//To launch iedriver
		//WebDriverManager.iedriver().setup();
		//driver=new InternetExplorerDriver();
		
		
//		*****************************************************
		
//		If you want to use specific version of the browser then you have to provide the below
//		WebDriverManager.chromedriver().version("2.26").setup();
		
// 		If you want to use 32 bit version of Gecko driver
//		WebDriverManager.firefoxdriver().arch32().setup();
		
		
		
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		
		System.out.println("********* Title is ********* " + title);
		
		driver.quit();
		

	}

}
