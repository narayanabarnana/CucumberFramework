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
import pages.DealsPage;
import pages.ProductPage;
import utilities.CucumberBaseClass;
import utilities.WaitUtils;

public class ProductCreationStepDefination {
	
	
	private CucumberBaseClass base;
	public ProductCreationStepDefination(CucumberBaseClass base)
	{
		this.base=base;
		
		
	}
	
	ProductPage productpage=PageFactory.initElements(base.driver, ProductPage.class);
	
	ActionControl act=new ActionControl(base);
	WebElementControl wec=new WebElementControl();
	TextboxControl tc=new TextboxControl();	
	FrameControl fc=new FrameControl(base);
	
	
	@When("^User moves to New Product Page$")
	public void user_moves_to_New_Product_Page() throws Throwable {
		
	    fc.switchToDefaultContent();
		//base.driver.switchTo().defaultContent();
		//base.driver.switchTo().frame("mainpanel");
		fc.switchToFrame("mainpanel");
		wec.click(productpage.btn_Products);
		
	    
	}

	@When("^User enters Product details$")
	public void user_enters_Product_details(DataTable ProductData) throws Throwable {
	   
		fc.switchToDefaultContent();
		fc.switchToFrame("mainpanel");
    	
    	for(Map<String,String> ProdData : ProductData.asMaps(String.class, String.class))
		{
    		fc.switchToDefaultContent();
    		fc.switchToFrame("mainpanel");
    		
    		WaitUtils.waitTillElementVisible(base.driver, 60, productpage.btn_NewProduct);
    		
    		wec.click(productpage.btn_NewProduct);
    		
    		WaitUtils.waitTillElementVisible(base.driver, 20, productpage.editbox_name);
    		
    		tc.setText(productpage.editbox_name, ProdData.get("ProductName"));
    		tc.clearText(productpage.editbox_cost);
    		tc.setText(productpage.editbox_cost, ProdData.get("Cost"));
    		tc.clearText(productpage.editbox_retailvalue);
    		tc.setText(productpage.editbox_retailvalue, ProdData.get("RetailValue"));
    		tc.clearText(productpage.editbox_wholesale);
    		tc.setText(productpage.editbox_wholesale, ProdData.get("WholeSalePrice"));
    		tc.setText(productpage.editbox_sku, ProdData.get("SKU"));
    		tc.clearText(productpage.editbox_inventoryAmount);
    		tc.setText(productpage.editbox_inventoryAmount, ProdData.get("InventoryAmount"));
    		tc.setText(productpage.editbox_description, ProdData.get("ProductDescription"));
    		
    		
		}
	    
	}

	@Then("^Clicked on Save button$")
	public void clicked_on_Save_button() throws Throwable {
	    
		fc.switchToDefaultContent();
		fc.switchToFrame("mainpanel");
		wec.click(productpage.btn_ProductSaveBtn);
	    
	}

	@Then("^Product created Succesfully$")
	public void product_created_Succesfully() throws Throwable {
	    
		System.out.println("Product Creation Successful");
	   
	}

	

}
