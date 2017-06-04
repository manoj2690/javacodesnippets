package junitrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features", 
		glue = "classpath:gluefiles_2", 
		tags = { "@all" }
		
		
		// ,dryRun = true //checks if all the steps in feature file have stepdef. Step def methods are not run.
		//,dryRun = false //default dry run is false which runs the step def methods
		
		//,monochrome = true //with true, run status is defined clearly. Eg:2 Scenarios (1 undefined, 1 passed)
		//, monochrome = false //default, run status is as - eg: 2 Scenarios ([33m1 undefined[0m, [32m1 passed[0m)
		
		//,strict = true //fails a scenario when run status is undefined or pending
		//,strict = false //default. passes a scenario when run status is undefined or pending
		
		//,format = {"pretty"} //prints in console
		//,format = {"html:Folder_Name"} //html report - index.html "html:Folder_Name"
		//,format = {"json:Folder_Name/cucumber.json"} //json format "json:Folder_Name/filename.json"
		//,format = {"junit:target/cucumber1.xml"} //xml junit report format "junit:folder_name/filename.xml"
		//all formats at once
		,format = {"pretty", "html:target", "json:target/cucumber.json", "junit:target/cucumber1.xml"} 
		)

public class TestRunner2 {

}
