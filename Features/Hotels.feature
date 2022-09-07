@Hotels
Feature: 
  I want to use this template for Hotels feature

  @filters
  Scenario: I want to check filter features of hotels
    Given I open the browser with the url
    When I close the pop up window
    Then I should see search bar
    When I click on hotels
    And i enter destination in where to
    And i click on checkin and check-out to select the date
    And i select the noof travellers
    And i click on view all to see the allthe contents in page
    And i close the child window to see main windowforother operations
    And i get thr driver peration from child window to parent
    And i click on all clear trip deals to check working or not
    And i click on search hotels
    Then I verify modify search options
    And I verify number of filters options
    And I verify number of options for priority
    And I verify total price options
    And I verify Hotel class options
    And I verify Special offers options
    And I verify TripAdviser rating options
    And I verify Amenties options
    And I verify Property type options 
    When I validate modify search
    And I validate number of options for priority
    And I validate filter by hotels
    And I validate total price
    And I validate Hotel class
    And I validate Special offers
    And I validate TripAdviser rating
    And I validate Amenties
    And I validate Property type
    And User click View Details button
    And User Select room
    And User verify Traveller reviews
    And Verify Hotel amenities
    And User Click Map view
    And User click book button
    And Click View all button and verify title
    And User click continue
    And Add contact details
    And click continue
    And user Add travellers details
    And click continueto payment
    Then close browser
