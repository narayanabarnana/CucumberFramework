package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;
//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			

			//features="C:\\Users\\1024812\\Downloads\\Framework-master\\src\\test\\resources\\features\\TestMultipleScenario.feature",
			features="C:\\Users\\1024812\\Desktop\\Selenium-Latest\\CucumberFramework\\src\\test\\resources\\features",
//			features="C:\\Users\\1024812\\Downloads\\Framework-master\\src\\test\\resources\\features",

			//features="F:\\CucumberFramework\\Framework\\src\\test\\resources\\features\\TestMultipleScenario.feature",

			glue={"stepDefinations"},
			dryRun=false,
			monochrome=true,
			strict=true,
			//tags={"@SmokeTest"},  //if we want to execute Smoke test only
			//tags={"@SmokeTest , @RegressionTest"}, //OR operator :if we want to execute either SmokeTest or Regression test then we use this i.e. Comma(,) separated
			//tags={"@SanityTest" , "@RegressionTest"}, //And Operator : Executes all tests tagged as @SanityTest AND @RegressionTest
			//tags={"~@SanityTest" , "@RegressionTest"}, //Ignore specific test cases we use ~ special character. in this example we are ignoring  SanityTest
			format={"pretty","html:test-output","json:json-output/cucumber.json","junit:junitxml-output/cucumber.xml"},
			plugin={"pretty:STDOUT","html:target/cucumber-extent",

					"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\1024812\\Desktop\\Selenium-Latest\\CucumberFramework\\target\\cucumber-extent\\ExtentReport.html"

					//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:F:\\CucumberFramework\\Framework\\target\\cucumber-extent\\ExtentReport.html"
					}
			
			
			
			
			
			//if dryRun = true -checks the mapping between feature file and step defination file . used check for every step in feature file there should be stepDefination method in StepDefination file
			//checks the mapping between feature file and step defination file . used check for every step in feature file there should be stepDefination method in StepDefination file.
			//First make the dryRun = true and check everything is fine then make it false
			
			//Features : Path of the Feature file.
			//Glue: Path of the step defination file. i.e. where exactly the stepdefination file located
			
			//monochrome=true - display the console ouput in a readable format
			//format={"pretty","html:test-output"}-Generates HTML report
			
			//format={"pretty","html:test-output","json:json-output/cucumber.json"}-Generates HTML report and JSON report
			//strict=true: it will fail the execution if they are missing step definations
			
			/*
			 * Data Driven Testing Using Cucumber
			 * 
			 * 1)Simple Data Driven : without examples keyword-pass the values in ""
			 * 2)With Examples Keyword
			 * 3)Scenario outline
			 * 4)Using tables
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			)
	
	
	public class TestRunner {
	
		
		@AfterClass
	    public static void reportSetup() 
	 	{

	        Reporter.loadXMLConfig(new File("C:\\Users\\1024812\\Desktop\\Selenium-Latest\\CucumberFramework\\src\\main\\java\\utilities\\extent-config.xml"));

	        //Reporter.loadXMLConfig(new File("F:\\CucumberFramework\\Framework\\src\\main\\java\\utilities\\extent-config.xml"));

	        /*Properties p = System.getProperties();
	        p.list(System.out);*/
	        
	        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
	        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	        Reporter.setSystemInfo("64 Bit", 	"Windows 10");
	        Reporter.setSystemInfo("2.41", "Selenium");
	        Reporter.setSystemInfo("3.3.9", "Maven");
	        Reporter.setSystemInfo("1.8.0_66", "Java Version");
	        Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
	 	}
		
		
		
		
		
}
