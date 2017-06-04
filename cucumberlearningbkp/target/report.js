$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberoptions.feature");
formatter.feature({
  "line": 2,
  "name": "test scenario hooks with before and after methods",
  "description": "",
  "id": "test-scenario-hooks-with-before-and-after-methods",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "test scenario1",
  "description": "",
  "id": "test-scenario-hooks-with-before-and-after-methods;test-scenario1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "provide some prereq",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "execute some condition",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify result is success",
  "keyword": "Then "
});
formatter.match({
  "location": "CucoOptionsTest1.provide_some_prereq()"
});
formatter.result({
  "duration": 87899987,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CucoOptionsTest1.verify_result_is_success()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "test scenario2",
  "description": "",
  "id": "test-scenario-hooks-with-before-and-after-methods;test-scenario2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "give some prereq",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "execute any condition",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "check result",
  "keyword": "Then "
});
formatter.match({
  "location": "CucoOptionsTest1.give_some_prereq()"
});
formatter.result({
  "duration": 145676,
  "status": "passed"
});
formatter.match({
  "location": "CucoOptionsTest1.execute_any_condition()"
});
formatter.result({
  "duration": 72175,
  "status": "passed"
});
formatter.match({
  "location": "CucoOptionsTest1.check_result()"
});
formatter.result({
  "duration": 101973,
  "status": "passed"
});
});