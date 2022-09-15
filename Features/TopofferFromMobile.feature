@tag
Feature: Topoffer from Mobile
  Scenario: Selecting coupon code from Mobile
    Given I open browser with the url
    When I click popup
    And I click on Topoffers
    And I click on Mobile
    And I Select a offer 
    And I Copy the coupon code
    And I click on Book now
    When I click popup
    Then I should see Search flights
  