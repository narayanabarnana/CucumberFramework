$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CallCreation.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file contains scenarios for Call in Free CRM",
  "description": "",
  "id": "this-feature-file-contains-scenarios-for-call-in-free-crm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 329608637,
  "status": "passed"
});
formatter.before({
  "duration": 11541689234,
  "status": "passed"
});
formatter.before({
  "duration": 6088158901,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "This scenario is to create call in CRM Application",
  "description": "",
  "id": "this-feature-file-contains-scenarios-for-call-in-free-crm;this-scenario-is-to-create-call-in-crm-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on CRMHomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Navigates to New Call Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters the call details",
  "rows": [
    {
      "cells": [
        "CallScript",
        "AssignedTo",
        "SearchContact"
      ],
      "line": 10
    },
    {
      "cells": [
        "test",
        "Narayana B",
        "Narayana"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Extract the Task id",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Extract the Case id",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Extract the Deal id",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "DealMapStepDefination.user_is_on_CRMHomePage()"
});
formatter.result({
  "duration": 326499258,
  "status": "passed"
});
formatter.match({
  "location": "CallCreationStepDefinition.User_Navigates_to_New_Call_Page()"
});
formatter.result({
  "duration": 2711910988,
  "status": "passed"
});
formatter.match({
  "location": "CallCreationStepDefinition.user_enters_the_call_details(DataTable)"
});
formatter.result({
  "duration": 15867193759,
  "status": "passed"
});
formatter.match({
  "location": "CallCreationStepDefinition.extract_the_Task_id()"
});
formatter.result({
  "duration": 364438760,
  "status": "passed"
});
formatter.match({
  "location": "CallCreationStepDefinition.extract_the_Case_id()"
});
formatter.result({
  "duration": 340497811,
  "status": "passed"
});
formatter.match({
  "location": "CallCreationStepDefinition.extract_the_Deal_id()"
});
formatter.result({
  "duration": 292124011,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:174)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:181)\r\n\tat stepDefinations.CallCreationStepDefinition.extract_the_Deal_id(CallCreationStepDefinition.java:202)\r\n\tat ✽.And Extract the Deal id(CallCreation.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CallCreationStepDefinition.click_on_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 3147034348,
  "status": "passed"
});
formatter.uri("DealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Deals Data creation",
  "description": "",
  "id": "deals-data-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 63340287,
  "status": "passed"
});
formatter.before({
  "duration": 8184455150,
  "status": "passed"
});
formatter.before({
  "duration": 6396810788,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Creating a New Product using Deals",
  "description": "",
  "id": "deals-data-creation;creating-a-new-product-using-deals",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User is on CRMHomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User moves to New Product Page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters Product details",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Cost",
        "RetailValue",
        "WholeSalePrice",
        "SKU",
        "InventoryAmount",
        "ProductDescription"
      ],
      "line": 20
    },
    {
      "cells": [
        "test product1",
        "1000",
        "5000",
        "1500",
        "TestSKU",
        "1000",
        "TestProductDesc"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Clicked on Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Product created Succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DealMapStepDefination.user_is_on_CRMHomePage()"
});
formatter.result({
  "duration": 1394602,
  "status": "passed"
});
formatter.match({
  "location": "ProductCreationStepDefination.user_moves_to_New_Product_Page()"
});
formatter.result({
  "duration": 1848055457,
  "status": "passed"
});
formatter.match({
  "location": "ProductCreationStepDefination.user_enters_Product_details(DataTable)"
});
formatter.result({
  "duration": 4688367439,
  "status": "passed"
});
formatter.match({
  "location": "ProductCreationStepDefination.clicked_on_Save_button()"
});
formatter.result({
  "duration": 1717980942,
  "status": "passed"
});
formatter.match({
  "location": "ProductCreationStepDefination.product_created_Succesfully()"
});
formatter.result({
  "duration": 104022,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 2615974056,
  "status": "passed"
});
});