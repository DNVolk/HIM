Feature: Buying Iphone experience


  @Apple
    Background:
  Scenario:
    Given user is on a "appleWebSite" page
    Then user should be on "Apple" page
    Then user should be able to see following list included in the menu items
      | Store  |
      | Mac    |
      | Ipad   |
      | Iphone |
    When user clicks menu item ""
    Then user should be on "iPhone - Apple" page
    When user clicks "" button
    Then user should be on "" page
    And user should be able to see following available options
      | iPhone 13 Pro     |
      | iPhone 13 Pro Max |
    When user selects "" product
    Then user should see following available colors
      | Sierra Blue |
      | Silver      |
      | Gold        |
      | Graphite    |
    When user selects "" color
    Then user should see following available capacities
      | 128Gb |
      | 256Gb |
      | 512Gb |
      | 1tb   |
    When user selects capacity of ""
    Then user should see following available carrier options
      | AT&T                      |
      | Sprint                    |
      | T-Mobile                  |
      | Verizon                   |
      | Connect on your own later |
    When user selects "" carrier option
    Then user should see following available trade in options
    |No|
    |Yes|
    When user selects "" trade in option
    Then user should see following available payment options
    |Apple Card Monthly installments|
    |One-time payment               |
    When user selects "" payment option
    Then user should see following available coverage options
    |AppleCare+|
    |AppleCare+ with Theft and Loss|
    |No AppleCare+ coverage        |
    When user selects "" coverage option
    Then user should see charge amount as ""
    And user should be able to see "" button



























































