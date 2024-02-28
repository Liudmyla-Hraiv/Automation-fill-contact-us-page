Feature: Contact us form
  Scenario Outline: Check "contact us" page  with valid date (positive tests)
    Given open URL link
    When fill fields "<FirstName>" "<LastName>" "<Email>" "<Text>"
    Then message shown "<Message>"
    Examples:
      | FirstName | LastName | Email            | Text  |Message                    |
      |Ivan       |Ivanov    |Ivanov@gmail.com  |Test1  |Thank You for your Message!|
      |123        |123       |Ivanov@gmail.com  |1      |Thank You for your Message!|
      |-          |-         |example@gmail.com |-      |Thank You for your Message!|


  Scenario Outline: Check c"contact us" page with Invalid date (negative tests)
    Given open URL link
    When fill fields "<FirstName>" "<LastName>" "<Email>" "<Text>"
    Then Error message shown "<errorMessage>"
    Examples:
      | FirstName | LastName | Email            | Text  |errorMessage                   |
      |           |Smith     |Ivanov@gmail.com  |Test2  | Error: all fields are required |
      |Ivan       |          |Ivanov@gmail.com  |Test1  | Error: all fields are required |
      |Oliver     |Smith     |                  |Test2  | Error: Invalid email address |
      |Oliver     |Smith     |something         |Test2  | Error: Invalid email address |
      |Oliver     |Smith     |something@        |Test2  | Error: Invalid email address |
      |Ivan       |Ivanov    |any@example.com   |       | Error: all fields are required |
#      |           |          |                  |       | Error: all fields are required |
