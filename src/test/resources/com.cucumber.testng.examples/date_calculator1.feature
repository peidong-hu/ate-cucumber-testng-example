@calculator
Feature: Feature1
  indeed.ca job search

  Scenario: search on home page
    Given "homepage" of "indeed.ca"
    	And the following search data
    	|JobSearchKeyWord   |location    |
    	|QA Automation		|Montreal, QC|
    	|QA Analyst   		|Toronto, ON |
    When type in JobSearchKeyWord and location "Toronto, ON"
    	And click "Search" button
    Then there should be 20 non-ads jobs listed

