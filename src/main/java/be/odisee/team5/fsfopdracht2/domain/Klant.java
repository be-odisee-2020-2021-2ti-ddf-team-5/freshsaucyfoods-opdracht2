package be.odisee.team5.fsfopdracht2.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
@Component("rol1")
public class Klant implements Rol {

	private String rol = null;
	public Afspraak m_Afspraak;
	public Dossier m_Dossier;
	public Bestelling m_Bestelling;
	public Melding m_Melding;


	public Klant(){
	}

	public String getRol(){
		return rol;
	}
	@Autowired
	public void setRol(String KlantRolString){
		this.rol = KlantRolString;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}