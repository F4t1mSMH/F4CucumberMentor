Feature: Login Feature

  @Login
  Scenario: Happy Path
    Given user is on the signin page
    When user enters valid username
    And user enters valid password
    And user click on submit button
    Then user validates the signin
    And close browser