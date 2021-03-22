package be.odisee.team5.fsfopdracht2.domain;

import javax.persistence.*;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
@Entity
@Table()
public class Persoon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int persoonId;

	@Column
	private String emailadress;
	@Column
	private String familienaam;
	@Column
	private String password;
	@Column
	private int status;
	@Column
	private String voornaam;

	public Persoon(){

	}

	public long getId() {
		return persoonId;
	}

	public void setId(int id) {
		this.persoonId = id;
	}

	public String getNaam() {
		return voornaam;
	}

	public void setNaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public double getSaldo() {
		return status;
	}

	public void setSaldo(int status) {
		this.status = status;
	}

	public void finalize() throws Throwable {

	}

}