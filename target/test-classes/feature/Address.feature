

@tag
Feature: Test Addresspage functionality

  Background: User is logged in
    Given Browser is open
    When user enter Prabhjotkaur9117@gmail.com and Dhaliwal98
    Then return Homepage

  @tag1
  Scenario Outline: Check functionality of Myaccounts
    When user moves to accountslists
    And click on youraccounts
    Then return AccountPage
    Then click on YourAddress
    Then click on addaddress
    Then click on Country
    Then add full name
    Then add phone number
    Then add address
    Then add city
    Then add province
    Then select province
    Then add postalcode
    Then click on add address
    
    