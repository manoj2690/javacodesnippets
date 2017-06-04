package gluefiles_1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksTest1 {
	
	@Given("^I have a prerequisite$")
	public void I_have_a_prerequisite(){
		System.out.println("background Given ran successfully....................");
	}
	
	@Then("^I execute it successfully$")
	public void I_execute_it_successfully(){
		System.out.println("background Then ran successfully....................");
	}
	
	//scenario1 
	@Given("^I have prerequisite1$")
	public void I_have_prerequisite1(){
		System.out.println("Scenario1 Given//////////");
	}
	
	@When("^I do something$")
	public void I_do_something(){
		System.out.println("Scenario1 When//////////");
	}
	
	@Then("^I verify it successfully$")
	public void I_verify_it_successfully(){
		System.out.println("Scenario1 Then//////////");
	}
	
	
	//scenario outline with example parameter
	@Given("^I have prerequisite2$")
	public void I_have_prerequisite2(){
		System.out.println("Scenario Outline Given//////////");
	}
	
	@When("^I do something with ([^\"]*)$")
	public void I_do_something_with_param(String t){
		System.out.println("Scenario Outline When////////// -- " + t );		
	}
	
	@Then("^I verify them successfully$")
	public void I_verify_them_successfully(){
		System.out.println("Scenario Outline Then//////////");		
	}
	

}
