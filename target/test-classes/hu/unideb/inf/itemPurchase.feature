Feature: item Purchase Functionality

  Background:
    Given the home page is displayed
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario Outline: item Purchase Flow
    Given the '<itemName>' is added to the cart
    And the 'Cart' button is clicked
    And the 'Checkout' button is clicked
    And the 'First Name' field is filled with 'first_name'
    And the 'Last Name' field is filled with 'last_name'
    And the 'Zip Code' field is filled with '1234'
    When the 'Continue' button is clicked
    Then the price should read '<total>'
    And the 'Finish' button is clicked
    And the 'Back Home' button is clicked


    Examples:
      | itemName                          | total         |
      | Sauce Labs Backpack               | Total: $32.39 |
      | Sauce Labs Bike Light             | Total: $10.79 |
      | Sauce Labs Bolt T-Shirt           | Total: $17.27 |
      | Sauce Labs Fleece Jacket          | Total: $53.99 |
      | Sauce Labs Onesie                 | Total: $8.63  |
      | Test.allTheThings() T-Shirt (Red) | Total: $17.27 |