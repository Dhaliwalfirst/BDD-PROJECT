
@tag
Feature: Test Orderpage functionality.

  Background: User is logged in
    Given Browser is open
    When user enter Prabhjotkaur9117@gmail.com and Dhaliwal98
    Then return Homepage

  @tag1
  Scenario Outline: Check functionality of Myorderpage
    When user moves to accountslists
    And click on youraccounts
    And click on your order
    And click on Buy Again
    And Click on Not yet shipped
    And Click on Canacelled Order
    Then Close all windows
