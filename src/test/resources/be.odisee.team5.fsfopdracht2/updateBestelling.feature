Feature: Update Bestelling

Het zou mogelijk moeten zijn om een bestelling te kunnen aanpassen.
Een bestaande bestelling moet geupdate kunnen worden.

  Scenario: Update een bestelling
    Given Ik ben op de pagina waar ik een bestelling kan updaten
    When Ik "bestelling" aanpas in het titel
    And Ik "11" update in het aantalLiter
    And Ik "2021/07/01" verander in het gewensteLeverdatum
    And Ik op de update-button klik
    Then Zou ik "bestelling" in de tabel zien wijzigen.