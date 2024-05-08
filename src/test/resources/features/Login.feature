@login
Feature: Verify user is able to login

  Background:
    Given user is on login page
    When user enters "<userName>"
    And user enters "<password>"
    Then user clicks in login button


  @loginPositive
  Scenario Outline: User is successfully login with valid credentials
    Then verify user redirected to the home page
    Examples:
      | userName | password    |
      | Mike     | password123 |
      | Sara     | password256 |
      | Alex     | password698 |

  @loginNegative
  Scenario Outline: User enters with invalid credentials
    Then verify user fails to login
    Examples:
      | userName    | password    |
      | Mike        | invalidPass |
      | invalidUser | password256 |
      | Alex        |             |
      |             | dfgdfgdfg   |



