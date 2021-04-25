package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.dao.BestellingRepository;
import be.odisee.team5.fsfopdracht2.dao.persoonDao;
import be.odisee.team5.fsfopdracht2.dao.PersonRepository;
import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import be.odisee.team5.fsfopdracht2.domain.Persoon;
import be.odisee.team5.fsfopdracht2.formdata.BestellingData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
@Service
public class FreshSaucyFoodsServiceImpl implements FreshSaucyFoodsService {
private persoonDao persoonDao;

public class FreshSaucyFoodsServiceImpl implements FreshSaucyFoodsService  {


    @Autowired
    private BestellingRepository bestellingRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Object getObjectives() {
        return null;
    }

    @Override
    public BestellingData prepareNewBestellingData() {
        Bestelling lastBestelling = bestellingRepository.findFirstByOrderByIdDesc();
        return prepareBestellingData(lastBestelling);
    }

    private BestellingData prepareBestellingData(Bestelling bestelling){
        BestellingData bestellingData = new BestellingData();
        bestellingData.setTitel(bestelling.getTitel());
        bestellingData.setLeverdatum(bestelling.getEindDate().toString());
        bestellingData.setLiterBesteld(bestelling.getLiterBesteld());
        bestellingData.setVooruitgang(bestelling.getVooruitgang());
        try {
            bestellingData.setStartProductieDate(bestelling.getDatumStartproductie().toString());
        }catch (Exception e){

        }
        bestellingData.setId(bestelling.getId());
        return bestellingData;
    }

    @Override
    public String processBesteling(BestellingData bestellingData) {
        Bestelling bestelling;
        if (bestellingData.getId() == 0) {
            bestelling = new Bestelling();
            bestelling.setStatus("Aangemaakt");
            bestelling.setVooruitgang("Aangemaakt");
        }
        else {
            bestelling = bestellingRepository.findById( bestellingData.getId() );
            bestelling.setVooruitgang(bestellingData.getVooruitgang());
            try {
                bestelling.setDatumStartproductie(LocalDate.parse(bestellingData.getStartProductieDate(), DateTimeFormatter.ofPattern("yyyy-dd-MM")));
            }
            catch (Throwable e){
                bestelling.setDatumStartproductie(LocalDate.parse(bestellingData.getStartProductieDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }

        }
        bestelling.setStatus(bestellingData.getVooruitgang());
        bestelling.setLiterBesteld(bestellingData.getAantalLiteretLiterBesteld());
        try{
            bestelling.setEindDatum(LocalDate.parse(bestellingData.getGewensteLeverdatum(), DateTimeFormatter.ofPattern("yyyy-dd-MM")));
        }
        catch (Throwable e){
            bestelling.setEindDatum(LocalDate.parse(bestellingData.getGewensteLeverdatum(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        }

        bestelling.setTitel(bestellingData.getTitel());
        bestellingRepository.save(bestelling);
        return "bestelling:" + bestelling.getTitel();
    }


    @Override
    public List<Bestelling> getBestellingen() {

        return (List<Bestelling>) bestellingRepository.findAll();
    }

    @Override
    public void deleteBestelling(long id) {
        Bestelling bestelling = bestellingRepository.getById(id);
        bestellingRepository.delete(bestelling);
    }

    @Override
    public BestellingData prepareEntryDataToEdit(long id) {

        Bestelling bestelling = bestellingRepository.findById(id);
        BestellingData bestellingDataData = prepareBestellingData(bestelling);
        bestellingDataData.setId(id);
        return bestellingDataData;
    }

    public Persoon zoekPersoonMetId(int id){
        return persoonDao.getPersoonById(id);
    }

    public Persoon zoekPersoonMetEmailadres(String emailadres){
        return persoonDao.getPersoonByEmailadres(emailadres);
    }

    @Override
    public String processBestellingInplannen(BestellingData bestellingData) {
        return null;
    private String getAuthenticatedUsername() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        return currentPrincipalName;
    }

    private Persoon findAuthenticatedPersoon() {

        String email = getAuthenticatedUsername();
        return personRepository.findPersoonByEmailadress(email);
    }

    @Override
    public String getAuthenticatedFullname() {

        Persoon theUser = findAuthenticatedPersoon();
        return theUser.getNaam() +' '+ theUser.getFamilienaam();
    }

    @Override
    public Persoon zoekPersoonMetEmailadres(String username) {
        Persoon persoon = personRepository.findPersoonByEmailadress(username);
        return persoon;
    }


    public static interface UserContextService {
        public Persoon getAuthenticatedPersoon();
    }
}
