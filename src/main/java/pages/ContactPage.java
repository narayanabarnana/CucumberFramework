package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.CucumberBaseClass;

public class ContactPage extends CucumberBaseClass{
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contacts')]")
	public static WebElement btn_Contacts;
	
	////a[contains(text(),'New Contact')]
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Contact')]")
	public static WebElement btn_NewContact;
	
	
	@FindBy(how = How.XPATH, using = "//select[@name='title']")
	public static WebElement dropdown_Title;
	
	@FindBy(how = How.XPATH, using = "//input[@name='first_name' and @id='first_name']")
	public static WebElement edit_FirstName;

	@FindBy(how = How.XPATH, using = "//input[@name='middle_initial' and @id='middle_initial']")
	public static WebElement edit_MiddleName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='surname' and @id='surname']")
	public static WebElement edit_SurName;
	
	@FindBy(how = How.XPATH, using = "//select[@name='suffix']")
	public static WebElement dropdown_suffix;
	
	@FindBy(how = How.XPATH, using = "//input[@name='nickname']")
	public static WebElement edit_NickName;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='client_lookup']")
	public static WebElement edit_Company;
	
	////input[@name='company_position']
	@FindBy(how = How.XPATH, using = "//input[@name='company_position']")
	public static WebElement edit_Position;
	
	@FindBy(how = How.XPATH, using = "//input[@name='department']")
	public static WebElement edit_department;
	
	@FindBy(how = How.XPATH, using = "//input[@name='contact_lookup_sup']")
	public static WebElement edit_Supervisor;
	
	@FindBy(how = How.XPATH, using = "//input[@name='contact_lookup_ass']")
	public static WebElement edit_Assistant;
	
	@FindBy(how = How.XPATH, using = "//input[@name='contact_lookup_ref']")
	public static WebElement edit_ReferredBy;
	
	@FindBy(how = How.XPATH, using = "//select[@name='category']")
	public static WebElement dropdown_Category;
	
	@FindBy(how = How.XPATH, using = "//select[@name='status']")
	public static WebElement dropdown_Status;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='phone' and @id='phone']")
	public static WebElement edit_Phone;
	
	@FindBy(how = How.XPATH, using = "//input[@name='mobile' and @id='mobile']")
	public static WebElement edit_Mobile;
	
	@FindBy(how = How.XPATH, using = "//input[@name='home_phone' and @id='home_phone']")
	public static WebElement edit_HomePhone;
	
	@FindBy(how = How.XPATH, using = "//input[@name='fax' and @id='fax']")
	public static WebElement edit_Fax;
	
	@FindBy(how = How.XPATH, using = "//input[@name='email' and @id='email']")
	public static WebElement edit_Email;
	
	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @name='receive_email']")
	public static WebElement radiobtn_receiveEmail;
	
	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @name='receive_sms']")
	public static WebElement radiobtn_receivesms;
	
	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @name='allows_call']")
	public static WebElement radiobtn_allowscall;
	
	@FindBy(how = How.XPATH, using = "//input[@name='im_id' and @name='im_id']")
	public static WebElement edit_MessengerId;
	
	
	@FindBy(how = How.XPATH, using = "//select[@name='im_netowrk']")
	public static WebElement dropdown_network;
	
	@FindBy(how = How.XPATH, using = "//select[@name='source']")
	public static WebElement dropdown_source;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and name='address_title']")
	public static WebElement edit_addresstitle;
	
	@FindBy(how = How.XPATH, using = "//select[@name='type' and @onchange='setAddress(this);']")
	public static WebElement dropdown_addresstype;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='address']")
	public static WebElement edit_address;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='state']")
	public static WebElement edit_state;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='postcode']")
	public static WebElement edit_postcode;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Save']")
	public static WebElement btn_save;
	
	
	
	

}
