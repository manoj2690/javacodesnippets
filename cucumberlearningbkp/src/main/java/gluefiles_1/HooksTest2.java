package gluefiles_1;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksTest2 {
	
	@Before
	public void before(){
		System.out.println("<<<<<<<<Before without tags>>>>>>>>>>>>");
	}
	
	@Before ("@feature")
	public void beforefeature(){
		System.out.println("<<<<<<<<Before tag @feature - feature level>>>>>>>>>>>>");
	}
	
	@Before ("@scenario1")
	public void beforeScenario(){
		System.out.println("<<<<<<<<Before tag @scenario1 - scenario specific>>>>>>>>>>>>");
	}
	
	@Before ("@common")
	public void beforecommon(){
		System.out.println("<<<<<<<<Before tag @common - tag specific>>>>>>>>>>>>");
	}
	
	@Before ("@diff")
	public void beforediff(){
		System.out.println("<<<<<<<<Before tag @diff - tag specific>>>>>>>>>>>>");
	}
	
	//scenario1 
	@Given("^prereq1$")
	public void prereq1(){
		System.out.println("Scenario1 Given//////////");
	}
	
	@When("^execute cond1$")
	public void execute_a_cond1(){
		System.out.println("Scenario1 When//////////");
	}
	
	@Then("^verify result1$")
	public void verify_result1(){
		System.out.println("Scenario1 Then//////////");
	}
	
	//scenario2 
		@Given("^prereq2$")
		public void prereq2(){
			System.out.println("Scenario2 Given//////////");
		}
		
		@When("^executes condn$")
		public void execute_a_cond2(){
			System.out.println("Scenario2 When//////////");
		}
		
		@Then("^verify result2$")
		public void verify_result2(){
			System.out.println("Scenario2 Then//////////");
		}
		
		//scenarioOutline
		@Given("^prereq$")
		public void prereq(){
			System.out.println("ScenarioOut Given//////////");
		}
		
		@When("^execute a ([^\"]*)$")
		public void execute_a_cond(String cond){
			System.out.println("ScenarioOut When////////// - " + cond);
		}
		
		@Then("^verify result$")
		public void verify_result(){
			System.out.println("ScenarioOut Then//////////");
		}
				
	
	

}
