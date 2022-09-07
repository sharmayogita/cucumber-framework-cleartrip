Feature: Top offers for hotels
  I want to use this template for check top offers for hotels

 
  Scenario: Check top offers for hotels 
    Given I open browser 
    When I click on Top offers
    Then I click on Hotels
    Then I should see hotel offer page
    When  I click any offer
    Then I should see particular offer page
    When I copy the coupen code
    And I click on the book now
    Then I should see search for hotels page
    When I click particular hotel 
    Then I should see particular hotel booking page
    When I click select room 
    When i click book 
    Then I should see contine to booking page
   
   
 