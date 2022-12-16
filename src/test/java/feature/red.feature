Feature: redbus application

  Scenario: Booking tickets in redbus
    Given Enter source and destination cities
    And Enter date
    When click on search button
    Then Book tickets

