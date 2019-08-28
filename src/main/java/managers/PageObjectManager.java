//package managers;
//
//import org.openqa.selenium.WebDriver;
//
//import pages.DealsPage;
//
//public class PageObjectManager {
//	
//	private WebDriver driver;
//	
//	private DealsPage dealspage;
//	
//	public PageObjectManager(WebDriver driver) {
//		 
//		 this.driver = driver;
//		 
//	}
//	
//	public DealsPage getHomePage(){
//		 
//		/*syntax of ternary operator
//		Ternary operator : Ternary operator is a shorthand version of if-else statement. It has three operands and hence the name ternary. General format is-
//		condition ? if true : if false
//		*/
//		 return (dealspage == null) ? dealspage = new DealsPage(driver) : dealspage;
//		 
//		 }
//
//}
