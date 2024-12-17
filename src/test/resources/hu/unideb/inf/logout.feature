Feature: Logout functionality

  Background:
    Given the home page is displayed

  Scenario Outline: Logging out of SauceDemo
    Given the 'Username' field is filled with '<username>'
    And the 'Password' field is filled with '<password>'
    And the 'Login' button is clicked
    And I am on the inventory page
    When the 'Menu' button is clicked
    And the 'Logout' button is clicked
    Then I should be redirected to the login page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |