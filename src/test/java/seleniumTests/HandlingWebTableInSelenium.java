package seleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableInSelenium {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");

		driver.manage().window().maximize();
		
		WebElement BooksTable = driver.findElement(By.id("BooksAuthorsTable"));
		
		List<WebElement> rowVals = BooksTable.findElements(By.tagName("tr"));
		
		int noOfRows=rowVals.size();
		
		System.out.println("The number of rows in a webtable " + noOfRows);
		
		int colNum = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr[1]/th")).size();
		
		System.out.println("Number fo columns in a webtable " + colNum);
		
		//Get column header values from first row
		List<WebElement> colHeader = rowVals.get(0).findElements(By.tagName("th"));
		
		for(int i=0; i<colHeader.size(); i++){
			System.out.println(colHeader.get(i).getText());
		}
		System.out.println("---------------");
		//Loop through the remaining rows
		for(int i=1; i<noOfRows; i++){
			//Get each row's column values by tag name
			List<WebElement> colVals = rowVals.get(i).findElements(By.tagName("td"));
			//Loop through each column
			for(int j=0; j<colNum; j++){
				//Print the coulumn values to console
				System.out.println(colVals.get(j).getText());
			}
			//Just a separator for each row
			System.out.println("---------------");
		}			
		
		//Printing table contents to console for fixed row and column numbers
		for(int i=2; i<=6; i++){
			for(int j=1; j<=4; j++){
				System.out.print(driver.findElement(By.
						xpath("//table[@id='BooksAuthorsTable']/tbody/tr[" + i +"]/td[" + j + "]")).getText() + "\t");
			}
			System.out.println("");
		}
		
		driver.close();
		driver.quit();
	}

}
