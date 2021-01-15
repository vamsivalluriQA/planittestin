Feature: booking an order

  Scenario: order booking test
    Given launch site using "chrome"
    When Click on Login button
    Then userid should be visible
    When Login with given credentials "7386861020","Valluri@1020"
    Then Validate the user account

