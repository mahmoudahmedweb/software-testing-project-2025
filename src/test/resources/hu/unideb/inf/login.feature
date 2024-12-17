Feature: User login functionality

Background:
    Given the home page is displayed

Scenario Outline:  Valid login credentials
    Given the 'Username' field is filled with '<username>'
    And the 'Password' field is filled with '<password>'
    And the 'Login' button is clicked
    Then I should be redirected to the inventory page
    Examples:
        | username                | password     |
        | standard_user           | secret_sauce |
        | problem_user            | secret_sauce |
        | performance_glitch_user | secret_sauce |
        | error_user              | secret_sauce |
        | visual_user             | secret_sauce |