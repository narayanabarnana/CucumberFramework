//package stepDefinations;
//
//import java.util.Map;
//
//import cucumber.api.java.en.Then;
//import pages.ContactPage;
//import utilities.CucumberBaseClass;
//
//public class CreateContactStepDefination extends CucumberBaseClass{
//	
//	
//	private CucumberBaseClass base;
//	public CreateContactStepDefination(CucumberBaseClass base)
//	{
//		this.base=base;
//		
//	}
//	
//	public static ContactPage contactpage;
//	
//
//	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and_and(String FirstName, String LastName, String Position) throws Throwable {
//	    
//	
//		base.driver.switchTo().defaultContent();
//    	Thread.sleep(5000);
//    	base.driver.switchTo().frame("mainpanel");
//    	
//    	
//    		
//    		contactpage.edit_FirstName.sendKeys(FirstName);
//    		//base.driver.findElement(By.id("first_name")).sendKeys(CData.get("FirstName"));
//        	
//    		contactpage.edit_SurName.sendKeys(LastName);
//    		//base.driver.findElement(By.id("surname")).sendKeys(CData.get("LastName"));
//    		
//        	contactpage.edit_Position.sendKeys(Position);
//        	//base.driver.findElement(By.id("company_position")).sendKeys(CData.get("Position"));
//    		
//        	contactpage.btn_save.click();
//        	//base.driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//    		
//    		
//	
//	
//	
//	
//	}
//	
//
//}
