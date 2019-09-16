//package seleniumTests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//
//import factory.DataProviderFactory;
//
//public class HeadlessHtmlUnitDriver {
//
//	public static void main(String[] args) {
//		
//
//		
//		HtmlUnitDriver unitDriver=new HtmlUnitDriver();
//		unitDriver.get("https://www.freecrm.com/index.html");
//		
//		unitDriver.findElement(By.name("username"));
//		unitDriver.findElement(By.name("password"));
//		
//		System.out.println("entered username and password");
//		
//		unitDriver.findElement(By.xpath("//input[@type='submit']"));
//		
//		System.out.println("Clicked on Submit button");
//		
//		unitDriver.close();
//		
//		
//
//	}
//
//}
