Feature: Test Homepage functionality

  Background: User is logged in
    Given Browser is open
    When user enter Prabhjotkaur9117@gmail.com and Dhaliwal98
    Then return Homepage

  @tag1
  Scenario Outline: Check functionality of Myaccounts
    When user moves to accountslists
    And click on youraccounts
    Then return AccountPage

  Scenario Outline: Check functionality of Myorders
    When user moves to accountslists
    And click on yourorders
    Then return OrderPage
    
   Scenario Outline: Check functionality of Myrecommendations
    When user moves to accountslists
    And click on yourrecommendations
    Then return recommendatopnspages
    

    Examples: 
      | username                   | password   |
      | Prabhjotkaur9117@gmail.com | Dhaliwal98 |
