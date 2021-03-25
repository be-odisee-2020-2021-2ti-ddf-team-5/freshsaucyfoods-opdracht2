package be.odisee.team5.fsfopdracht2.formdata;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BestellingData {
   // @NotBlank(message="Het aantal liter moet worden mee gegeven")

   private int LiterBesteld;
   private String Voornaam ;
   private String Familienaam;
   private LocalDate leverDatum;
}
