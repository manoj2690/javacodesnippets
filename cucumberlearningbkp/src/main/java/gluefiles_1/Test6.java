package gluefiles_1;


import cucumber.api.Scenario;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Step;
import junit.framework.Assert;

public class Test6 {


	private Scenario scenario;

	
	//only scenario class can be passed as argument to Before class in cucumber
	//Before annotation method can have either 0 or 1 argument only
	@Before
	public void beforeMethod(Scenario scenario){
		this.scenario = scenario;
		
	}


	@Given("^the following users with name \"([^\"]*)\" exist:$")
	public void the_following_users_exist(String name) {
		

		System.out.println("getStatus - " + scenario.getStatus());
		
		name = name.trim();
		System.out.println(name);
	
		Assert.assertEquals("Ashok", name);

	}
}
