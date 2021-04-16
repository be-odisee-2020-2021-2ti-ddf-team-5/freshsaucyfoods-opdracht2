package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.domain.Persoon;

public interface UserContextService {
    public Persoon getAuthenticatedPersoon();


}
