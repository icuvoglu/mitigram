@login
Feature: Login functionality


  @valid
  Scenario: Login with valid credentials

    Given user clicks login button
    When user enters valid credentials
    And user clicks Log in button in Login page
    Then verify user navigated to home page


  @invalid
  Scenario: Login with invalid credentials

    Given user clicks login button
    When user enters invalid credentials as follows
      | email    | xyz@mitigram.com |
      | password | abc12345         |

    And user clicks Log in button in Login page
    Then verify error message is displayed


  @empty
  Scenario: Login with empty credentials

    Given user clicks login button
    When user clicks Log in button in Login page
    Then verify error message is displayed

##  We can add some more negative TestCases such as
#    * Login with valid email and invalid password
#    * Login with invalid email and valid password

