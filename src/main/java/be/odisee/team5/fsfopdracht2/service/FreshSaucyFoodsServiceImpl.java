package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.dao.BestellingRepository;
import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FreshSaucyFoodsServiceImpl implements FreshSaucyFoodsService {

    @Autowired
    private BestellingRepository bestellingRepository;

    @Override
    public List<Bestelling> getBestellingen() {
        ArrayList<Bestelling> list = new ArrayList<Bestelling>();
        Bestelling b = new Bestelling();
        b.setLiterBesteld(50);
        list.add(b);
        b.setLiterBesteld(100);
        list.add(b);

        return list;
    }

    @Override
    public void createBestelling() {

    }
}
