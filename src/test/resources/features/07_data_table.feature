Feature: Data Table Test

  @DataTable
  Scenario: Data Table Scenario
    Given use gets list of string
      | John   |
      | Mary   |
      | Tom    |
      | Bob    |
      | Cedric |
      | Tim    |
      | Kevin  |
    When user gets map of string
      | John   | 35 |
      | Mary   | 43 |
      | Tom    | 12 |
      | Bob    | 35 |
      | Cedric | 15 |
      | Tim    | 6  |
      | Kevin  | 60 |
    And user gets list of list of string
      | John   | Doe    | 35 | New York |
      | Mary   | Allen  | 43 | Berlin   |
      | Tom    | Hawk   | 12 | London   |
      | Bob    | Jessie | 35 | Paris    |
      | Cedric | Mal    | 15 | Rome     |
      | Tim    | Carter | 6  | Riyad    |
      | Kevin  | Hook   | 60 | Sydney   |
