package interfaceLib;

import org.openqa.selenium.WebElement;

public interface IActions {

	public void dragAndDrop(WebElement sourceElement, WebElement targetElement) throws Exception;
	
	public void moveToElement(WebElement element) throws Exception;
	
	public void rightClick(WebElement element) throws Exception;
	
	public void doubleClick(WebElement element) throws Exception;
	
	public void moveToElementAndClick(WebElement element) throws Exception;


}

