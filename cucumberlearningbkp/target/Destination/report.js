$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/hooks.feature");
formatter.feature({
  "line": 2,
  "name": "background, scenario hooks and tagged hooks",
  "description": "",
  "id": "background,-scenario-hooks-and-tagged-hooks",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@fhooks1"
    }
  ]
});
formatter.before({
  "duration": 112568,
  "status": "passed"
});
formatter.before({
  "duration": 49331,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "test background works for different scenarios",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a prerequisite",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I execute it successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksTest1.I_have_a_prerequisite()"
});
formatter.result({
  "duration": 86082261,
  "status": "passed"
});
formatter.match({
  "location": "HooksTest1.I_execute_it_successfully()"
});
formatter.result({
  "duration": 61250,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#---------------------------Test background along with single tag--------------------"
    }
  ],
  "line": 10,
  "name": "verify background is working fine for scenarios",
  "description": "",
  "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-scenarios",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@shooks1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I have prerequisite1",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I do something",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I verify it successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksTest1.I_have_prerequisite1()"
});
formatter.result({
  "duration": 52973,
  "status": "passed"
});
formatter.match({
  "location": "HooksTest1.I_do_something()"
});
formatter.result({
  "duration": 63237,
  "status": "passed"
});
formatter.match({
  "location": "HooksTest1.I_verify_it_successfully()"
});
formatter.result({
  "duration": 50987,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Verify background is working fine for outline",
  "description": "",
  "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@shooks2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I have prerequisite2",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I do something with \u003cparam\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I verify them successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-outline;",
  "rows": [
    {
      "cells": [
        "param"
      ],
      "line": 23,
      "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-outline;;1"
    },
    {
      "cells": [
        "abc"
      ],
      "line": 24,
      "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-outline;;2"
    },
    {
      "cells": [
        "123"
      ],
      "line": 25,
      "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 39730,
  "status": "passed"
});
formatter.before({
  "duration": 27480,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "test background works for different scenarios",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a prerequisite",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I execute it successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksTest1.I_have_a_prerequisite()"
});
formatter.result({
  "duration": 71183,
  "status": "passed"
});
formatter.match({
  "location": "HooksTest1.I_execute_it_successfully()"
});
formatter.result({
  "duration": 45358,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify background is working fine for outline",
  "description": "",
  "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@shooks2"
    },
    {
      "line": 1,
      "name": "@fhooks1"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I have prerequisite2",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I do something with abc",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I verify them successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksTest1.I_have_prerequisite2()"
});
formatter.result({
  "duration": 124818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 20
    }
  ],
  "location": "HooksTest1.I_do_something_with_param(String)"
});
formatter.result({
  "duration": 2243419,
  "status": "passed"
});
formatter.match({
  "location": "HooksTest1.I_verify_them_successfully()"
});
formatter.result({
  "duration": 65224,
  "status": "passed"
});
formatter.before({
  "duration": 38074,
  "status": "passed"
});
formatter.before({
  "duration": 34433,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "test background works for different scenarios",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a prerequisite",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I execute it successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksTest1.I_have_a_prerequisite()"
});
formatter.result({
  "duration": 68203,
  "status": "passed"
});
formatter.match({
  "location": "HooksTest1.I_execute_it_successfully()"
});
formatter.result({
  "duration": 43040,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify background is working fine for outline",
  "description": "",
  "id": "background,-scenario-hooks-and-tagged-hooks;verify-background-is-working-fine-for-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@shooks2"
    },
    {
      "line": 1,
      "name": "@fhooks1"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I have prerequisite2",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I do something with 123",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I verify them successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksTest1.I_have_prerequisite2()"
});
formatter.result({
  "duration": 101311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 20
    }
  ],
  "location": "HooksTest1.I_do_something_with_param(String)"
});
formatter.result({
  "duration": 99656,
  "status": "passed"
});
formatter.match({
  "location": "HooksTest1.I_verify_them_successfully()"
});
formatter.result({
  "duration": 63237,
  "status": "passed"
});
});