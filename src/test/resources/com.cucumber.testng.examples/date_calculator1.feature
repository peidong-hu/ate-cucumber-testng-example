@calculator
Feature: Feature1
  indeed.ca job search

  Scenario: search on home page
    Given "homepage" of "indeed.ca"
    	And the following search data
    	|jobTitle     |location    |
    	|QA Automation|Montreal, QC|
    	|QA Analyst   |Toronto, ON |
    When type in "jobTitle" and "location"
    	And click "Search" button
    Then there should be 20 non-ads jobs listed

