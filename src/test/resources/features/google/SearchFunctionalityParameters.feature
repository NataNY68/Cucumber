Feature: Testing Google Search Functionality

  Background: navigation to the website
    Given User navigates to the 'https://www.google.com/'

  Scenario: Happy Path (Positive) Testing for Search
  #  Given User navigates to the 'https://www.google.com/'
    When user searches for 'CodeFish'
    Then user gets more than 10 links from first page

    Scenario: Happy Path (positive) Testing result from search
     # Given User navigates to the 'https://www.google.com/'
      When user searches for 'Kyrgyz Food in USA'
      Then User validates a number of results more than 10000000

