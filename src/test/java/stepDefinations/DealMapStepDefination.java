package stepDefinations;

import java.util.Map;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;

import ImplementedClassLib.ActionControl;
import ImplementedClassLib.TextboxControl;
import ImplementedClassLib.WebElementControl;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CallPage;
//import managers.PageObjectManager;
import pages.DealsPage;
import utilities.CucumberBaseClass;
import utilities.WaitUtils;

public class DealMapStepDefination {
	
	private CucumberBaseClass base;
	public DealMapStepDefination(CucumberBaseClass base)
	{
		this.base=base;
		
		
	}
	
	
	DealsPage dealspage;
	
	
	ActionControl act=new ActionControl(base);
	WebElementControl wec=new WebElementControl();
	TextboxControl tc=new TextboxControl();	
	
	
	
	@Given("^User is on CRMHomePage$")
	public void user_is_on_CRMHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(CucumberBaseClass.driver);   //Getting null pointer exception
		
		dealspage=PageFactory.initElements(base.driver, DealsPage.class);
		System.out.println("User is on CRMHomePage");
	}
	
	
	
	@Then("^User move to New Deal Page$")
	public void user_move_to_New_Deal_Page() throws Throwable {
		
		System.out.println(base.driver);
		//pageObjectManager = new PageObjectManager(driver);
		base.driver.switchTo().frame("mainpanel");
		act.moveToElement(dealspage.btn_Deals);
		wec.click(dealspage.btn_NewDeal);
		//Actions action=new Actions(driver);
		//action.moveToElement(base.driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		///base.driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	    
	}

	@Then("^User enters deals details$")
	public void user_enters_deals_details(DataTable DealData) throws Throwable {
		
		
		base.driver.switchTo().defaultContent();
		base.driver.switchTo().frame("mainpanel");
    	//driver.findElement(By.id("title")).sendKeys(DealData.get(0).get(0));
    	
    	for(Map<String,String> DDData : DealData.asMaps(String.class, String.class))
		{
    		
    		base.driver.switchTo().defaultContent();
    		base.driver.switchTo().frame("mainpanel");
    		Thread.sleep(2000);
    		
    		WaitUtils.waitTillElementVisible(base.driver, 60, dealspage.editbox_Title);
    		
    		
    		
//    		WebDriverWait wait=new WebDriverWait(driver,60);
//        	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("title")));
    		
    		String dealno=wec.getAttribute(dealspage.editbox_DealNo, "value");
        	System.out.println("Deal number before creating is " + dealno);
        	
        	
    		tc.setText(dealspage.editbox_Title, DDData.get("title"));
    		tc.setText(dealspage.editbox_amount, DDData.get("Amount"));
    		tc.setText(dealspage.editbox_probability, DDData.get("Probability"));
    		tc.setText(dealspage.editbox_commission, DDData.get("Commission"));
        	
    		wec.click(dealspage.btn_Save);
    		//driver.findElement(By.id("title")).sendKeys(DDData.get("title"));
    		//driver.findElement(By.id("amount")).sendKeys(DDData.get("Amount"));
    		//driver.findElement(By.id("probability")).sendKeys(DDData.get("Probability"));
    		//driver.findElement(By.id("commission")).sendKeys(DDData.get("Commission"));
        	
    		//driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
        	
        	Thread.sleep(10000);
        	base.driver.switchTo().defaultContent();
        	base.driver.switchTo().frame("mainpanel");
        	
        	//wait=new WebDriverWait(driver,30);
        	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Deals']")));
            
        	WaitUtils.waitTillElementVisible(base.driver, 60, dealspage.btn_Deals);
        	act.moveToElement(dealspage.btn_Deals);
    		wec.click(dealspage.btn_NewDeal);
    		//Actions action=new Actions(driver);
    		//action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
    		//driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
    		
			
		}
    	
	 
	}
	
	@Then("^Close the browser$")
    public void close_the_browser() throws Throwable {
//        driver.quit();
    }


	@Then("^Deal Created Succesfully$")
	public void deal_Created_Succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Deal Created Succesfully");
	}
	

}
