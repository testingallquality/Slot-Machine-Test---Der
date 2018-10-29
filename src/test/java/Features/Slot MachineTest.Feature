Feature: SlotMachineTest
  This feature deals with the test of multiple features present on Slot Machine page

  Scenario: 1.Correct Page is loaded within expected load time (5 Sec)
    Given I launch the browser
    And I pass the correct URL
    Then I should see the slot machine page with Slots table Current_Balance Set_test_data and description


  Scenario Outline: 2.Pay_table table should display combination and win balance correctly
    Given I navigate to the Slot Machine page
    And I verify <combination> and <win>
    Then I should see the 15 row Pay_table on the page

    Examples:
      | combination      | win |
      | 1 + 1 + 1        | 60  |
      | 1 + 1 + 1 + 1    | 80  |
      | 1 + 1 + 1 + 1 +1 | 100 |
      | 2 + 2 + 2        | 120 |
      | 2 + 2 + 2 + 2    | 160 |
      | 2 + 2 + 2 + 2 + 2| 200 |
      | 3 + 3 + 3        | 180 |
      | 3 + 3 + 3 + 3    | 240 |
      | 3 + 3 + 3 + 3 + 3| 300 |
      | 4 + 4 + 4        | 240 |
      | 4 + 4 + 4 + 4    | 320 |
      | 4 + 4 + 4 + 4 + 4| 400 |
      | 5 + 5 + 5        | 300 |
      | 5 + 5 + 5 + 5    | 400 |
      | 5 + 5 + 5 + 5 + 5| 500 |

  Scenario: 3.Clicking to Spin coin button should reset the slot numbers
    Given I am on Slot Machine page
    And I press Spin Coin button
    Then Slot machine should be reset from previous state

  Scenario Outline: 4.Current balance is increased by Win amount when test data matches with combination
    Given I enter test data equal to <combination>
    And I click Spin Coin button
    Then Current balance is increased by <win> amount on the page

    Examples:
      | combination      | win |
      | 1 + 1 + 1        | 60  |
      | 1 + 1 + 1 + 1    | 80  |
      | 1 + 1 + 1 + 1 +1 | 100 |
      | 2 + 2 + 2        | 120 |
      | 2 + 2 + 2 + 2    | 160 |
      | 2 + 2 + 2 + 2 + 2| 200 |
      | 3 + 3 + 3        | 180 |
      | 3 + 3 + 3 + 3    | 240 |
      | 3 + 3 + 3 + 3 + 3| 300 |
      | 4 + 4 + 4        | 240 |
      | 4 + 4 + 4 + 4    | 320 |
      | 4 + 4 + 4 + 4 + 4| 400 |
      | 5 + 5 + 5        | 300 |
      | 5 + 5 + 5 + 5    | 400 |
      | 5 + 5 + 5 + 5 + 5| 500 |

  Scenario Outline: 5.Current balance is decreased by 1 when test data does not match with combination
    Given I enter test data equal to <non-combination>
    And I click Spin Coin button again
    Then Current balance is decreased by <non-win> amount on the page

    Examples:
      | non-combination    | non-win |
      | <blank>            |    1    |
      | 1                  |    1    |
      | 1 + 2 + 3          |    1    |
      | 0 + 0 + 0          |    1    |
      | a + b + c + d      |    1    |
      | @ + # + $ + % + *  |    1    |
