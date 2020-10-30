Feature: Login User

  Scenario: Login user
    When click create account
    And fill email field as "vavolit971@dmeproject.com"
    And fill name field as "NameTest"
    And fill last name field as "LastNameTest"
    And fill password field as "Password"
    Then click start learning

  Scenario Outline: Add pet by API
    Then create pet with petId as <petId> petName as "<petName>" CategoryId as <CategoryId>  CategoryName as "<CategoryName>" by api
    Then check created pet petId as <petId> by api

    Examples:
      | petId | petName | CategoryId | CategoryName |
      | 115   | Barsik  | 45         | Cat          |