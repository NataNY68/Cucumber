@regression2 @scenarioOutline
Feature: Testing the Search Functionality for Etsy Scenario Outline

  Scenario Outline: Testing different data for Search Function
    Given User searches for '<item>' for Etsy WebPage
    Then User validates the Title '<title>' from Etsy

    Examples:
      | item | title      |
      | Hat  | Hat - Etsy |
      | Key  | Key - Etsy |
      | Pin  | Pin - Etsy |