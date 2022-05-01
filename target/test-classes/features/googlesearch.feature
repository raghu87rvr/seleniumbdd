Feature: Feature to validate google search function

  Scenario: Validate google search is working
    Given Browser is opened
    And User is on google search page
    When User enters text in the search box
    And Clicks on search button or enter
    Then User landed on searched results
