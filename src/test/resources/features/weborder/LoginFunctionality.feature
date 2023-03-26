@regression

Feature: Testing Login Functionality of WebOrder Page

  @smoke
  Scenario: Testing Positive login(correct username + correct password)
    When User provides 'guest1@microworks.com' and 'Guest1!' for WebOrder
    Then User validates the 'ORDER DETAILS - Weborder' from homepage

  Scenario: Testing negative login(correct username + wrong password)
    When User provides 'guest1@microworks.com' and 'asdfghj' for WebOrder
    Then User validates the 'Sign in Failed' error message

  Scenario: Testing negative login(wrong username + correct password)
    When User provides 'nataliia@gmail.com' and 'Guest1!' for WebOrder
    Then User validates the 'Sign in Failed' error message

  @smoke
  Scenario:Testing negative login(wrong username + wrong password)
    When User provides 'nataliia@gmail.com' and 'asdfgas' for WebOrder
    Then User validates the 'Sign in Failed' error message

  Scenario:Testing negative login(correct username + no password)
    When User provides 'guest1@microworks.com' and '' for WebOrder
    Then User validates the 'Sign in Failed' error message

  Scenario:Testing negative login(wrong username + no password)
    When User provides 'nataliia@gmail.com' and '' for WebOrder
    Then User validates the 'Sign in Failed' error message

  Scenario:Testing negative login(no username + correct password)
    When User provides '' and 'Guest1!' for WebOrder
    Then User validates the 'Sign in Failed' error message

  Scenario:Testing negative login(no username + wrong password)
    When User provides '' and 'zxcvg' for WebOrder
    Then User validates the 'Sign in Failed' error message

  Scenario:Testing negative login(no username + no password)
    When User provides '' and '' for WebOrder
    Then User validates the 'Sign in Failed' error message
