//package stepDefinations;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//
//public class HooksStepDefination {
//	
//	
//	//Global Hooks which executes before for ever scenario
//	@Before
//	public void setUP()
//	{
//		System.out.println("Before");
//		System.out.println("Application Login");
//		
//	}
//	
//	//Global Hooks which executes after for ever scenario
//	@After
//	public void tearDown()
//	{
//		System.out.println("After");
//		System.out.println("Application Logout and Driver close");
//	}
//	
//	
//	
//	@Given("^User is on Deal page$")
//	public void user_is_on_Deal_page() throws Throwable {
//	    
//		System.out.println("Deal Page");
//	}
//
//	@Given("^User is on Contact Page$")
//	public void user_is_on_Contact_Page() throws Throwable {
//	    
//		System.out.println("Contact Page");
//		
//		
//	}
//
//	@Given("^User is on Email page$")
//	public void user_is_on_Email_page() throws Throwable {
//	    
//		System.out.println("Email Page");
//	}
//
//}
