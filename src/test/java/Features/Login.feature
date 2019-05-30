Feature: LoginFeature
  This feature deals with the Login fucntionality of Guru99 Demo application

  Scenario: Login with correct username and password
    Given I navigate to the login page of the applicaiton
    And I enter the username and password
    And I click the Login button
    Then I should see the Home Page