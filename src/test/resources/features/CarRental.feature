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
    And User input "kuta" as drop off location
    And User input drop off notes "please be on time"
    And User click continue button on car rental policy page
    Then User will redirected to booking page
    When User input booker's full name "Sofie Miranti"
    And User input booker's phone number "87712345678"
    And User input booker's email "sofie121212@gmail.com"
    And User click save booker's data
    And User choose "Nona" as driver's title
    And User input driver's full name "Sofie Miranti"
    And User input driver's phone number "87712345678"
    And User click save driver's data
    And User click continue button in booking page
    And User input a special request "baby seat"
    And User check all rental requirements
    And User click continue to payment button
    Then User will see pop up to verify user's booking is correct
    When User click continue button on the pop up
    Then User will be redirected to payment page
    When User choose alfamart as payment method
    And User click pay with alfamart button
    Then User will be redirected to payment instructions page




