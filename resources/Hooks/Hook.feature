Feature: Feature to test login functionality

  Scenario Outline: Test login functionality with valid credentials
    Given user is on login page
    When user enter <username> and <password>
    And user clicks on login button
    Then user is navigated to home page

    Examples: 
      | username |  | password |
      | user1    |  |    12345 |
      | user2    |  |    12345 |

  Scenario Outline: Test login functionality with valid credentials
    Given user is on login page
    When user enter <username> and <password>
    And user clicks on login button
    Then user is navigated to home page

    Examples: 
      | username |  | password |
      | user1    |  |    12345 |
      | user2    |  |    12345 |
