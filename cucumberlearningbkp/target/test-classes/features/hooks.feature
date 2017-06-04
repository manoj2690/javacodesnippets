@fhooks1
Feature: background, scenario hooks and tagged hooks

Background: test background works for different scenarios
Given I have a prerequisite
Then I execute it successfully

#---------------------------Test background along with single tag--------------------
@shooks @sanity
Scenario: verify background is working fine for scenarios
Given I have prerequisite1
When I do something
Then I verify it successfully

@shooks2 @sanity
Scenario Outline: Verify background is working fine for outline
Given I have prerequisite2
When I do something with <param2>
Then I verify them successfully

#parametrize different examples not working***************************
Examples:

			|param |
			|abc   |
			|123   |


