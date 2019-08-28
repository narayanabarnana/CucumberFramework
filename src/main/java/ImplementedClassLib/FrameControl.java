package ImplementedClassLib;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import interfaceLib.IFrame;
import utilities.CucumberBaseClass;

public class FrameControl extends CucumberBaseClass implements IFrame {
	
//	private WebDriver driver;
	
//	public FrameControl(WebDriver driver) {
//		this.driver = driver;
//	}

	private CucumberBaseClass base;
	public FrameControl(CucumberBaseClass base)
	{
		this.base=base;
		
	}
	
	@Override
	public void switchToFrame(String frameId) throws Exception {
		
		base.driver.switchTo().frame(frameId);
		
	}

	@Override
	public void switchToFrame(WebElement element) throws Exception {
		base.driver.switchTo().frame(element);
		
	}

	@Override
	public void switchToFrame(int index) throws Exception {
		base.driver.switchTo().frame(index);
		
	}

	@Override
	public void switchToDefaultContent() throws Exception {
		base.driver.switchTo().defaultContent();
		
	}

}
