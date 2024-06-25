
@tag
Feature: Test Shoppingcart functionality

  Background: User is logged in
    Given Browser is open
    When user enter Prabhjotkaur9117@gmail.com and Dhaliwal98
    Then return Homepage
    
    Scenario Outline: Check functionality of Addproduct
    When user move to searchbox and enter "iwoly vacuum"
    And  User click on searchbtn
    And  click on product to buy
    And  Select the quantity
    Then Return final page
    

