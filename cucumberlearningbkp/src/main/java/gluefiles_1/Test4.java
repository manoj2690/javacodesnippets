package gluefiles_1;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test4 {
	
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page(){
		
	}
	
	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page(){
		
	}
	
	@And("^User enters Credentials to LogIn$")
	public void User_enters_Credentials_to_LogIn(DataTable usercredentials){
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
			System.out.println(data.get("Username")); 
			System.out.println( data.get("Password")); 
		    
			}
	}
	
	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully(){
		
	}
	
	

}
