package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.domain.Persoon;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class UserContextServiceImpl implements FreshSaucyFoodsServiceImpl.UserContextService {
    @Autowired
    protected FreshSaucyFoodsService freshSaucyFoodsService=null; //ready for dependency injection

    @Override
    public Persoon getAuthenticatedPersoon() {
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = principal.getUsername();
        System.out.println("DEBUG: Username uit Principal is " + username);
        Persoon thePersoon = freshSaucyFoodsService.
    }
}
