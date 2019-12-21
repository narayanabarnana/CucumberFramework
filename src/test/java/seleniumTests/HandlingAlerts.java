package seleniumTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");

		driver.manage().window().maximize();
		
		
		/*
		3 types of alert boxes
			1)simple alert box which contains only ok button
			2)confirmation alert box which contains ok and cancel
			3)Prompt alert box which asks to enter text
		*/
		WebElement alertbox=driver.findElement(By.cssSelector("button#alertBox"));
		alertbox.click();
		
		Alert alt=driver.switchTo().alert();
		String alerttext=alt.getText();
		System.out.println(" Alert text is " + alerttext);
		alt.accept();
		
		WebElement confalertbox=driver.findElement(By.cssSelector("button#confirmBox"));
		confalertbox.click();
		alt.accept();
	//  alt.dismiss();
		
		WebElement promptalertbox=driver.findElement(By.cssSelector("button[id*='prompt']"));
		promptalertbox.click();
		
		promptalertbox.sendKeys("Hello World");
		Thread.sleep(10000);
		alt.accept();
        

	}

}
