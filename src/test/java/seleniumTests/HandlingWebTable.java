package seleniumTests;

import java.util.List;

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
		
		driver.get("http://md1npdtest15:4391/jda/shell/");
		
		WebDriverWait waitele=new WebDriverWait(driver, 60);
		waitele.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loginBox']//input[@name='USER_NAME']")));
		
		WebElement username=driver.findElement(By.xpath("//div[@id='loginBox']//input[@name='USER_NAME']"));
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.xpath("//div[@id='loginBox']//input[@name='PASSWORD']"));
		password.sendKeys("Standard1$");
		
		WebElement loginbutton=driver.findElement(By.xpath("//div[@id='loginBox']//span[@class='loginInner']"));
		loginbutton.click();
		
		driver.manage().window().maximize();
		
		
		//span[@class='navToggle expanded']
		//WebElement ToggleExpand=driver.findElement(By.xpath("//span[@class='navToggle expanded']"))
		
		//a//span[@title='S&OP']/preceding-sibling::span
		
		WebElement SOPExpand=driver.findElement(By.xpath("//a//span[@title='S&OP']/preceding-sibling::span"));
		String ExpandAttributeValue=SOPExpand.getAttribute("class");
		System.out.println(ExpandAttributeValue);
		
		if(ExpandAttributeValue.contains("collapsed"))
		{
			WebElement SOPMenu=driver.findElement(By.xpath("//span[@title='S&OP']"));
			SOPMenu.click();
		}
		else {
			
			System.out.println("The S&OP Menu is already Expanded");
		}
		
		
		WebElement BPExpand=driver.findElement(By.xpath("//a//span[@title='Business Process']/preceding-sibling::span"));
		String BPExpandAttributeValue=BPExpand.getAttribute("class");
		System.out.println(BPExpandAttributeValue);
		
		if(BPExpandAttributeValue.contains("collapsed"))
		{
			WebElement SOPMenu=driver.findElement(By.xpath("//span[@title='Business Process']"));
			SOPMenu.click();
		}
		else {
			
			System.out.println("The S&OP Menu is already Expanded");
		}
		
		
		WebElement Layout=driver.findElement(By.xpath("//*[@title='Layout']"));
		Layout.click();
		
		System.out.println("Clicked on Layout");
		
		/*
		 * Handling Frames: Using Index, Name or Id, or WebElement
		 * driver.switchTo().defaultContent();
		 * driver.switchTo().frame("appFrame"); --using name
		 * driver.switchTo().parentFrame();  -- changes focus to the parent frame
		 */
		
		WebElement framename=driver.findElement(By.xpath("//iframe[@id='appFrame']"));
		driver.switchTo().frame(framename);
		
		System.out.println("Identified the frame");
		
		
		
		WebElement LayoutHeaderName=driver.findElement(By.xpath("//*[@class='pageTitle']"));
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(LayoutHeaderName));
		
		
		WebElement SDMLayoutSpec=driver.findElement(By.xpath("//table[@id='SDMLAYOUT_SPEC']/tbody"));
		List<WebElement> rows=SDMLayoutSpec.findElements(By.tagName("tr"));
		
		System.out.println("Number of rows " + rows.size());
		
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
