package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.CucumberBaseClass;
import utilities.TestBase;

public class LoginPage extends CucumberBaseClass{
	
	//final WebDriver driver;
	//Initializing the Page Objects:
//		public LoginPage(WebDriver driver)
//		{
//			//this.driver=driver;
//			PageFactory.initElements(driver, this);
//		}
	
	
	
	@FindBy(how = How.NAME, using = "username")
	public static WebElement txtbx_UserName;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement txtbx_Password;
	
	@FindBy(how = How.XPATH,using="//input[@type='submit']")
	public static WebElement btn_Login;
	

	
	@FindBy(how =How.XPATH,using="//button[contains(text(),'Sign Up')]")
	public static WebElement btn_SignUp;
	
	@FindBy(how =How.XPATH,using="//img[contains(@class,'img-responsive')]")
	public static WebElement img_CRMLogo;
	
	
	
	
		
		//Actions:
//		public String validateLoginPageTitle(){
//			return driver.getTitle();
//		}
		
		public boolean validateCRMImage(){
			return img_CRMLogo.isDisplayed();
		}
		
		
		public static void FreeCRMLogin(String user, String Password){
			
			txtbx_UserName.sendKeys(user);
			txtbx_Password.sendKeys(Password);
			btn_Login.click();
		}
		
		
	
}
