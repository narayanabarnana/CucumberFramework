package ImplementedClassLib;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Webbase.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import interfaceLib.IActions;
import utilities.CucumberBaseClass;

public class ActionControl extends CucumberBaseClass implements IActions{
	
	//WebDriver driver;
	private CucumberBaseClass base;
	public ActionControl(CucumberBaseClass base)
	{
		this.base=base;
		
	}
	
	
	public Actions getActions() throws Exception{
		Actions action = new Actions(driver);
		
		return action;
	}

	@Override
	public  void dragAndDrop(WebElement srcEle, WebElement tarEle) throws Exception {
		getActions().dragAndDrop(srcEle, tarEle).build().perform();
		
	}

	@Override
	public void moveToElement(WebElement element) throws Exception {
		getActions().moveToElement(element).build().perform();
		
	}

	@Override
	public void rightClick(WebElement element) throws Exception {
		getActions().contextClick().build().perform();
		
	}

	@Override
	public void doubleClick(WebElement element) throws Exception {
		getActions().doubleClick().build().perform();
		
	}

	@Override
	public void moveToElementAndClick(WebElement element) throws Exception {
		getActions().moveToElement(element).click().build().perform();
		
	}

}
