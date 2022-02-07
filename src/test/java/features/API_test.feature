Feature: Test Github API

  Scenario Outline: user able to validate the github API response
    Given user sets the base API request <URL>
    And user authenticates the API <token>
    When user sends the API request to get all the repositories
    Then user validates the API response status is <code>

    Examples: 
      | URL | token | code |
