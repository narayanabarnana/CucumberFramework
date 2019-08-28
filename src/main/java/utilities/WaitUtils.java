package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	
	private static WebDriverWait getWait(WebDriver driver, long timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		return wait;
	}
	
	public static void waitTillAlertIsPresent(WebDriver driver, long timeOutInSeconds ){
		
		getWait(driver, timeOutInSeconds).until(ExpectedConditions.alertIsPresent());
	}
	
	public static void waitTillElementVisible(WebDriver driver, long timeOutInSeconds, WebElement element ){
		
		getWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOf(element));
	}
	
	

}
