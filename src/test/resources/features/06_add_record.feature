Feature: Add Record

  @AddRecord
  Scenario: Add Record Scenario
    Given user visits "https://claruswaysda.github.io/addRecordWebTable.html"
    When enter data
      | John  | 15 | Germany   |
      | Mary  | 25 | Canada    |
      | Tom   | 25 | UK        |
      | Kevin | 30 | USA       |
      | Bob   | 10 | Australia |
      | Hans  | 40 | Germany   |
    #Rest is homework
    #Then assert added records
    Then close browser
