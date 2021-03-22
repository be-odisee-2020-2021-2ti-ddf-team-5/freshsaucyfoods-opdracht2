package be.odisee.team5.fsfopdracht2.domain;


import java.util.Date;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
public class Ingredient {

	private Date houdbaarheidsDatum;
	private int ingredientId;
	private String ingredientNaam;
	private String status;
	public Bereidingswijze m_Bereidingswijze;

	public Ingredient(){

	}

	public void finalize() throws Throwable {

	}

	public int getId(){
		return 0;
	}

	/**
	 * 
	 * @param datum
	 */
	public int setHoudbaarheidsDatum(Date datum){
		return 0;
	}

	/**
	 * 
	 * @param titel
	 */
	public int setIngredientTitel(String titel){
		return 0;
	}

	/**
	 *
	 * @param status
	 */
	public void setStatus(String status){

	}

}