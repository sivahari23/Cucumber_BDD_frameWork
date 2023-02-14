Feature: Login model test

  Scenario: 
    Login should be success

    Given User nagvigate to the Guru99
    Given User enter the username as "mngr475863"
    Given User enter the password as "yhYsata"
    When User click on the login button
    Then Login should be sucess

  Scenario: 
    Login should not be success

    Given User nagvigate to the Guru99
    Given User enter the username as "siva"
    Given User enter the password as "123"
    When User click on the login button
    But Login should fail
