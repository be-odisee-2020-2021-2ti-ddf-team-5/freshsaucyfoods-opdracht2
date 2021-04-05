package be.odisee.team5.fsfopdracht2.formdata;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BestellingData {
   private long id=0;
   private int aantalLiter=0;
   private String gewensteLeverdatum;
   private String titel="";
   private String vooruitgang="";
   private String startProductieDate;
}
