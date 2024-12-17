Feature: Invalid Login Attempt

  Background:
    Given the home page is displayed

  Scenario Outline: Logging in with invalid credentials
    Given the 'Username' field is filled with '<username>'
    And the 'Password' field is filled with '<password>'
    When the 'Login' button is clicked
    Then an '<errorMessage>' should be displayed

    Examples:
      | username       | password     |
      | invalid_user   | wrong_pass   |
      | test_user      | incorrect_pw |
      | non_existent   | 123456       |
      | demo_user      | password123  |