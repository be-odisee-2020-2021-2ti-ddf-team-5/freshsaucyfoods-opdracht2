package be.odisee.team5.fsfopdracht2.formdata;

import lombok.Data;

import javax.validation.constraints.*;


@Data
public class BestellingData {
   private long id=0;
   @DecimalMin(value = "9",message = "Gelieve het aantal liter dat je wilt bestellen mee te geven, minimaal 10 liter bestellen")
   private int aantalLiter=0;
   @NotBlank(message = "Gelieve ge gewenste leverdatum mee te geven")
   private String gewensteLeverdatum;
   @NotBlank(message = "Gelieve de naam van de bestelling mee te geven")
   private String titel="";
   private String vooruitgang="";
   //@NotBlank(message = "Gelieve de productiedatum van de bestelling mee te geven")
   //@Future(message = "De startdatum van de productie moet in de toekomst liggen") -> werkt niet aangezien we datum als string doorgeven
   private String startProductieDate;

   //@NotBlank(message = "Gelieve je voornaam te geven")
   private String voornaam="";
    //@NotBlank(message = "Gelieve je achternaam te geven")
    private String achternaam="";

    public long getId() {
        return id;
    }

    public void setId(long _id) {
        id = _id;
    }

    public CharSequence getStartProductieDate() {
        return startProductieDate;
    }

    public String getVooruitgang() {
        return vooruitgang;
    }

    public void setVooruitgang( String _vooruitgang) {
        vooruitgang = _vooruitgang;
    }

    public void setStartProductieDate( String _startproductie) {
        startProductieDate = _startproductie;
    }

    public void setLiterBesteld(int _aantalLiter) {
        aantalLiter = _aantalLiter;
    }

    public int getAantalLiteretLiterBesteld() {
        return aantalLiter;
    }

    public CharSequence getGewensteLeverdatum() {
        return gewensteLeverdatum;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String _titel) {
        titel = _titel;
    }

    public void setLeverdatum(String leverData) {
        gewensteLeverdatum = leverData;
    }
}
