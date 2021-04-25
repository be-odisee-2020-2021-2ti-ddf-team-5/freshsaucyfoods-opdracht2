package be.odisee.team5.fsfopdracht2.dao;

import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import org.springframework.data.repository.CrudRepository;

public interface BestellingRepository extends CrudRepository<Bestelling, Long> {
    /**
     * Find bestelling by its unique number
     */
     public Bestelling getById(long id);

     public Bestelling findFirstByOrderByIdDesc();

     public Bestelling findById(long id);
}
