package ImplementedClassLib;

import org.openqa.selenium.WebElement;
import interfaceLib.ITextbox;


public class TextboxControl implements ITextbox{

	@Override
	public void setText(WebElement element, String textToSet) throws Exception {
		
		element.sendKeys(textToSet);

		
	}

	@Override
	public void clearText(WebElement element) throws Exception {
		element.clear();
	}

}
