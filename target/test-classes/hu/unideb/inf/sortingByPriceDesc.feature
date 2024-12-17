Feature: Inventory Sorting by Price (High to Low)

  Background:
    Given the home page is displayed
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Sorting items by price (high to low)
    When I select 'Price (high to low)' from the filter dropdown
    Then the items should be sorted by price in descending order
