Feature: Top Offers for International Flights
  I want to use this template for International Flights Offers

  
  Scenario: Working with International Offers
   Given User Opens browser
    When User click on Top offers
    When User click on International Flights
    Then User should see International flights offer page
    When user copy the coupen code
    Then User Select available Offer
    When User click on Book Now option
    Then User see Search Flights Page
    When User search flight from source to destination
    Then User booking flight
    Then User enter Coupen code and click continue button

  