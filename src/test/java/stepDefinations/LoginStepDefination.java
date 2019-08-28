//package stepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefination {
//	
//	
////	WebDriver driver;
////	
////	@Given("^User is on Login Page$")
////	public void user_is_on_Login_Page() throws Throwable {
////	    ;
////		System.setProperty("webdriver.chrome.driver", "E:\\Latest Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
////		driver=new ChromeDriver();
////		driver.get("https://www.freecrm.com");
////	}
////
////	@When("^Title of the page is freeCRM$")
////	public void title_of_the_page_is_freeCRM() throws Throwable {
////		
////		String title=driver.getTitle();
////		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
////	    
////	}
////	
////	/*
////
////	@Then("^User enter username and password$")
////	public void user_enter_username_and_password() throws Throwable {
////	   
////		driver.findElement(By.name("username")).sendKeys("naveenk");
////		driver.findElement(By.name("password")).sendKeys("test@123");
////	}
////	*/
////	
////	@Then("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
////    public void user_enter_something_and_something(String username, String password) throws Throwable {
////        //throw new PendingException();
////		driver.findElement(By.name("username")).sendKeys(username);
////		driver.findElement(By.name("password")).sendKeys(password);
////    }
////
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
////	@Then("^User move to New Contact Page$")
////    public void user_move_to_new_contact_page() throws Throwable {
////        
////		driver.switchTo().frame("mainpanel");
////		Actions action=new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
////		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
////		
////		
////    }
////
////	/*
////    @Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
////    public void user_enters_something_and_something_and_something(String firstname, String lastname, String position) throws Throwable {
////        //throw new PendingException();
////    	
////    	driver.switchTo().defaultContent();
////    	Thread.sleep(5000);
////    	driver.switchTo().frame("mainpanel");
////    	driver.findElement(By.id("first_name")).sendKeys(firstname);
////    	//driver.findElement(By.name("first_name")).sendKeys(firstname);
////    	//WebElement fn=driver.findElement(By.xpath("//input[@name='first_name']"));
////    	//JavascriptExecutor js1 = (JavascriptExecutor)driver;
////		//js1.executeScript("arguments[0].sendKeys(firstname);", fn);
////    	
////    	
////    	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
////    	driver.findElement(By.id("surname")).sendKeys(lastname);
////    	driver.findElement(By.id("company_position")).sendKeys(position);
////    	driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
////    }
////    
////    */
////	
////	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
////	public void user_enters_and_and(String firstname, String lastname, String position) throws Throwable {
////	    
////		
////		driver.switchTo().defaultContent();
////    	Thread.sleep(5000);
////    	driver.switchTo().frame("mainpanel");
////    	driver.findElement(By.id("first_name")).sendKeys(firstname);
////    	
////    	driver.findElement(By.id("surname")).sendKeys(lastname);
////    	driver.findElement(By.id("company_position")).sendKeys(position);
////    	driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
////		
////		
////	}
////	
////	@Then("^Close the browser$")
////    public void close_the_browser() throws Throwable {
////        driver.quit();
////    }
////
////	
////
//}
