package gluefiles_1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2 {
	
	
	@Given("^user is on a page$")
	public void user_is_on_a_page(){
		System.out.println("1");
	}
	//doc string is considered as a string hence, one argument of string type
	@When("^user enters :$")
	public void user_enters_text(String text){
		System.out.println("2");
	}

	@Then("^verify the text is printed successfully$")
	public void verify_the_text_is_printed_successfully(){
		System.out.println("3");
	}
}
