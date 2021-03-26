package be.odisee.team5.fsfopdracht2.controllers;

import be.odisee.team5.fsfopdracht2.formdata.BestellingData;
import be.odisee.team5.fsfopdracht2.service.FreshSaucyFoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/bestelling")
public class BestellingController {

    @Autowired
    protected FreshSaucyFoodsService fsfService;

    @GetMapping
    public String entryCreateForm(Model model) {

        BestellingData bestellingData = fsfService.prepareNewBestellingData();
        prepareForm(bestellingData, model);
        return "createBestelling";
    }

    /**
     * Prepares the form with data for projects- and objectives comboboxes
     */
    private void prepareForm(BestellingData entryData, Model model) {

        model.addAttribute("objectives",fsfService.getObjectives() );
        model.addAttribute("entryData", entryData );
    }
    /**
     * Process the form
     * @param bestellingData the data for the entry to be saved
     */
    @PostMapping(params = "submit")
    public String processEntry(BestellingData bestellingData, Errors errors, Model model) {

        String message="";

        try {
            // Are there any input validation errors detected by JSR 380 bean validation?
            if (errors.hasErrors() ) {
                message = "Correct input errors, please";
                throw new IllegalArgumentException();
            }
            // Now that the input seems to be OK, let's create a new entry or update/delete an existing entry
            message = fsfService.processBesteling(bestellingData);

            // Prepare form for new data-entry
            bestellingData = fsfService.prepareNewBestellingData();

        } catch (IllegalArgumentException e) {
            // Nothing special needs to be done
        }
        prepareForm(bestellingData, model);
        model.addAttribute("message", message);
        return "createBestelling";
    }
}