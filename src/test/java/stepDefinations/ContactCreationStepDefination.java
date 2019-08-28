package stepDefinations;



import java.util.Map;


import org.openqa.selenium.support.PageFactory;


import ImplementedClassLib.ActionControl;
import ImplementedClassLib.FrameControl;
import ImplementedClassLib.TextboxControl;
import ImplementedClassLib.WebElementControl;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactPage;
//import utilities.BaseClass;
import utilities.CucumberBaseClass;




public class ContactCreationStepDefination extends CucumberBaseClass{
	
	private CucumberBaseClass base;
	public ContactCreationStepDefination(CucumberBaseClass base)
	{
		this.base=base;
		
	}

	ContactPage contactpage=PageFactory.initElements(base.driver, ContactPage.class);
	
	ActionControl act=new ActionControl(base);
	WebElementControl wec=new WebElementControl();
	TextboxControl tc=new TextboxControl();	
	FrameControl fc=new FrameControl(base);
	

	@SuppressWarnings("static-access")
	@When("^User Navigates to New Contacts Page$")
	public void user_Navigates_to_New_Contacts_Page() throws Throwable {
		
		fc.switchToDefaultContent();
		fc.switchToFrame("mainpanel");
		//base.driver.switchTo().frame("mainpanel");
//		Actions action=new Actions(base.driver);
//		action.moveToElement(contactpage.btn_Contacts).build().perform();
		act.moveToElement(contactpage.btn_Contacts);
		//action.moveToElement(base.driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		wec.click(contactpage.btn_NewContact);
		//contactpage.btn_NewContact.click();
		//base.driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
	 
	}
//
	@SuppressWarnings("static-access")
	@Then("^User enters FirstName and LastName and Position details$")
	public void user_enters_FirstName_and_LastName_and_Position_details(DataTable ContactData) throws Throwable 
	{
	    fc.switchToDefaultContent();
		//base.driver.switchTo().defaultContent();
    	Thread.sleep(5000);
    	fc.switchToFrame("mainpanel");
    	//base.driver.switchTo().frame("mainpanel");
    	
    	for(Map<String,String> CData : ContactData.asMaps(String.class, String.class))
    	{
    		
    		tc.setText(contactpage.edit_FirstName, CData.get("FirstName"));
    		//contactpage.edit_FirstName.sendKeys(CData.get("FirstName"));
    		//base.driver.findElement(By.id("first_name")).sendKeys(CData.get("FirstName"));
        	
    		tc.setText(contactpage.edit_SurName, CData.get("LastName"));
    		//contactpage.edit_SurName.sendKeys(CData.get("LastName"));
    		//base.driver.findElement(By.id("surname")).sendKeys(CData.get("LastName"));
    		
    		tc.setText(contactpage.edit_Position, CData.get("Position"));
        	//contactpage.edit_Position.sendKeys(CData.get("Position"));
        	//base.driver.findElement(By.id("company_position")).sendKeys(CData.get("Position"));
    		
    		//wec.click(contactpage.btn_save);
        	//contactpage.btn_save.click();
        	//base.driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
    		
    	}
		
	}

	
	@Then("^User clicks on Save button$")
	public void user_clicks_on_Save_button() throws Throwable {
	    
		fc.switchToDefaultContent();
		fc.switchToFrame("mainpanel");
		wec.click(contactpage.btn_save);
		
		
	}
	
	
	
	
	@Then("^Contact Created$")
	public void contact_Created() throws Throwable {
		
		System.out.println("Contact created");
	   
	}


}
