//package stepDefinations;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealCreationStepDefination {
//	
////	WebDriver driver;
////	
////	@Given("^User is on Login Page$")
////	public void user_is_on_Login_Page() throws Throwable {
////	    
////		System.setProperty("webdriver.chrome.driver", "E:\\Latest Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
////		driver=new ChromeDriver();
////		driver.get("https://www.freecrm.com");
////	}
////
////	@When("^Title of the page is freeCRM$")
////	public void title_of_the_page_is_freeCRM() throws Throwable {
////		
////		String title=driver.getTitle();
////		//Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
////	    
////	}
////	
////	@Then("^User enter username and password$")
////	public void user_enter_username_and_password(DataTable UserCredentials) throws Throwable {
////	  	
////		List<List<String>> CredData=UserCredentials.raw();
////		
////		
////		//Row 0 and Column 0 : CredData.get(0).get(0);
////		//Row 0 and Column 1 : CredData.get(0).get(1);
////		
////		driver.findElement(By.name("username")).sendKeys(CredData.get(0).get(0));
////		driver.findElement(By.name("password")).sendKeys(CredData.get(0).get(1));
////	}
////	
////	@Then("^User clicks on Login button$")
////	public void user_clicks_on_Login_button() throws Throwable {
////		
////		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].click();", login);
////		
////	
////	}
////	
////	@Then("^User is on Home page$")
////	public void User_is_on_Home_page() throws Throwable {
////		
////		String Hometitle=driver.getTitle();
////		System.out.println("Home title is "+ Hometitle);
////		Assert.assertEquals("CRMPRO", Hometitle);
////		
////	
////	}
////	
////	@Then("^User move to New Deal Page$")
////	public void user_move_to_New_Deal_Page() throws Throwable {
////		
////		driver.switchTo().frame("mainpanel");
////		Actions action=new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
////		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
////	    
////	}
////
////	@Then("^User enters deals details$")
////	public void user_enters_deals_details(DataTable dd) throws Throwable {
////		
////		List<List<String>> DealData=dd.raw();
////		
////		//DealData.get(0).get(0)
////		
////		driver.switchTo().defaultContent();
////    	Thread.sleep(5000);
////    	driver.switchTo().frame("mainpanel");
////    	driver.findElement(By.id("title")).sendKeys(DealData.get(0).get(0));
////    	
////    	driver.findElement(By.id("amount")).sendKeys(DealData.get(0).get(1));
////    	driver.findElement(By.id("probability")).sendKeys(DealData.get(0).get(2));
////    	driver.findElement(By.id("commission")).sendKeys(DealData.get(0).get(3));
////    	driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
////	 
////	}
////	
////	@Then("^Close the browser$")
////    public void close_the_browser() throws Throwable {
////        driver.quit();
////    }
////
//
//}
