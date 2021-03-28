package be.odisee.team5.fsfopdracht2.service;

import be.odisee.team5.fsfopdracht2.dao.BestellingRepository;
import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FreshSaucyFoodsService {

    public List<Bestelling> getBestellingen();
    public void createBestelling();
    public Bestelling getBestellingById(int id);
}
