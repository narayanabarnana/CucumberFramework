package seleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSSelector {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		driver.manage().window().maximize();
		
		WebElement bicyclecheckbox=driver.findElement(By.cssSelector("input[id='bicycle-checkbox'][name='vehicle1']"));
		bicyclecheckbox.click();
		
		boolean checkoruncheck=bicyclecheckbox.isSelected();
		
		if(checkoruncheck)
		{
			System.out.println("Checkbox is selected");
		}
		else {
			System.out.println("Checkbox not selected");
		}
		
		
		//CSS Using contains
		//Syntax- tagname[attribute*='value']
		WebElement tricyclecheckbox=driver.findElement(By.cssSelector("input[id*='tricycle']"));
		tricyclecheckbox.click();
		
		//CSS using starts with
		//Syntax - tagname[attribute^='value']
		WebElement bikecheckbox=driver.findElement(By.cssSelector("input[id^='bike']"));
		bikecheckbox.click();
		
		
		//CSS using id
		//Syntax - tagname#id eg: input#tricycle-checkbox
		
		//CSS uisng classname
		//Syntax - tagname.class 
		
		//CSS using tagname and attribute
		//Syntax - tagname[attribute='value']
		
		//CSS using tagname and MULTIPLE attribute
		//Syntax - tagname[attribute1='value1'][attribute2='value2']
		
		//CSS Using contains
		//Syntax- tagname[attribute*='value']
		
		//CSS using starts with
		//Syntax - tagname[attribute^='value']
		
		//CSS using ends with
		//Syntax - tagname[attribute$='value']
		
		
		

	}

}
