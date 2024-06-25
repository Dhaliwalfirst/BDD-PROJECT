
Feature: Amazon TDDFramework
  I want to use this template for my feature file

 @tag1
 Scenario Outline: Check login of amazon site
 Given Browser is open
 When user enter <username> and <password>
 Then return Homepage

Examples:

 |username|password|
 |Prabhjotkaur9117@gmail.com|Dhaliwal98|
 
