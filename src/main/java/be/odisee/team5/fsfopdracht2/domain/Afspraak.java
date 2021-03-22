package be.odisee.team5.fsfopdracht2.domain;


import java.util.Date;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:54 PM
 */
public class Afspraak {

	private Date afspraakDatum;
	private AfspraakType afspraakType;
	private Date afspraakUur;
	private int id;
	private String status;

	public Afspraak(){

	}

	public void finalize() throws Throwable {

	}

	public Date getDatum(){
		return null;
	}

	public Designer getDesigner(){
		return null;
	}

	public int getId(){
		return 0;
	}

	public Sauzenkok getSauzenkok(){
		return null;
	}

	public String getStatus(){
		return "";
	}

	public Date getUur(){
		return null;
	}

	/**
	 *
	 * @param afspraakType
	 */
	public void setAfspraakType(AfspraakType afspraakType){

	}

	/**
	 *  @param datum
	 * @param uur
	 */
	public void setDatumEnuur(Date datum, Date uur){

	}

	/**
	 *
	 * @param designer
	 */
	public void setDesigner(Designer designer){

	}

	/**
	 *
	 * @param sauzenkok
	 */
	public void setSauzenkok(Sauzenkok sauzenkok){

	}

	/**
	 *
	 * @param status
	 */
	public void setStatus(String status){

	}

}