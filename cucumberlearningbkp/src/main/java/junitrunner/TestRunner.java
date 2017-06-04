package junitrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
//		glue = "/appiumtestproj/src/main/java/gluefiles_1", //not working
		
/*//----------Gherkin keys --------------all feature files---------------------
		features = "./src/test/resources/features", 
		glue = "classpath:gluefiles_1",
		tags = {"@test6"},
		format = {"html:target/Destination"}
*/		
	
		
/*-------------------------run specific feature file --------- 
 * //----------------Tagged hooks - Feature level tag-----------
		features = "./src/test/resources/features/hooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@fhooks1"}*/
	
		
/*//Tagged hooks - Scenario level tags(Single tag)-------------
		features = "./src/test/resources/features/hooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@shooks2"}
			*/
		
/*//-----Tagged hooks - Scenario level tags(Multiple tags - And Condition)----------
		
		features = "./src/test/resources/features/hooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@shooks", "@sanity"}
		*/

/*//-----Scenario hooks - just before without tags (runs all the before methods irrespective of tags)----------
		
				features = "./src/test/resources/features/scenariohooks.feature",
				glue = "classpath:gluefiles_1"*/
			
/*//-----Scenario hooks - with feature level tag (same as above)----------

		features = "./src/test/resources/features/scenariohooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@feature"}*/
		
/*//-----Scenario hooks - with scenario level tag (runs before methods - without tags, feature level tag & tags available for that scenario (eg: common and scenario1))----------

		features = "./src/test/resources/features/scenariohooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@scenario1"}*/
										
/*//-----Scenario hooks - with common tags ----------

		features = "./src/test/resources/features/scenariohooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@diff"}
				*/
		
/*//-----Scenario hooks - with common tags ----------

		features = "./src/test/resources/features/scenariohooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@diff"}
						
*/		

/*//-----Scenario hooks - with multiple tags (Or condition) ----------

		features = "./src/test/resources/features/scenariohooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@diff, @common"}*/
						
		
/*//-----Scenario hooks - with multiple tags (And condition) ----------

		features = "./src/test/resources/features/scenariohooks.feature",
		glue = "classpath:gluefiles_1",
		tags = {"@diff", "@sub"}
							
*/
		
		)

public class TestRunner {

}
