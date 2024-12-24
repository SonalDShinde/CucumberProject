Feature: Login Functionality

  Scenario: Login with valid credentials
    Given User has navigated to login page
    When User Enter valid email address "amotooricpa9@gmail.com" into email feild
    And User has enter valid password "12345" into password feild
    And User click on login button
    Then User should get successfully log in
