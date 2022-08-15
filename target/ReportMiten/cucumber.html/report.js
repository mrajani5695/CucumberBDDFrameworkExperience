$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/awsomecucumber/add_to_cart.feature");
formatter.feature({
  "name": "Add to Cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add one quantity from Store",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am in the Store page",
  "keyword": "Given "
});
formatter.step({
  "name": "I add a \"\u003cproduct_name\u003e\" to the Cart",
  "keyword": "When "
});
formatter.step({
  "name": "I see 1 \"\u003cproduct_name\u003e\" in the cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product_name"
      ]
    },
    {
      "cells": [
        "Blue Shoes"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add one quantity from Store",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the Store page",
  "keyword": "Given "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.StoreStepDefination.i_am_in_the_Store_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a \"Blue Shoes\" to the Cart",
  "keyword": "When "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.StoreStepDefination.i_add_a_to_the_Cart(awsomecucumber.domainobjects.Product)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see 1 \"Blue Shoes\" in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.CartStepDefinations.i_see_in_the_cart(int,awsomecucumber.domainobjects.Product)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/awsomecucumber/guest_place_an_order.feature");
formatter.feature({
  "name": "Place an Order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "using default payment option",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a Guest Customer",
  "keyword": "Given "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.CustomerStepDefinations.i_am_a_Guest_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my billing details are",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.CustomerStepDefinations.myBillingDetailsAre(awsomecucumber.domainobjects.BillingDetails)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a product in the cart",
  "keyword": "And "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.StoreStepDefination.i_have_a_product_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Checkout Page",
  "keyword": "And "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.CheckOutStepDefinations.i_am_on_the_Checkout_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide billing details",
  "keyword": "When "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.CheckOutStepDefinations.i_provide_billing_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I place an order",
  "keyword": "And "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.CheckOutStepDefinations.i_place_an_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the order should be placed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "awsomecucumber.stepdefinations.CheckOutStepDefinations.the_order_should_be_placed_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});