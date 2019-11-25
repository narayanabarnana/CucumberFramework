package seleniumTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandlingFrames {

	public static void main(String[] args) {


		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		//		System.setProperty("webdriver.gecko.driver","C:\\Users\\1024812\\Desktop\\Selenium Data\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//		driver = new FirefoxDriver();

		driver.get("https://www.softwaretestinghelp.com/");

		driver.manage().window().maximize();
		

		List<WebElement> iFrameElements=driver.findElements(By.tagName("iFrame"));
		System.out.println("The total number of iframes are " + iFrameElements.size());
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("test");
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		driver.switchTo().defaultContent();

	}

}
