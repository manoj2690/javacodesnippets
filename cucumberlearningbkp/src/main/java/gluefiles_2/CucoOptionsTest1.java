package gluefiles_2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucoOptionsTest1 {

	@Given("^provide some prereq$")
	public void provide_some_prereq() {

		System.out.println("Scenario 1 Given");
	}

	/*@When("^execute some condition$")
	public void execute_some_condition() {
		System.out.println("Scenario 1 when");
	}*/

	@Then("^verify result is success$")
	public void verify_result_is_success() {
		System.out.println("Scenario 1 then");
	}

	@Given("^give some prereq$")
	public void give_some_prereq() {
		System.out.println("Scenario 2 Given");
	}

	@When("^execute any condition$")
	public void execute_any_condition() {
		System.out.println("Scenario 2 When");
	}

	@Then("^check result$")
	public void check_result() {
		System.out.println("Scenario 2 Then");
	}

}
