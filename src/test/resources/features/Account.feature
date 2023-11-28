Feature: Account

  Scenario: User deposits money into their account
    Given The user balance is 150 dollar
    When The user deposits 1000 dollar
    Then The user balance should be 1150 dollar
    Example:
      | startingBalance | amount | newBalance |
      | 150              | 1000   | 1150        |