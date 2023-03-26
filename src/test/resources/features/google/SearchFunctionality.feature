Feature: Testing Google Search Functionality
  #Is a general description

  Scenario: Happy Path (Positive) Testing for Search
    #is a test case

    Given User navigate to the Google
    When user searches for CodeFish
    Then user gets more than ten links on the first page


    Scenario: Happy Path (positive) Testing result from search

      Given User navigate to the Google
      When User search for Kyrgyz food in USA
      Then User gets a number of results more than one hundred million result

    Scenario: Happy path (positive ) Testing searchTime from Search

      Given User navigate to the Google
      When User searches for Turkish Baklava
      Then User validates searches is done less than one sec