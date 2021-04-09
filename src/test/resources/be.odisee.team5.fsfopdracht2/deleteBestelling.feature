Feature: Delete Bestelling

  Het zou mogelijk moeten zijn om een bestelling te kunnen verwijderen.
  Enkel als er een bestelling aanwezig is, kan deze verwijderd worden. De gegevens
  moeten hiervan ook in de tekstvakken weergegeven worden

  Scenario: delete een bestaande bestelling
    Given Ik ben op de pagina waar ik een bestelling kan verwijderen
    When Ik "bestelling" zet in het titel
    And Ik "10" toevoeg in het aantalLiter
    And Ik "2021/01/01" aanduid in het gewensteLeverdatum
    And Ik op de delete-button klik
    Then Zou ik "bestelling" in de tabel zien verdwijnen.