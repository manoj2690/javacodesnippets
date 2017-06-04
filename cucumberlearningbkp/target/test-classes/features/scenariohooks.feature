@feature
Feature: test scenario hooks with before and after methods

@scenario1 @common
Scenario: scenario1
Given prereq1
When execute cond1
Then verify result1

@scenario2 @common @diff @sub
Scenario: scenario2
Given prereq2
When executes condn
Then verify result2

@scenarioout3 @sub @diff
Scenario Outline: scenario outline
Given prereq
When execute a <cond>
Then verify result

Examples:

|cond|
|1|
|2|
