package pages;

import java.util.List;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

//import ImplementedClassLib.ActionControl;
import utilities.CucumberBaseClass;



public class DealsPage extends CucumberBaseClass{
	

		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Deals')]")
		public  WebElement btn_Deals;
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Deal')]")
		public WebElement btn_NewDeal;
		
		@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='sequence']")
		public WebElement editbox_DealNo;
		
		@FindBy(how = How.ID, using = "title")
		public WebElement editbox_Title;
		
		@FindBy(how = How.ID, using = "amount")
		public WebElement editbox_amount;
		
		@FindBy(how = How.ID, using = "probability")
		public WebElement editbox_probability;
		
		@FindBy(how = How.ID, using = "commission")
		public WebElement editbox_commission;
		
		
		@FindBy(how = How.XPATH, using = "//small[contains(text(),'No products created.')]")
		public WebElement text_Product;
		
		//a[contains(text(),'Add one here')]
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add one here')]")
		public WebElement link_AddProduct;
		
		
		/*
		*****************when user clicks on Add one here link beside product field it will route to another page. 
		the below web elements are belongs to that page
		
		*/
		
		
		@FindBy(how = How.XPATH, using = "//legend[contains(text(),'Product/Service: ')]")
		public WebElement text_ProductService;
		
		
		@FindBy(how = How.XPATH, using = "//input[@name='cost']")
		public WebElement editbox_Cost;
		
		//input[@name='retail_value']
		@FindBy(how = How.XPATH, using = "//input[@name='retail_value']")
		public WebElement editbox_RetailValue;
		
		//div[@id='existingCampaignLayer']//input[@type='submit' and @value='Save']
		
		@FindBy(how = How.XPATH, using = "//div[@id='existingCampaignLayer']//input[@type='submit' and @value='Save']")
		public WebElement btn_ProductSaveBtn;
//		**************************************
		
		
		@FindAll(@FindBy(how = How.XPATH, using = "//td/select[@name='type']"))
		public List<WebElement> list_Type;
		
		@FindBy(how = How.XPATH, using = "//select[@name='source']")
		public WebElement dropdown_Source;
		
		@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='N']")
		public WebElement radiobtn_Status;
		
		////select[@name='source']
		
		@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Save']")
		public WebElement btn_Save;
		
		
		
		
		
		 public void enter_title(String title) {
			 editbox_Title.sendKeys(title);
		 }
			 
		 public void enter_amount(String amount) {
			 editbox_amount.sendKeys(amount);
		 }
		 
		 public void enter_probability(String probability) {
			 editbox_probability.sendKeys(probability);
		 }
		 
		 public void enter_commission(String commission) {
			 editbox_commission.sendKeys(commission);
		 }
		 
		 public void click_AddProduct() {
			 link_AddProduct.click();
		 }
		
	
}
