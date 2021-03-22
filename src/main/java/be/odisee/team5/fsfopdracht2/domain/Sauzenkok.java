package be.odisee.team5.fsfopdracht2.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
@Component("rol3")
public class Sauzenkok implements Rol {

	private String rol = null;
	public Afspraak m_Afspraak;
	public Proefstaaltje m_Proefstaaltje;

	public Sauzenkok(){

	}

	public String getRol(){
		return rol;
	}
	@Autowired
	public void setRol(String SauzenkokRolString){
		this.rol = SauzenkokRolString;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}