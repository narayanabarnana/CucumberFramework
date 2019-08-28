package ImplementedClassLib;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;

import interfaceLib.IJavaScript;
import utilities.CucumberBaseClass;

public class JavaScriptControl extends CucumberBaseClass implements IJavaScript{
	
//	private WebDriver driver;
//	
//	public JavaScriptControl(WebDriver driver) {
//		this.driver = driver;
//	}
	
	private CucumberBaseClass base;
	public JavaScriptControl(CucumberBaseClass base)
	{
		this.base=base;
		
	}
	
	private JavascriptExecutor getJsEngine() throws Exception{
		JavascriptExecutor jsEngine = (JavascriptExecutor) base.driver;
		return jsEngine;
	}
	
	@Override
	public void executeJavaScript(String scriptToExecute) throws Exception {
		
		
		getJsEngine().executeScript(scriptToExecute);
		
	}

	@Override
	public void scrollDown(int x, int y) throws Exception {
		
		String jsCommand = String.format("window.scrollBy(%d, %d)", x, y);
		
		getJsEngine().executeScript(jsCommand);
		
	}

	
	
	@Override
	public String executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception {
		String returnValue = getJsEngine().executeScript(scriptToExecute).toString();
		return returnValue;
	}

	
}
