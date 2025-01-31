#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Title of Swag Labs 
  I want to use this add cart for my feature file

   Scenario Outline: This test is to verify Swag Labs ecommerce page
    Given Login with Valid Crenditial "<Username>" and "<Password>"
    When user is want to buy product and add to cart 
    When User is to verify the product and continue to checkout 
    And User is to given details 
    |Firstname|Lastname|Pincode|
    |Lingeswar|AK      |641001 |
    Then user should see Product  Name as "Thank you for your order!" and Finish

    Examples: 
      | Username      | Password |
      | standard_user |     secret_sauce | 
      