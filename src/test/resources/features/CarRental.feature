Feature: Car Rental

  Scenario: User want to rent a car
    Given User has already on traveloka home page
    When User click on Car Rental button
    And User click on Without Driver button
    And User input "Bali" in pick up location field
    And User input "24/03/2024" as pick up date
    And User input hour "10" and minute "0" as pick up time
    And User input "26/03/2024" as drop off date
    And User input hour "15" and minute "30" as drop off time
    And User click search button
    Then User will be redirected to car rental page
    When User click continue button on the chosen rental car
    Then User will be redirected to car provider page
    When User click continue button on the chosen car provider
    Then User will be redirected to car rental policy page
    When User select rental office as pick up location
    And User select other location as drop off location
    And User input drop off notes "please be on time"
    And User click continue button on car rental policy page
