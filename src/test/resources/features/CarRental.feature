Feature: Car Rental

  Scenario: User want to rent a car
    Given User has already on traveloka home page
    When User click on Car Rental button
    And User click on Without Driver button
    And User input "Bali" in pick up location field
    And User input "24/03/2024" as pick up date
    And User input 10:00 as pick up time
    And User input "26/03/2024" as drop off date
    And User input 15:30 as drop off time
    And User click search button