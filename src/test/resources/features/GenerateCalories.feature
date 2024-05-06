Feature: Generate Calories feature

  @generateCalories
  Scenario: Verify user can generate 4 meals for given amount of calories
    Given user goes to "https://www.eatthismuch.com/"
    And user enters 2500 calories
    Then user selects 4 meals
    And user clicks on generate
    Then verify 4 meals are generated


