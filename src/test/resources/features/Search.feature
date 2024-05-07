@search
Feature: Google search functionality

  @search1
  Scenario: Verify user can search products in English
    Given user is on google search page
    When user enters "kiwi" in the search box
    And user clicks on search button
    Then verify results contain "kiwi"

  @search2
  Scenario Outline: To test multiple sets of data
    Given user is on google search page
    When user enters "<product>" in the search box
    And user clicks on search button
    Then verify results contain "<product>"
    Examples:
      | product    |  |
      | apple      |  |
      | banana     |  |
      | washington |  |
      | island     |  |
      | computer   |  |
      | orange     |  |



