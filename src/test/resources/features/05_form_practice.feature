Feature: Form Feature


  @Form
  Scenario Outline: Form Test
    Given user visits "https://testpages.eviltester.com/styled/validation/input-validation.html"
    When user enters first name "<firstname>"
    And user enters last name "<lastname>"
    And user enters age "<age>"
    And user enters country "<country>"
    And user enters notes "<notes>"
    Then close browser
    Examples:
      | firstname | lastname | age | country      | notes                  |
      | Kevin     | Black    | 60  | Germany      | Kevin is from Germany! |
      | Sean      | White    | 45  | Yemen        | Hello from Sean        |
      | John      | Doe      | 25  | Saudi Arabia | Hello from John        |
      | Mary      | Terry    | 20  | Singapore    | Hello from Mary        |
