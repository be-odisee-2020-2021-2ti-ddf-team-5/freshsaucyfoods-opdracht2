package be.odisee.team5.fsfopdracht2.dao;

import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BestellingRepository extends CrudRepository<Bestelling, Long> {
    /**
     * Find bestelling by its unique numbre
     */
     public Bestelling getById(long id);

     public Bestelling findFirstByOrderByIdDesc();

     public Bestelling findById(long id);
}
