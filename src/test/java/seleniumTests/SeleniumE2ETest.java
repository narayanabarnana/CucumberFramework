package seleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumE2ETest {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		driver.manage().window().maximize();
		
		//Handling Checkboxes
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int totalCheckboxes=checkbox.size();
		System.out.println("Number of checkboxes in a webpage are " + totalCheckboxes);
		
		for(int i=0;i<totalCheckboxes;i++)
		{
			String name=checkbox.get(i).getAttribute("value");
			System.out.println(name);
		}
		
		//To select a checkbox
		WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox' and @value='Bicycle']"));
		checkbox1.click();
		
		boolean b=checkbox1.isSelected();
		if(b)
		{
			System.out.println("Checkbox selected");			
		}
		else
		{
			System.out.println("Checkbox not selected");
		}
		
		
		//Handling Radio buttons
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[@type='radio']"));
		int noOfradiobuttons=radiobuttons.size();
		System.out.println("Total number of radio buttons are " + noOfradiobuttons);
		
		for(int i=0;i<noOfradiobuttons;i++)
		{
			String radioButtonname=radiobuttons.get(i).getAttribute("value");
			System.out.println(" The radio box name is " + radioButtonname);
		}
		
		WebElement radioButton1=driver.findElement(By.xpath("//input[@type='radio' and @value='Novels']"));
		radioButton1.click();
		
		boolean radiobuttonvalidation=radioButton1.isSelected();
		if(radiobuttonvalidation) {
			System.out.println("radio button is enabled");
		}
		else {
			System.out.println("radio button is not enabled");
		}
		
		//Handling dropdown
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='programming-languages']"));
		Select sel=new Select(dropdown);
		
		List<WebElement> selectoptions=sel.getOptions();
		int dropdownsize=selectoptions.size();
		
		System.out.println(" size of the dropdown is " + dropdownsize);
		
		for(WebElement value : selectoptions)
		{
			System.out.println(value.getText());
		}
		
		driver.quit();
		
		

	}

}
