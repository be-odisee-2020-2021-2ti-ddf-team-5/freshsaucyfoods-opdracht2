package be.odisee.team5.fsfopdracht2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BestellingController {
    @GetMapping("/")
    public String createBestelling(){
        return "createBestelling";
    }

    @GetMapping("/")
    public String bestellingenList(){
        return "bestellingenList";
    }
}


