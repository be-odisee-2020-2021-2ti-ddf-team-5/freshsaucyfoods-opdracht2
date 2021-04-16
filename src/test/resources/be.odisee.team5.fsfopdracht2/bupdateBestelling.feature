Feature: Update Bestelling

Het zou mogelijk moeten zijn om een bestelling te kunnen aanpassen.
Een bestaande bestelling moet geupdate kunnen worden.

  Scenario: Update een bestelling
    Given Ik ben op de pagina waar ik een bestelling kan updaten
    When Ik "LeveringGent" klik in titeltoegevoegd
    And Ik "11" verander in het aantalLiter
    And Ik op de submit-button klik
    Then Zou ik "LeveringGent" in de tabel zien wijzigen.