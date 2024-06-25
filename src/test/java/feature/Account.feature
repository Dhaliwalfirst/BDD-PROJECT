
@tag
Feature: Test Accountpage functionality.

  Background: User is logged in
    Given Browser is open
    When user enter Prabhjotkaur9117@gmail.com and Dhaliwal98
    Then return Homepage

  @tag1
  Scenario Outline: Check functionality of Myaccounts
    When user moves to accountslists
    And click on youraccounts
    And click on your order
    Then return Orderpage

  Scenario Outline: Check functionality of Mypayments
    When user moves to accountslists
    And click on youraccount
    And  click on Yourpayments
    
    Scenario Outline: Check functionality of Mypayments
    When user moves to accountslists
    And click on youraccount
    And  click on youraddress
    Then Close the page
    