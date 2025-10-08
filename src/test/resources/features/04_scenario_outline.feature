Feature: Parameterized Feature

  Background: Go to app
    Given user visits "https://claruswaysda.github.io/deleteChars.html"

  @SODeleteChars
  Scenario Outline: Parameterized Scenario
    When user enters "<name>" into input
    Then close browser
    Examples:
      | name |
      | Tom |
      | Mary |
      | Terry |
      | John |

