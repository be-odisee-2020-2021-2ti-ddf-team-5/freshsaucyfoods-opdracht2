package be.odisee.team5.fsfopdracht2.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */

public class Klant extends Rol {

	public Afspraak m_Afspraak;

	public Bestelling m_Bestelling;
	public Melding m_Melding;

	public Klant(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}