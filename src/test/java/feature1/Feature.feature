@tag
Feature: Application login

  @tag1
  Scenario: Instagram login
    Given User is on login page
    When  Valid login id and Password
     Then Navigate to Instagram home page

     @tag2
     Scenario: Gaming Login
     Given Player is in Login page
     When Valid login Id "Sweety" and valid password "Sweety123" are provided
     Then Main Lobby appears