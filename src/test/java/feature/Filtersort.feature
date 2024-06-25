
@tag
Feature: Test Filtersort functionality

  Background: User is logged in
    Given Browser is open
    When user enter Prabhjotkaur9117@gmail.com and Dhaliwal98
    Then return Homepage

@tag1
  Scenario Outline: Check functionality of Filtersort
    When user move to searchbox and enter "iwoly vacuum"
    And  User click on searchbtn
    And sort product by new arrival option
    
  @tag1
  Scenario Outline: Check functionality of Filtersort By highToLowPrice
    When user move to searchbox and enter "iwoly vacuum"
    And  User click on searchbtn
    And sort product by High to Low
   
    