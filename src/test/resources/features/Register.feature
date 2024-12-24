Feature: Registration Functionality

  Scenario: User create an account only with mandatory feilds
    Given User navigate to register account page
    When User enters the below details feild
      | FirstName | arun                       |
      | LastName  | motoori                    |
      | email     | amotoori241222@gmail.com   |
      | telephone |                  123456789 |
      | password  |                      12345 |
    And User select privacy policy
    And User clicks on continou button
    Then User account gets created succesfully
