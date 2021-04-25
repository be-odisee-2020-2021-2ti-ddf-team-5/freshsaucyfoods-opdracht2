package be.odisee.team5.fsfopdracht2.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author bramv
 * @version 1.0
 * @created 09-Mar-2021 3:56:55 PM
 */
@Entity
@Data
@Table(name = "PERSONEN")
public class Persoon implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int persoonId;

	@Column(unique = true)
	private String emailadress;
	@Column
	private String familienaam;
	@Column
	private String password;
	@Column
	private int status;
	@Column
	private String voornaam;
	@OneToMany
	private List<Bestelling> bestellingen;
	@Column
	private String role;

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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority(role));
	}

	@Override
	public String getUsername() {
		return emailadress;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}