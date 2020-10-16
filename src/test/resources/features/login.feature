Feature: Login User

  Scenario: Login user
    When click create account
    And fill email field as "vavolit971@dmeproject.com"
    And fill name field as "NameTest"
    And fill last name field as "LastNameTest"
    And fill password field as "Password"
    Then click start learning