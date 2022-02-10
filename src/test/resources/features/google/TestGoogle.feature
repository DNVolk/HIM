@RegressionUI @SmokeTest @QAEnv
Feature: As a user i should be able to search using google search
  blah blah
  blah blah

  Background: blah blah
    Given User is on the main page


  @Mytag @JiraTicket1
  Scenario : Google search Enter test
  (this is Scenario description)
    When User inputs "cucumber" and presses Enter
    Then Search result contains "cucumber"

  @Mytag @JiraTicket2
  Scenario Outline: Google search Enter test
  (this is Scenario description)
    When User inputs "<userInput>" and presses Enter
    Then Search result contains "<expectedSearchResult>"
    Examples: blah blah
      | userInput | expectedSearchResult |
      | cucumber  | banana               |
      | cucumber  | cucumber             |
      | pineapple | cucumber             |
