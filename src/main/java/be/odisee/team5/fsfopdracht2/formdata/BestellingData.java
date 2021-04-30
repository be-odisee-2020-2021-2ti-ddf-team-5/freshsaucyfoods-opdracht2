package be.odisee.team5.fsfopdracht2.formdata;

import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import lombok.Data;

import javax.validation.constraints.*;


@Data
public class BestellingData extends Bestelling {
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
}
