Feature: Validate Inventory Sorting by Price

  Background:
    Given the home page is displayed
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Verify sorting products by price from low to high
    When I select 'Price (low to high)' from the filter dropdown
    Then all items should appear sorted by price in ascending order