package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.CucumberBaseClass;

public class CallPage extends CucumberBaseClass{
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Call')]")
	public static WebElement btn_Call;
	
	////a[contains(text(),'New Contact')]
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Call')]")
	public static WebElement btn_NewCall;
	
	////input[@type='checkbox' and @name='scheduled_call']
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @name='scheduled_call']")
	public static WebElement checkbox_callSchedule;
	
	////input[@type='text' and @name='schedule']
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='schedule']")
	public static WebElement txt_CalendarSchedule;
	
	////input[@type='button' and @value='Lookup']
	@FindBy(how = How.XPATH, using = "(//input[@type='button' and @value='Lookup'])[1]")
	public static WebElement btn_Lookup1;
	
	@FindBy(how = How.XPATH, using = "//input[@name='search' and @id='search']")
	public static WebElement txt_searchbutton;
	
	////input[@type='submit' and @value='Search']
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Search']")
	public static WebElement btn_searchbutton;
	
	//a[text()="Narayana B"]
	@FindBy(how = How.XPATH, using = "//a[text()='Narayana B']")
	public static WebElement link_searchlink;
	
	@FindBy(how = How.XPATH, using = "(//input[@type='button' and @value='Lookup'])[2]")
	public static WebElement btn_Lookup2;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @name='conf_call']")
	public static WebElement checkbox_conferencecall;
	
	@FindBy(how = How.XPATH, using = "(//input[@type='button' and @value='Lookup'])[3]")
	public static WebElement btn_Lookup3;
	
	@FindBy(how = How.XPATH, using = "(//select[@name='flag'])[1]")
	public static WebElement dropdown_FlagAs;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @value='prospect']")
	public static WebElement checkbox_createNewDeal;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @value='task']")
	public static WebElement checkbox_createNewTask;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @value='case']")
	public static WebElement checkbox_createNewCase;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='notes']")
	public static WebElement textarea_notes;
	
	@FindBy(how = How.XPATH, using = "(//input[@type='submit' and @value='Save and start call now'])[2]")
	public static WebElement btn_saveAndNewCall;
	
	//td[@align='center' and @id='tab_vdeals']
	@FindBy(how = How.XPATH, using = "//td[@align='center' and @id='tab_vdeals']")
	public static WebElement btn_tabDeals;
	
	@FindBy(how = How.XPATH, using = "//td[@align='center' and @id='tab_vtasks']")
	public static WebElement btn_tabTasks;
	
	@FindBy(how = How.XPATH, using = "//td[@align='center' and @id='tab_vcases']")
	public static WebElement btn_tabCases;
	
	@FindBy(how = How.XPATH, using = "//div[@id='vDeals']//table[@class='datacard']//td[@align='left']//tr//td")
	public static WebElement element_ExtractDealId;
	
	@FindBy(how = How.XPATH, using = "//div[@id='vTasks']//table[@class='datacard']//td[@align='left']//tr//td")
	public static WebElement element_ExtractTaskId;
	
	@FindBy(how = How.XPATH, using = "//div[@id='vCases']//table[@class='datacard']//td[@align='left']//tr//td")
	public static WebElement element_ExtractCaseId;
	
	
	//div[@id='vDeals']//table[@class='datacard']//td[@align='left']//tr//td
	//div[@id='vTasks']//table[@class='datacard']//td[@align='left']//tr//td
	//div[@id='vCases']//table[@class='datacard']//td[@align='left']//tr//td

}
