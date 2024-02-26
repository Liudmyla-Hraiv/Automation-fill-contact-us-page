Feature: Contact us form

  Scenario Outline: Check contact us form with valid date and submit
    Given open URL link
    When fill fields "<FirstName>" "<LastName>" "<Email>" "<Text>"
    Then Message: Thank you for your Message!
    Examples:
      | FirstName | LastName | Email            | Text  |
      |Ivan       |Ivanov    |Ivanov@gmail.com  |Test1  |
      |John1      |-         |John@gmail.com    |-      |
      |123        |123       |Ivanov@gmail.com  |Test2  |
#      |           |          |                  |       |