package be.odisee.team5.fsfopdracht2.domain;


import java.util.Date;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
public class Bestelling {

	private int aantalLiterBesteld;
	private int bestellingsId;
	private Date datumStartproductie;
	private String duurProductie;
	private String status;
	private Date voorafAfgesprokenEindDatum;
	private String vooruitgang;
	public Dossier m_Dossier;

	public Bestelling(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 *  @param berschrijving
	 * @param titel
	 * @param bereidingswijze
	 */
	public void addProefstaaltje(String berschrijving, String titel, Bereidingswijze bereidingswijze){

	}

	public String getDuurProductie(){
		return "";
	}

	public String getEindDate(){
		return "";
	}

	public int getId(){
		return 0;
	}

	public int getLiterBesteld(){
		return 0;
	}

	public String getStatus(){
		return "";
	}

	public String getVooruitgang(){
		return "";
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
	public void setEindDatum(Date eindDatum){

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