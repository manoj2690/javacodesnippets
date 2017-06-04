Feature: Gherkin Keywords in feature files

#-----------------Scenario Outline with Examples------------------------
@test1
Scenario Outline: feeding a suckler cow
  Given the cow weighs "<weight>" kg
  When we calculate the feeding requirements
  Then the energy should be "<energy>" MJ
  And the protein should be "<protein>" kg
  

  Examples:
    | weight | energy | protein |
    |    450 |  26500 |     215 |
    |    500 |  29500 |     245 |
    |    575 |  31500 |     255 |
    |    600 |  37000 |     305 |
 
 #-----------------Scenarios with Doc Strings------------------------   
 @test2
 Scenario: Doc Strings
 
 Given user is on a page 
 When user enters :
  """
 doc string concept is working successfully
 """ 
 Then verify the text is printed successfully
 
 #-----------------Scenarios with Data tables-----------------------
 @test3
 Scenario: Data tables
 Given the following users exist
 
  | name   | email              | twitter         |
  | Aslak  | aslak@cucumber.io  | @aslak_hellesoy |
  | Julien | julien@cucumber.io | @jbpros         |
  | Matt   | matt@cucumber.io   | @mattwynne      |
  | Jeff   | example@gmail.com  | @twitter		  |
 
 
  #-----------------Scenarios with Maps as Data Tables and use of And-----------------------
 @test4
 Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@154 |
	Then Message displayed Login Successfully
	
#------------------Scenarios with all the keywords. Access Scenario methods-------------------
@test5	
Scenario: Multiple Givens
  Given one thing
  And an other thing
  And yet an other thing
  When I open my eyes
  Then I see something
  But I don't see something else
  
  
 #-----------------continue with failed steps - use scenario outlines - examples/ scenario -data tables-----------------------
 @test6
 Scenario Outline: test skipped example
 
 Given the following users with name "<name>" exist:
      
 Examples:
  | name   |
  | Aslak  |
  | Ashok  |
  
	
