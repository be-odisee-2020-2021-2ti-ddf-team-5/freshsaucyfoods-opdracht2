package be.odisee.team5.fsfopdracht2.domain;


/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
public class Proefstaaltje {

	private String beschrijving;
	private int id;
	private int score;
	private String Status;
	private String titel;
	public Bestelling m_Bestelling;
	public Bereidingswijze m_Bereidingswijze;

	public Proefstaaltje(){

	}

	public void finalize() throws Throwable {

	}

	public int getId(){
		return 0;
	}

	public String getStatus(){
		return "";
	}

	/**
	 *
	 * @param beschrijving
	 */
	public void setBeschrijving(String beschrijving){

	}

	/**
	 *
	 * @param score
	 */
	public void setScore(int score){

	}

	/**
	 *
	 * @param status
	 */
	public void setStatus(String status){

	}

	/**
	 *
	 * @param titel
	 */
	public void setTitel(String titel){

	}

}