package be.odisee.team5.fsfopdracht2.domain;


/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
public class Melding {

	private DoelGroep doelGroep;
	private int id;
	private MeldingType meldingType;
	private String status;

	public Melding(){

	}

	public void finalize() throws Throwable {

	}

	public DoelGroep getDoelGroep(){
		return null;
	}

	public int getId(){
		return 0;
	}

	public String getStatus(){
		return "";
	}

	/**
	 *
	 * @param doelGroep
	 */
	public void setDoelGroep(DoelGroep doelGroep){

	}

	/**
	 *
	 * @param status
	 */
	public void setStatus(String status){

	}

}