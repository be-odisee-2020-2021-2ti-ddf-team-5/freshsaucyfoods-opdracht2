package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import be.odisee.team5.fsfopdracht2.domain.Persoon;
import be.odisee.team5.fsfopdracht2.formdata.BestellingData;

import java.util.List;

public interface FreshSaucyFoodsService {

    public Object getObjectives();

    public BestellingData prepareNewBestellingData();

    public String processBesteling(BestellingData bestellingData);

    public List<Bestelling> getBestellingen();

    public void deleteBestelling(long id);

    public BestellingData prepareEntryDataToEdit(long id);

    public String processBestellingInplannen(BestellingData bestellingData);

    public String getAuthenticatedFullname();

    Persoon zoekPersoonMetEmailadres(String username);
}
