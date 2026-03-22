Feature: Login Test

  Scenario: Valid Login
    Given user opens login page
    When user enters username and password
    Then user should see success message