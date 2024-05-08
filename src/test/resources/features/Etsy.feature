Feature:

  @etsy
  Scenario: verify etsy
    When user print url
    Then verify url contains "etsy"
    Then user enters "<product>" in the search box
    Then user verify something
