package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.dao.BestellingRepository;
import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import be.odisee.team5.fsfopdracht2.formdata.BestellingData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FreshSaucyFoodsServiceImpl implements FreshSaucyFoodsService {

    @Autowired
    private BestellingRepository bestellingRepository;

    @Override
    public Object getObjectives() {
        return null;
    }

    @Override
    public BestellingData prepareNewBestellingData() {
        return null;
    }

    @Override
    public String processBesteling(BestellingData bestellingData) {
        return null;
    }


    @Override
    public List<Bestelling> getBestellingen() {
        return null;
    }

    @Override
    public void createBestelling() {

    }
}
