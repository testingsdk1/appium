$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 58138881758,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Launch App \u003e\u003e Select Hotels \u003e\u003e Read out the first 5 Hotel Names and their rates.",
  "description": "",
  "id": "registration;launch-app-\u003e\u003e-select-hotels-\u003e\u003e-read-out-the-first-5-hotel-names-and-their-rates.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I tap on \"phoneNumberTextBox\" element",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"mobileNumber\" having className \"editTextView\" with 0 index",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I tap on \"NEXT\" element",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I tap on \"loginviaOtp\" element",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The user waits for sms to get autofiled",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The text \"Home\" for id \"homeId\" is verified",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I tap on \"askmeLater\" element",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I Click on \"textView\" with \"Hotels\" text using List",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I tap on \"hotelSearchCityTextbox\" element",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Sikanderpur\" having className \"editTextView\" with 0 index",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I tap on \"searchPrimaryText\" element",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I tap on \"SEARCH\" element",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I tap on \"sortFilter\" element",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I Click on \"textView\" with \"UserRating\" text using List",
  "keyword": "Then "
});
formatter.match({
  "location": "registrationStep.the_application_is_launched()"
});
formatter.result({
  "duration": 67569587,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phoneNumberTextBox",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "duration": 1496757961,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobileNumber",
      "offset": 9
    },
    {
      "val": "editTextView",
      "offset": 41
    },
    {
      "val": "0",
      "offset": 60
    }
  ],
  "location": "registrationStep.enterText(String,String,int)"
});
formatter.result({
  "duration": 30363191873,
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 0, Size: 0\n\tat java.util.ArrayList.rangeCheck(ArrayList.java:657)\n\tat java.util.ArrayList.get(ArrayList.java:433)\n\tat Generics.appiumMethods.enterEditTextView(appiumMethods.java:118)\n\tat stepDefinition.registrationStep.enterText(registrationStep.java:57)\n\tat ✽.Then I enter \"mobileNumber\" having className \"editTextView\" with 0 index(Registration.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "NEXT",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "loginviaOtp",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "registrationStep.waitUntilSmsAutoFiled()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 10
    },
    {
      "val": "homeId",
      "offset": 24
    }
  ],
  "location": "registrationStep.assertionMethod(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "askmeLater",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "textView",
      "offset": 12
    },
    {
      "val": "Hotels",
      "offset": 28
    }
  ],
  "location": "registrationStep.clickOnElementByText(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "hotelSearchCityTextbox",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sikanderpur",
      "offset": 9
    },
    {
      "val": "editTextView",
      "offset": 40
    },
    {
      "val": "0",
      "offset": 59
    }
  ],
  "location": "registrationStep.enterText(String,String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "searchPrimaryText",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SEARCH",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sortFilter",
      "offset": 10
    }
  ],
  "location": "registrationStep.clickOnElementByID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "textView",
      "offset": 12
    },
    {
      "val": "UserRating",
      "offset": 28
    }
  ],
  "location": "registrationStep.clickOnElementByText(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4898034833,
  "status": "passed"
});
});