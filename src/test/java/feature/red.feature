Feature: redbus application

  Scenario Outline: Booking tickets in redbus
    Given Enter "<source>" and "<destination>" cities
    And Enter date
    When click on search button
    Then Book tickets
    
  Examples:
  |source|destination|
  |Tirupati|Chennai|
  |Bangalore|Hyderabad|
  |Hyderabad|Chennai|

