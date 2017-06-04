package gluefiles_1;


import cucumber.api.Scenario;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Step;

public class Test5 {


	private Scenario scenario;

	
	//only scenario class can be passed as argument to Before class in cucumber
	//Before annotation method can have either 0 or 1 argument only
	@Before
	public void beforeMethod(Scenario scenario){
		this.scenario = scenario;
		
	}


	@Given("^one thing$")
	public void one_thing() {

		
		
	/*	System.out.println("getSourceTagNames size - " + scenario.getSourceTagNames());//tag assigned to the scenario
		System.out.println("getStatus - " + scenario.getStatus());//status of the current step
		System.out.println("getName - " + scenario.getName()); //feature file sentence for this step
		System.out.println("getId - " + scenario.getId()); 
		*/

	}

	@And("^an other thing$")
	public void an_other_thing() {
		System.out.println("ran and");
		
	}

	@And("^yet an other thing$")
	public void yet_an_other_thing() {
		System.out.println("ran and2");
	}

	@When("^I open my eyes$")
	public void I_open_my_eyes() throws Exception {
		System.out.println("throw exception");
		System.out.println("getStatus with exception - " + scenario.getStatus());//status of the current step
		
			throw new Exception("Exception introduced");
			
			
		
	}

	@Then("^I see something$")
	public void I_see_something() {
		
		System.out.println("getStatus after exception step, then - " + scenario.getStatus());//status of the current step
		 
	}

	@But("^I don't see something else$")
	public void I_dont_see_something_else() {
		System.out.println(1);
	}

}
