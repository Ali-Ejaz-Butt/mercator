Feature: Adding high value product in shopping cart

  As a user of Saucedemo shopping site,
  I want to add the highest price item to my cart.

  Scenario: User adding highest price item to the cart
    Given I navigate to Saucedemo login page
    When I log in with valid credentials
    Then I land on the Products page successfully
    When I find and add the highest price item to the cart
    And I go to the cart
    Then I should see the selected highest price item in the cart