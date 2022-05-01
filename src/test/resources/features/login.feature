Feature: Feature to test login function

  Scenario: Verify login is succsessfull with valid credentials
    Given User is on login page
    When Enters the username and password
    And Clicks the login button
    Then User navigates to home page
