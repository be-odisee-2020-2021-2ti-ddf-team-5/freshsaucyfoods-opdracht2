package be.odisee.team5.fsfopdracht2.dao;

import be.odisee.team5.fsfopdracht2.domain.Persoon;
import org.springframework.stereotype.Repository;

@Repository("persoonDao")
public class persoonDaoHibernate extends HibernateDao implements persoonDao{

    public Persoon getPersoonById(int persoonId) {
        return (Persoon) sessionGetObjectById("Persoon", persoonId);
    }

    @Override
    public Persoon getPersoonByEmailadres(String emailadres) {
        return (Persoon) sessionGetObjectByStringParameterValue("Persoon", "emailadres", emailadres);
    }
}
