Feature: WinningConditionsMet
  This feature validates the winning conditions for the slot machine.

  Scenario: Spin with Winning test data
    Given I launch the slot machine page
    When  I spin with Winning test data
    Then  I see Win Coins message

  Scenario: Winning condition increases Current balance
    Given I launch the slot machine page again
    When  I spin with Winning test data again
    Then I see current balance is increasing