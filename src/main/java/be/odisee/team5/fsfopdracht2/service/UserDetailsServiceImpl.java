package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.dao.PersonRepository;
import be.odisee.team5.fsfopdracht2.domain.Persoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Primary
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Persoon persoon = personRepository.findPersoonByEmailadress(email);
        if (persoon != null) return persoon;
        return null;
    }
}
