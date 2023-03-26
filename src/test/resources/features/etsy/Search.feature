@regression
Feature: Testing the Search Functionality of Etsy

   Scenario: Validation Title of Etsy Hat
     Given User searches for 'Hat' for Etsy WebPage
     Then User validates the Title 'Hat - Etsy' from Etsy

  Scenario: Validation Title of Etsy Hat
    Given User searches for 'Key' for Etsy WebPage
    Then User validates the Title 'Key - Etsy' from Etsy

  Scenario: Validation Title of Etsy Hat
    Given User searches for 'Pin' for Etsy WebPage
    Then User validates the Title 'Pin - Etsy' from Etsy

