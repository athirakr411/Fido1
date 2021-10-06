@Chrome
Feature: Validate search functionality


  @SanityFlow
  Scenario: Search for a product and validate results

    Given fido webpage is launched in "chrome"
    When user clicks on shop
    And continues selecting
    Then Build your plan page will be displayed



