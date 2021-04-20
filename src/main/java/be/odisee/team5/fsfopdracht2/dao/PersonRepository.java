package be.odisee.team5.fsfopdracht2.dao;

import be.odisee.team5.fsfopdracht2.domain.Persoon;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Persoon, Long> {
    public Persoon findPersoonByEmailadress(String emailAddress);
}
