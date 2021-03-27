package be.odisee.team5.fsfopdracht2.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
@Data
@Entity
@Table()
public class Bestelling {

	@Column
	private int aantalLiterBesteld;
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@Column
	private LocalDate datumStartproductie;
	@Column
	private String duurProductie;
	@Column
	private String status;
	@Column
	private LocalDate voorafAfgesprokenEindDatum;
	@Column
	private String vooruitgang;
	@Column
	private String titel;
//	@Column
//	public Dossier m_Dossier;

	public Bestelling(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 *
	 * @param berschrijving
	 * @param titel
	 * @param bereidingswijze
	 */
	public void addProefstaaltje(String berschrijving, String titel, Bereidingswijze bereidingswijze){

	}

	//Detail van een bestelling kunnen opvragen
	public String bestellingDetail() {
		String bestellingDetail = "Titel Bestelling: " + titel + "\n" + "Aantal liter besteld: " + aantalLiterBesteld + "\n" + "Datum van plaatsen bestelling: " + datumStartproductie + "\n" + "De productie duurt al: " + duurProductie + "\n" + "De status van de bestelling: " +status + "\n" + "Verwachte einddatum: " + voorafAfgesprokenEindDatum;
		return bestellingDetail;
	}

	public String getDuurProductie(){
		return duurProductie;
	}

	public LocalDate getEindDate(){
		return voorafAfgesprokenEindDatum;
	}

	public Long getId(){
		return Id;
	}

	public int getLiterBesteld(){
		return aantalLiterBesteld;
	}

	public String getStatus(){
		return status;
	}

	public String getVooruitgang(){
		return vooruitgang;
	}

	/**
	 *
	 * @param duur
	 */
	public void setDuurProducte(String duur){

	}

	/**
	 *
	 * @param eindDatum
	 */
	public void setEindDatum(LocalDate eindDatum){

	}

	/**
	 *
	 * @param literBesteld
	 */
	public void setLiterBesteld(int literBesteld){

	}

	/**
	 *
	 * @param status
	 */
	public void setStatus(String status){

	}

	/**
	 *
	 * @param vooruitgang
	 */
	public int setVooruitgang(String vooruitgang){
		return 0;
	}

}