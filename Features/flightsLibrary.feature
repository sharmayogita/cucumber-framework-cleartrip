@tag
Feature: Round Trip 

@tag1
Scenario: Validate round Trip
Given user navigates clearTrip url
When user click on Flights and user click on roundTrip radio button
And user click on From dropdown 
And user click on To drp
And user click on Depart on  and Retrun on 
And user click on adults , childrens , infants
Then user click on search Filghts
When user click on stops filter
And user click on Depature time from HYD
And user click on Depature time from BLR
Then  user select flights
And user click on BookNow

@tag2
Scenario: Validate oneway Trip
Given user navigates clearTrip url
When user click on Flights and click on onewayTrip button
And user click on From dropdown 
And user click on To drp
And user click on Depart on
And user click on adults , childrens , infants
Then user click on search Filghts
When user click on stops filter
And user click on Depature time
And user click on Book










