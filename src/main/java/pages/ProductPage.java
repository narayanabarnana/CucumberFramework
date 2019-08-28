package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.CucumberBaseClass;

public class ProductPage extends CucumberBaseClass{
	
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Products')])[2]")
	public  WebElement btn_Products;
	
	//input[@type='button' and @value='New Product']
	@FindBy(how = How.XPATH, using = "//input[@type='button' and @value='New Product']")
	public  WebElement btn_NewProduct;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='name']")
	public  WebElement editbox_name;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='cost']")
	public  WebElement editbox_cost;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='retail_value']")
	public  WebElement editbox_retailvalue;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='wholesale']")
	public  WebElement editbox_wholesale;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='sku']")
	public  WebElement editbox_sku;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='inventory_amount']")
	public  WebElement editbox_inventoryAmount;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='description']")
	public  WebElement editbox_description;
	
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Save']")
	public WebElement btn_ProductSaveBtn;
	

}
