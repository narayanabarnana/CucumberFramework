package ImplementedClassLib;

import org.openqa.selenium.WebElement;

import interfaceLib.IWebElement;
import utilities.CucumberBaseClass;

public class WebElementControl extends CucumberBaseClass implements IWebElement{

//	private CucumberBaseClass base;
//	public WebElementControl(CucumberBaseClass base)
//	{
//		this.base=base;
//		
//	}
	
	@Override
	public void click(WebElement element) throws Exception
	{
		element.click();

	}

	@Override
	public String getText(WebElement element) throws Exception {
		
		String text = element.getText();
		return text;
	}

	@Override
	public String getAttribute(WebElement element, String attribute) throws Exception {
		String attributeValue = element.getAttribute(attribute);
		return attributeValue;
	}

	@Override
	public String getCssValue(WebElement element, String csspropertyName) throws Exception {
		String cssValue = element.getCssValue(csspropertyName);
		return cssValue;
	}

	@Override
	public boolean isElementEnabled(WebElement element) throws Exception {
		boolean status = element.isEnabled();
		return status;
	}

	@Override
	public boolean isElementVisible(WebElement element) throws Exception {
		boolean status = element.isDisplayed();
		return status;
	}

	@Override
	public boolean isElementSelected(WebElement element) throws Exception {
		boolean status = element.isSelected();
		return status;
	}

}
