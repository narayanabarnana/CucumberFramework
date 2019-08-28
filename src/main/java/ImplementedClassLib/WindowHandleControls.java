package ImplementedClassLib;

import java.util.Set;

//import org.openqa.selenium.WebDriver;

import interfaceLib.IWindowHandle;
import utilities.CucumberBaseClass;

public class WindowHandleControls extends CucumberBaseClass implements IWindowHandle{
	
//	WebDriver driver;
//	
//	public WindowHandleControls(WebDriver driver){
//		this.driver = driver;
//	}
	
	private CucumberBaseClass base;
	public WindowHandleControls(CucumberBaseClass base)
	{
		this.base=base;
		
	}

	@Override
	public void switchToChildWindow() throws Exception {
		
		String childWindow;
		
		childWindow = getWindowHandles().toArray()[1].toString();
		
		switchToWindow(childWindow);
	}

	@Override
	public void switchToParentWindow() throws Exception {
		String parentWindow = getWindowHandle();
		
		switchToWindow(parentWindow);
	}
	
	private void switchToWindow(String windowHandle){
		base.driver.switchTo().window(windowHandle);
	}

	@Override
	public String getWindowHandle() throws Exception {
		String windowHandle = base.driver.getWindowHandle();
		return windowHandle;
	}

	@Override
	public Set<String> getWindowHandles() throws Exception {
		Set<String> childWindow = base.driver.getWindowHandles();
		return childWindow;
	}

}
