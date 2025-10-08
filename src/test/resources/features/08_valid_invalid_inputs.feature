@ValidInvalid
Feature: valid_invalid_inputs

  Background:
    Given user visits "https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html"

  Scenario: valid inputs
    Given user enters valid inputs
      | 1234567 |
      | sdertyh |
      | Se3*098 |
      | nhy6543 |
      | HT*76hn |
    Then close browser

  Scenario: invalid inputs
    Given user enters invalid inputs
      | ()/&%+^'111     |
      | abc             |
      | aaaaaaaaaaaaaaa |
      | **              |
      | =)(/&%+'!       |
    Then close browser