Feature: Add Bestelling

  Het zou mogelijk moeten zijn om een bestelling toe te voegen.
  Juist na het aanmaken van een bestelling, moeten de gegevens hiervan direct afgebeeld worden.

  Scenario: Voeg 1 bestelling toe
    Given Ik ben op de pagina waar ik een bestelling kan toevoegen
    When Ik "bestelling" zet in het titel
    And Ik "10" zet in het aantal-field
    And Ik "01/01/2021" zet in het leverdatum
    And Ik op de submit-button klik
    Then Zou ik "Bestelling" in de tabel zien verschijnen.