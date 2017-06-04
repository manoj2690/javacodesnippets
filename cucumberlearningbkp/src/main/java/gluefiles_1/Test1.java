package gluefiles_1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	
	//^- negation

	@Given("^the cow weighs \"([^\"]*)\" kg$")
	public void the_cow_weighs_kg(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(arg1);
	}

	@When("^we calculate the feeding requirements$")
	public void we_calculate_the_feeding_requirements() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("2");
	}

	@Then("^the energy should be \"([^\"]*)\" MJ$")
	public void the_energy_should_be_MJ(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(arg1);
	}

	@Then("^the protein should be \"([^\"]*)\" kg$")
	public void the_protein_should_be_kg(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(arg1);
	}

//(\\d+)
}
