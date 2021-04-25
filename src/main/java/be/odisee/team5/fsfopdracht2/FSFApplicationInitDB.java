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
        b.setLiterBesteld(10);
        b.setEindDatum(LocalDate.now());
        b.setVooruitgang("In Productie");
        b.setEindDatum(LocalDate.now().plusMonths(1));
        bestellingRepository.save(b);

        Persoon p = new Persoon();
        p.setRole("ROLE_USER");
        p.setNaam("Jef");
        p.setFamilienaam("Lokers");
        p.setPassword("12345");
        p.setEmailadress("jef.lokers@hotmail.com");
        personRepository.save(p);

        Persoon p2 = new Persoon();
        p2.setRole("ROLE_ADMIN");
        p2.setNaam("Tom");
        p2.setFamilienaam("Berens");
        p2.setPassword("1");
        p2.setEmailadress("tom.berens@hotmail.com");
        personRepository.save(p2);
    }
}
