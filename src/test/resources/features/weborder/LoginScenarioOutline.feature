@scenarioOutline1
Feature: Testing negative login

  Scenario Outline: negative login
    When User provides '<username>' and '<password>' for WebOrder
    Then User validates the '<errorMessage>' error message

    Examples:
      | username              | password | errorMessage   |
      | guest1@microworks.com | asdfgas  | Sign in Failed |
      | nataliia@gmail.com    | Guest1!  | Sign in Failed |
      | nataliia@gmail.com    | asdfgas  | Sign in Failed |
      | guest1@microworks.com |          | Sign in Failed |
      | nataliia@gmail.com    |          | Sign in Failed |
      |                       | Guest1!  | Sign in Failed |
      |                       | abc      | Sign in Failed |
      |                       |          | Sign in Failed |
