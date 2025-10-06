Feature: Arithmetic Operations
@addition
  Scenario: Add two numbers
    Given the first number is 8
    And the second number is 8
    When I add the numbers
    Then the result should be 16