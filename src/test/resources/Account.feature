Feature: Account

  Scenario: User deposits money into their account
    Given The user balance is 100 dollar
    When The user deposits 50 dollar
    Then The users balance is 150 dollar