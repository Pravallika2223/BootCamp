Feature: Application login

  @smoke 
  Scenario: Home page default login
    Given User is on netbanking landing page 
    When User loging into app using credentials
    Then Home is poppulated
  @Regression
   Scenario: Post Operation - Registration
    Given User is on Register Page
    When Provided with accurate email and password
    Then Register Successful  
   @smoke @Regression
    Scenario: Get Operation - List the Users
     Given The user in request page
     When clicking on request url
     Then List all the users 
   @smoke1
   Scenario: Get Operation - Single User
     Given User will be in Request page
     When URL is provided
     Then get the details of the user
   @Regression1
   Scenario: Post Operation - create user details
    Given Api for Foreign Exchane
     When Posted with correct information
     Then validate positive response code recieved 
  @smoke2
   Scenario: Delete Operation
     Given user is on Request Page
     When delete operation is initiated
     Then details must be deleted
   @smoke3
     Scenario: Put Operation - Updating details
      Given the link for user to update
      When provided precise details to update
      Then update operation should be done
    @Regression2
     Scenario: Patch Operation
      Given user is on the requested page
      When valid credentials are provided
      Then User details should update
    @smoke4
     Scenario: Negative Scenario for Post Operation
      Given ApI for foreign exchange 
      When invalid username or empty password provided
      Then Accurate error message should be displayed
     @Regression3
      Scenario: Negative Scenario for Get Operation
       Given API for foreign exchange
       When unknown resourse is found
       Then Accurate unknown message should be displayed 
    