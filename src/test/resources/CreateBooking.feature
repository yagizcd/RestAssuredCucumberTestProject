Feature: I can create reservation as a User

  Scenario: User can be able create reservations and delete it
    Given User creates a new reservations
    And User adds informations necessary for reservation
    When User creates a reservation
    Then Reservations created succesfully
    And User deletes reservation