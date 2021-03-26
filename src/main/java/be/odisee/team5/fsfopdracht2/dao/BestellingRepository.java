package be.odisee.team5.fsfopdracht2.dao;

import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BestellingRepository extends CrudRepository<Bestelling, Long> {
    /**
     * Find bestelling by its unique numbre
     */
     //Bestelling getById(int id);

    /**
     * get every bestelling that exists
     */
     //List<Bestelling> getAll();
}
