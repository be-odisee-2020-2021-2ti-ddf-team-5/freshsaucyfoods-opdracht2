package be.odisee.team5.fsfopdracht2;

import be.odisee.team5.fsfopdracht2.dao.BestellingRepository;
import be.odisee.team5.fsfopdracht2.dao.PersonRepository;
import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import be.odisee.team5.fsfopdracht2.domain.Persoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@ConditionalOnProperty(name = "app.db-init", havingValue = "true")
public class FSFApplicationInitDB implements CommandLineRunner {

    @Autowired
    BestellingRepository bestellingRepository;

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        //eventuele standaard data
        Bestelling b = new Bestelling();
        b.setTitel("Eerste bestelling");
        b.setAantalLiterBesteld(10);
        b.setDatumStartproductie(LocalDate.now());
        b.setVooruitgang("In Productie");
        b.setVoorafAfgesprokenEindDatum(LocalDate.now().plusMonths(1));
        bestellingRepository.save(b);

        Persoon p = new Persoon();
        p.setNaam("Jef");
        p.setPassword("12345");
        p.setEmailadress("jef@hotmail.com");
        personRepository.save(p);
    }
}
