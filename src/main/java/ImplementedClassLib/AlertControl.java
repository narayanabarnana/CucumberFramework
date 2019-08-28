package ImplementedClassLib;

import org.openqa.selenium.Alert;
import interfaceLib.IAlert;
import utilities.CucumberBaseClass;
import utilities.WaitUtils;

public class AlertControl extends CucumberBaseClass implements IAlert{
	//Webbase.driver base.driver;
	
	private CucumberBaseClass base;
	public AlertControl(CucumberBaseClass base)
	{
		this.base=base;
		
	}
	
//	public AlertControl(Webbase.driver base.driver) {
//		this.base.driver = base.driver;
//	}
	
	private Alert getAlert(){
		Alert alert = base.driver.switchTo().alert();
		
		return alert;
	}

	@Override
	public void acceptAlert() throws Exception {
		
		getAlert().accept();
		
	}

	@Override
	public void rejectAlert() throws Exception {
		getAlert().dismiss();
		
	}

	@Override
	public String getMessageFromAlert() throws Exception {
		String message = getAlert().getText();
		return message;
	}

	@Override
	public boolean isAlertPresent(long timeOutInSeconds) throws Exception {
		WaitUtils.waitTillAlertIsPresent(base.driver, timeOutInSeconds);
		return true;
	}

	

}
