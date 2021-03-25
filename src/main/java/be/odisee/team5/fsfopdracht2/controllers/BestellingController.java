package be.odisee.team5.fsfopdracht2.controllers;

import be.odisee.team5.fsfopdracht2.domain.Bestelling;
import be.odisee.team5.fsfopdracht2.domain.Dossier;
import be.odisee.team5.fsfopdracht2.formdata.BestellingData;
import be.odisee.team5.fsfopdracht2.service.FreshSaucyFoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bestelling")
public class BestellingController {

    @Autowired
    private FreshSaucyFoodsService fsfService;

    @GetMapping("/create")
    public String createBestelling(Model model){
        BestellingData bestellingData = new BestellingData();
        model.addAttribute(bestellingData);
        return "createBestelling";
    }

    @PostMapping("/create")
    public String processBestellingCreate(BestellingData bestellingData, Errors errors, Model model){
        String message = "";
        try{
            if(errors.hasErrors()){
                message = "Er werden foute waarden in gegeven";
                return "createBestelling";
            }
            else {

                Bestelling bestelling = new Bestelling();
                //Persoon klant = new Persoon();
                Dossier dossier = new Dossier();

                //klant.setNaam(bestellingData);
                return "bestellingList";
            }
        }catch (Exception e){

        }
        return "createBestelling";
    }

    @GetMapping("/List")
    public String bestellingenList(Model model){

        model.addAttribute(fsfService.getBestellingen());
        return "bestellingList";
    }

    @GetMapping("/Inplannen")
    public String bestellingInplannen(int id){
        return "bestellingInplannen";
    }
}