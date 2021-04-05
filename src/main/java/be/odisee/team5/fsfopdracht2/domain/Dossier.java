package be.odisee.team5.fsfopdracht2.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
@Data
@Table
@Entity
public class Dossier {

	@Id
	private int dossierId;
	@Column
	private String status;

	public Dossier(){

	}

	public void finalize() throws Throwable {

	}

	public int getId(){
		return 0;
	}

	/**
	 * 
	 * @param klantId
	 */
	public int getLijstBestellingenVanKlantt(int klantId){
		return 0;
	}

	public String getStatus(){
		return "";
	}

	/**
	 *
	 * @param status
	 */
	public void setStatus(String status){

	}

}