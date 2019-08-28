package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DataProviderFactory;

public class HandlingWebTable {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
		driver=new ChromeDriver();
		
		driver.get("http://localhost:9001/jda/shell/home");
		
		WebDriverWait waitele=new WebDriverWait(driver, 60);
		waitele.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loginBox']//input[@name='USER_NAME']")));
		
		WebElement username=driver.findElement(By.xpath("//div[@id='loginBox']//input[@name='USER_NAME']"));
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.xpath("//div[@id='loginBox']//input[@name='PASSWORD']"));
		password.sendKeys("Standard1$");
		
		WebElement loginbutton=driver.findElement(By.xpath("//div[@id='loginBox']//span[@class='loginInner']"));
		loginbutton.click();
		
		driver.manage().window().maximize();
		
		
		//clicking on S&OP
		System.out.println("******Clicking on S&OP Menu on the left navigation******");
		WebElement SOPMenu=driver.findElement(By.xpath("//a//span[@title='S&OP']"));
		SOPMenu.click();
		System.out.println("Clicked Succesfully on S&OP Menu on the left navigation");
		
		
		//waitele.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		//***************Logout Code*************
//		WebElement userprofilemenu=driver.findElement(By.xpath("//img[@id='shellUsername']"));
//		userprofilemenu.click();
//		
//		WebElement logoutbutton=driver.findElement(By.xpath("//div[@class='userMenu open']//div[@id='shellLogoutAction']"));
//		waitele.until(ExpectedConditions.visibilityOf(logoutbutton));
//		
//		logoutbutton.click();
//		
//		WebElement logoutmessage=driver.findElement(By.xpath("//span[@class='loginError']"));
//		waitele.until(ExpectedConditions.visibilityOf(logoutmessage));
//		
//		String message=logoutmessage.getText();
//		System.out.println(message);
		
		//**********************************************************
		
		//driver.quit();
		
		
		
		
		
		
		

	}

}
