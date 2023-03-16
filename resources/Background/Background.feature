Feature: Feature to test the SignUp form

  Background: User is logged in
    Given User is on login screen
    When User enter username and password
    And User click on login button
    Then User is rediretced to the Home screen

  Scenario: Test SignUp Form
    When User fill the SignUp form
    And User clicks on save button
    Then Form is saved

  Scenario: Test logout functionality
    When User clicks on logout button
    Then User will be redirected the login screen
