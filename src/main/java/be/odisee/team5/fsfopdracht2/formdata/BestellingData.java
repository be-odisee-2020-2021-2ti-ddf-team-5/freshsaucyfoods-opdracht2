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
   private String startProductieDate;

}
