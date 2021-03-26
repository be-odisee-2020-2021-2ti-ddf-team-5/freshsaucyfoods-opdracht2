package be.odisee.team5.fsfopdracht2.formdata;

import lombok.Data;

@Data
public class BestellingData {
   // @NotBlank(message="Het aantal liter moet worden mee gegeven")

   // id is needed for updating
   private long id=0;

   private String titel;
}
