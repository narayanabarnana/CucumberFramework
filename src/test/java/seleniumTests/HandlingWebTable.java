package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DataProviderFactory;
import utilities.Highlight;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\1024812\\Desktop\\Selenium Data\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
		
		driver.get("http://localhost:9001/jda/shell/home");
		
		WebDriverWait waitele=new WebDriverWait(driver, 60);
		waitele.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loginBox']//input[@name='USER_NAME']")));
		
		WebElement username=driver.findElement(By.xpath("//div[@id='loginBox']//input[@name='USER_NAME']"));
		Highlight.highLightElement(driver, username);
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.xpath("//div[@id='loginBox']//input[@name='PASSWORD']"));
		Highlight.highLightElement(driver, password);
		password.sendKeys("Standard1$");
		
		WebElement loginbutton=driver.findElement(By.xpath("//div[@id='loginBox']//span[@class='loginInner']"));
		Highlight.highLightElement(driver, loginbutton);
		loginbutton.click();
		
		driver.manage().window().maximize();
		
		
		//span[@class='navToggle expanded']
		//WebElement ToggleExpand=driver.findElement(By.xpath("//span[@class='navToggle expanded']"))
		
		//a//span[@title='S&OP']/preceding-sibling::span
		
		WebElement SOPExpand=driver.findElement(By.xpath("//a//span[@title='S&OP']/preceding-sibling::span"));
		Highlight.highLightElement(driver, SOPExpand);
		String ExpandAttributeValue=SOPExpand.getAttribute("class");
		System.out.println(ExpandAttributeValue);
		
		if(ExpandAttributeValue.contains("collapsed"))
		{
			WebElement SOPMenu=driver.findElement(By.xpath("//span[@title='S&OP']"));
			Highlight.highLightElement(driver, SOPMenu);
			SOPMenu.click();
		}
		else {
			
			System.out.println("The S&OP Menu is already Expanded");
		}
		
		
		WebElement BPExpand=driver.findElement(By.xpath("//a//span[@title='Business Process']/preceding-sibling::span"));
		Highlight.highLightElement(driver, BPExpand);
		String BPExpandAttributeValue=BPExpand.getAttribute("class");
		System.out.println(BPExpandAttributeValue);
		
		if(BPExpandAttributeValue.contains("collapsed"))
		{
			WebElement BPMenu=driver.findElement(By.xpath("//span[@title='Business Process']"));
			Highlight.highLightElement(driver, BPMenu);
			BPMenu.click();
		}
		else {
			
			System.out.println("The S&OP Menu is already Expanded");
		}
		
		
		WebElement Layout=driver.findElement(By.xpath("//*[@title='Layout']"));
		Highlight.highLightElement(driver, Layout);
		Layout.click();
		
		System.out.println("Clicked on Layout");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 * Handling Frames: Using Index, Name or Id, or WebElement
		 * driver.switchTo().defaultContent();
		 * driver.switchTo().frame("appFrame"); --using name
		 * driver.switchTo().parentFrame();  -- changes focus to the parent frame
		 */
		//Highlight.highLightElement(driver, framename);
		
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println("Number of Frames in a web page are " + frame.size());
		
		for(WebElement el: frame)
		{
			System.out.println(" Frame number " + el.getAttribute("name"));
		}
		driver.switchTo().defaultContent();
		WebElement framename=driver.findElement(By.xpath("//iframe[@id='appFrame']")); ////
		
		 driver.switchTo().frame(framename);
		 
		 		
		System.out.println("Identified the frame");
		
		//Highlight.highLightElement(driver, framename);
		
		System.out.println("Frame Highlighted");
		
		//driver.navigate().refresh();
		WebElement Add = driver.findElement(By.xpath("//*[@id='ADD']"));
	    Add.click();
		
//		for(int i=0;i<=2;i++)
//		{
//			try {
//			    WebElement Add = driver.findElement(By.xpath("//*[@id=\'ADD\']/span"));
//			    Add.click();
//			    break;
//			}
//			catch(org.openqa.selenium.StaleElementReferenceException ex)
//			{
//				WebElement Add = driver.findElement(By.xpath("//*[@id=\'ADD\']/span"));
//			    Add.click();
//			    break;
//			}
//		}
		
		
		//waitele.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'ADD\']/span")));
		
		//driver.findElement(By.xpath("//*[@id=\'ADD\']/span")).click();
		
		//driver.findElement(By.xpath("//*[@id=\'ADD\']/span")).click();
	
		//WebElement LayoutHeaderName=driver.findElement(By.xpath("//div[@id='SDMLAYOUT_SPEC']"));
		
		//WebDriverWait wait=new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.visibilityOf(LayoutHeaderName));
		
		
//		WebElement SDMLayoutSpec=driver.findElement(By.xpath("//table[@id='SDMLAYOUT_SPEC']/tbody"));
//		List<WebElement> rows=SDMLayoutSpec.findElements(By.tagName("tr"));
//		
//		System.out.println("Number of rows " + rows.size());
		
		
		
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
