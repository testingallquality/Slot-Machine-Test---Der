Feature: Spinning Property of the page
  This feature tests the Spinning Property  on Slot machine page.

  Scenario: Spin and verify slot numbers are displayed
    Given I launch the page
    When  I click on Spin button
    Then  The slot numbers are displayed

  Scenario: Spin and verify current balance is updated
    Given I launch the page again
    When  I click on Spin button again
    Then The current balance is changing