package be.odisee.team5.fsfopdracht2.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
public class Designer extends Rol {

	public Afspraak m_Afspraak;

	public Designer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}