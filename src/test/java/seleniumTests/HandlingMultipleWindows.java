package seleniumTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandlingMultipleWindows {

	public static void main(String[] args) {


		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		//		System.setProperty("webdriver.gecko.driver","C:\\Users\\1024812\\Desktop\\Selenium Data\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//		driver = new FirefoxDriver();

		//driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");

//		driver.manage().window().maximize();
//		
//		String parentWindowHandle=driver.getWindowHandle();
//		System.out.println("Current window is " + parentWindowHandle);
//		
//		WebElement newWindowBtn = driver.findElement(By.id("win1"));
//        newWindowBtn.click();
//        
//        Set<String> winHandles=driver.getWindowHandles();
//        for(String wintitle:winHandles) {
//        	System.out.println(wintitle);
//        	if(!wintitle.equals(parentWindowHandle)) {
//        		driver.switchTo().window(wintitle);
//        	}
//        }
        
        
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        
        String naukriparentWindowHandle=driver.getWindowHandle();
        System.out.println("Parent window of Naukri is " + naukriparentWindowHandle);
        
        Set<String> naukriwinhandle=driver.getWindowHandles();
        int childwindowsize=naukriwinhandle.size();
        
        for(String naukrichildwintitle: naukriwinhandle)
        {
        	System.out.println(naukrichildwintitle);
        }

	}

}
