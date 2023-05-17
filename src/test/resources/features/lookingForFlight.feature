Feature: User should be able to look for a flight on the homepage

  Scenario: As a user I should be able to look for a flight as One way
    Given user access to the pome page
    And user clicks to One way button
    And user clicks to From text part
    And user clicks to Aalborg


    And user clicks to To text part
    And user clicks to new Ankara


    And user clicks to Departure Date button
    And User selects a "DepartureDate"
    When user clicks to Search Cheap Flight button
    Then user reachs to Booking page
