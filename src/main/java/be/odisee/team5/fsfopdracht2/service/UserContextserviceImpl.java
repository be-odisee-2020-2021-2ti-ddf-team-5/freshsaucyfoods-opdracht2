package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.domain.Persoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserContextserviceImpl implements UserContextService {

    @Autowired
    protected FreshSaucyFoodsService FreshSaucyFoodsService = null; // ready for dependency injection

    @Override
    public Persoon getAuthenticatedPersoon() {

        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = principal.getUsername();
        System.out.println("DEBUG: Username uit Principal is " + username);

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        for (GrantedAuthority authority : authorities) {
            System.out.println("DEBUG: Granted authority is " + authority.getAuthority());
        }
        Persoon thePersoon = FreshSaucyFoodsService.zoekPersoonMetEmailadres(username);
        return thePersoon;
    }
}