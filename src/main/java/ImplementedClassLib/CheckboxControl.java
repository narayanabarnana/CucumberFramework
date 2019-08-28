package ImplementedClassLib;

import org.openqa.selenium.WebElement;

import interfaceLib.ICheckbox;

public class CheckboxControl implements ICheckbox{

	@Override
	public void changeCheckBoxStatus(WebElement element, boolean status) throws Exception {
		
		if(element.isSelected() && !status){
			
			element.click();
		
		} else if(!element.isSelected() && status){
			
			element.click();
		}
		
	}

}
