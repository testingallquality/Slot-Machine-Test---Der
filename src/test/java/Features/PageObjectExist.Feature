Feature: PageObjectExist
  This feature tests the appearance of all important page objects on Slot machine page.

  Scenario Outline: Page Object Existence on Slot machine page
    Given I launch the Slot machine page first time
    Then  I see page objects <page object>

    Examples:
      | page object           |
      | Automation            |
      | description           |
      | table                 |
      | slot                  |
      | balance-label         |
      | balance-value         |
      | spinButton            |
      | data                  |