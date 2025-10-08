Feature: User Registration with Multiple Data Sets
  @UserRegistration
  Scenario Outline: Register a new user with provided details

    Given I navigate to the registration form at "https://claruswaysda.github.io/form.html"
    When I fill in the Social security number "<ssn>" first name "<firstName>" and last name "<lastName>"
    And i fill in the address "<address>" and phone number "<phoneNumber>"
    And I fill in the username "<username>" and the email "<email>"
    And I fill in the password "<password>" and confirm password "<confirm-password>"
    And I click the Register button
    Then I should see a successful registration message

    Examples:
     | ssn    | firstName | lastName  | address                          | phoneNumber  | username  | email               | password   | confirm-password |
     | 12345  | Ada       | Wong      | 10 Main St, resident evil, USA   | 555-123-4567 | AdaWo31   | Ada@re.com          | Secure123  | Secure123        |
     | 23456  | Carlos    | Oliveira  | 42 Oak Ave,resident evil, CA     | 555-987-6543 | Carlos01  | Carlos@re.com       | Testing456 | Testing456      |
     | 34567  | Kim       | Dokja     | 3 River Rd, resident evil, TX    | 555-555-0000 | Kim49     | kimdokja@orv.net    | Kim789!    | Kim789!         |
     | 45678  | Leon      | Kennedy   | 2 T2 Way, resident evil, WA      | 555-101-2020 | Leon99    | leonken@re.com      | Leon101    | Leon101         |
     | 56789  | Jill      | Valentine | 1 Legal Ln, resident evil, NY    | 555-333-1122 | Jill02    | Jill.val@re.com     | SuitsUp00  | SuitsUp00      |
     | 67891  | Ash       | Lynx      | 5 Pine St, new york, USA         | 555-444-5566 | Ash19     | AshLyn@bf.com       | pass1234   | pass1234       |
