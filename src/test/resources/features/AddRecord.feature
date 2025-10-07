Feature: User Management Operations - People Information Table

Background:
    Given the user opens the browser
    And the user navigates to the "People Information" page

@smoke @create
Scenario: Create a default new user
    When the user enters new user record and adds the user
    Then the record for the default new user should be displayed in the table

@update
Scenario: Update existing user
    Given a record for "David Lee" exists in the table
    When the user edits the record for "David Lee" and changes Age to "25"
    Then the record for "David Lee" should show the updated Age "25"

@delete @critical
Scenario: Delete a user
    Given a record for "Laura Miller" exists in the table
    When the user deletes the record for "Laura Miller"
    Then the record for "Laura Miller" should not be displayed in the table

@smoke @search
Scenario: Search for a user
    Given a record for "John Doe" exists in the table
    When the user checks for the existence of record "John Doe"
    Then the record for "John Doe" should be found in the table