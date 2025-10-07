Feature: Parameterized Feature

  Background: Go to app
    Given user visits "https://claruswaysda.github.io/deleteChars.html"

  @DeleteChars
  Scenario: Parameterized Scenario
    When user enters "John" into input
    Then close browser

  @DeleteChars
  Scenario: Parameterized Scenario
    When user enters "Mary" into input
    Then close browser

  @DeleteChars
  Scenario: Parameterized Scenario
    When user enters "Tom" into input
    Then close browser

  @DeleteChars
  Scenario: Parameterized Scenario
    When user enters "George" into input
    Then close browser