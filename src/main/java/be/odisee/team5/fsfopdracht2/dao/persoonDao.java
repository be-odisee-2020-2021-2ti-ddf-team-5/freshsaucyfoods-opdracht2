package be.odisee.team5.fsfopdracht2.dao;

import be.odisee.team5.fsfopdracht2.domain.Persoon;

public interface persoonDao {

    public Persoon getPersoonById(int persoonId);

    public Persoon getPersoonByEmailadres(String emailadres);
}
