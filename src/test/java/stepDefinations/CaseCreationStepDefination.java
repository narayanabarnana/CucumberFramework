//package stepDefinations;
//
//import java.util.Map;
//
//import org.apache.log4j.Logger;
//
//import org.junit.Assert;
//
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Then;
//import pages.CasesPage;
//import pages.ContactPage;
//import utilities.CucumberBaseClass;
//import utilities.LoggerHelper;
//
//public class CaseCreationStepDefination extends CucumberBaseClass{
//	
//	private CucumberBaseClass base;
//	public CaseCreationStepDefination(CucumberBaseClass base)
//	{
//		this.base=base;
//		
//	}
//	
//	public static CasesPage casepage;
//	
//	Logger log=LoggerHelper.getLogger(CaseCreationStepDefination.class);
//	
//	@SuppressWarnings("static-access")
//	@Then("^User Navigate to New CaseCreation Page$")
//	public void user_Navigate_to_New_CaseCreation_Page() throws Throwable {
//	   
//		
//		casepage=PageFactory.initElements(base.driver, CasesPage.class);
//		
//		base.driver.switchTo().frame("mainpanel");
//		Actions action=new Actions(base.driver);
//		action.moveToElement(casepage.btn_Cases).build().perform();
//		
//		casepage.btn_NewCase.click();
//		
//		
//	}
//
//	@SuppressWarnings("static-access")
//	@Then("^User enters Case creation details$")
//	public void user_enters_Case_creation_details(DataTable CaseCreationData) throws Throwable {
//	    
//		
//		base.driver.switchTo().defaultContent();
//    	Thread.sleep(5000);
//    	base.driver.switchTo().frame("mainpanel");
//    	
//    	for(Map<String,String> CData : CaseCreationData.asMaps(String.class, String.class))
//    	{
//    		
//    		casepage.edit_CaseTitle.sendKeys(CData.get("title"));
//    		//base.driver.findElement(By.id("first_name")).sendKeys(CData.get("FirstName"));
//        	
//    		casepage.edit_CaseDescription.sendKeys(CData.get("description"));
//    		
//
//    		//Assert.assertTrue(false);
//    		
//
//    		//casepage.edit_version.sendKeys(CData.get("version"));
//    		
//    		//casepage.btn_UploadFile.click();
//    		
//    		//Runtime.getRuntime().exec("C:\\Users\\Narayana\\Desktop\\AutoIt Files\\CRMFileUpload.exe");
//    		
//    	}
//		
//		
//		
//	}
//	
//
//}
