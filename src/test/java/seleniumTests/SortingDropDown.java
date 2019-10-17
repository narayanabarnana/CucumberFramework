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


public class SortingDropDown {

	public static void main(String[] args) {


		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		//		System.setProperty("webdriver.gecko.driver","C:\\Users\\1024812\\Desktop\\Selenium Data\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//		driver = new FirefoxDriver();

		driver.get("https://classic.crmpro.com/index.html");

		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("narayanabarnana");

		driver.findElement(By.name("password")).sendKeys("Automation@009");



		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login);

		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Call')]"))).build().perform();

		driver.findElement(By.xpath("//a[contains(text(),'New Call')]")).click();

		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@name='callForm']//select[@name='flag']")));

		//		Select sel=new Select(driver.findElement(By.xpath("//form[@name='callForm']//select[@name='flag']")));
		//		List<WebElement> ele=sel.getOptions();
		//		System.out.println("number of elements in the drop down list are " + ele.size());
		//		for(int i =0; i<ele.size() ; i++){
		//			String sValue = ele.get(i).getText();
		//			System.out.println("The dropdown value is " + sValue);
		//		}


		Select sel=new Select(driver.findElement(By.xpath("//form[@name='callForm']//select[@name='flag']")));
		sel.selectByIndex(0);
		sel.selectByValue("");
		sel.selectByVisibleText("");

		//Get all options from the dropdown
		List<WebElement> allOptions=sel.getOptions();

		//creating a list to store dropdown options
		List<String> storeOptions=new ArrayList<String>();

		//Storing in a list
		for(WebElement optionElement : allOptions)
		{
			storeOptions.add(optionElement.getText());
		}		

		//HEre in the dropdown the first option is space so i am removing that as it is not an option
		storeOptions.remove("");

		//if Select is the first option. Remove "Select" option as it is not actual option
		//storeOptions.remove("Select");

		// Default order of option in drop down
		System.out.println("Options in dropdown with Default order :"+storeOptions);

		// Creating a temp list to sort
		List<String> tempList = new ArrayList<String>(storeOptions);

		// Sort list ascending
		Collections.sort(tempList);
		System.out.println("Sorted List "+ tempList);


		// equals() method checks for two lists if they contain the same elements in the same order.
		boolean ifSortedAscending = storeOptions.equals(tempList);

		if(ifSortedAscending)
		{
			System.out.println("List is sorted");
		}
		else
			System.out.println("List is not sorted.");

	}

}
