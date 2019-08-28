//package ImplementedClassLib;
//
//import java.io.File;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
//import interfaceLib.IScreenshot;
//
//public class TakeScreenshot implements IScreenshot {
//	
//	private WebDriver driver;
//	
//	public TakeScreenshot(WebDriver driver) {
//		//System.out.println("Screenshot driver started");
//		this.driver = driver;
//	}
//
//	@Override
//	public void captureAndSaveScreenshotforFailure(String ScreenShotpath,String timeStamp,ITestResult result) throws Exception {
//				
//	
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		
//		File file=new File(ScreenShotpath+result.getName()+"_"+timeStamp+".png");
//		
//		FileUtils.copyFile(source, file);
//		Reporter.log("<a href='" + file.getAbsolutePath() + "'> <img src='" + file.getAbsolutePath() + "' height='100' width='100'/> </a>");
//
//		//System.out.println("Screenshot taken at"+timeStamp);
//	
//	
//	}
//	
//public void captureAndSaveScreenshotAnytime(String ScreenShotpath,String timeStamp) throws Exception {
//		
//			
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		
//		File file=new File(ScreenShotpath+"__"+timeStamp+".png");
//		
//		FileUtils.copyFile(source, file);
//		Reporter.log("<a href='" + file.getAbsolutePath() + "'> <img src='" + file.getAbsolutePath() + "' height='100' width='100'/> </a>");
//
//		//System.out.println("Screenshot taken at"+timeStamp);
//	
//	
//	}
//
//
//}
