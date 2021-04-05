package be.odisee.team5.fsfopdracht2.controllers;

import be.odisee.team5.fsfopdracht2.formdata.BestellingData;
import be.odisee.team5.fsfopdracht2.service.FreshSaucyFoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/bestelling")
public class BestellingController {

    @Autowired
    protected FreshSaucyFoodsService fsfService;

    @GetMapping
    public String entryCreateForm(Model model) {

        BestellingData bestellingData = fsfService.prepareNewBestellingData();
        bestellingData = new BestellingData();
        prepareForm(bestellingData, model);
        return "createBestelling";
    }

    /**
     * Prepares the form with data for projects- and objectives comboboxes
     */
    private void prepareForm(BestellingData bestellingData, Model model) {

        model.addAttribute("bestellingen",fsfService.getBestellingen() );
        model.addAttribute("bestellingData", bestellingData );
    }
    /**
     * Process the form
     * @param bestellingData the data for the entry to be saved
     */
    @PostMapping(params = "submit")
    public String processBestelling( @Valid  BestellingData bestellingData, BindingResult errors, Model model) {

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


    /**
     * When delete of an entry is pressed
     */
    @PostMapping(params = "delete")
    public String deleteBestelling(@Valid  BestellingData bestellingData, Model model, BindingResult result){

        if(result.hasErrors()) return "/delete";

        fsfService.deleteBestelling(bestellingData.getId());
        //BestellingData bD = fsfService.prepareNewBestellingData();
        bestellingData = fsfService.prepareNewBestellingData();
        prepareForm(bestellingData, model);
        return "createBestelling";
    }

    /**
     * editeren van een bestelling
     * @param id
     * @param model
     * @return
     */

    @GetMapping("/edit")
    public String bestellingEditForm(@RequestParam("id") long id, Model model) {




            BestellingData bestellingData = fsfService.prepareEntryDataToEdit(id);
            prepareForm(bestellingData, model);
            model.addAttribute("message", "Update or Delete this entry please - or Cancel");
            return "createBestelling";

    }

    /**
     * User doesnt want to edit selected bestelling
     * @return
     */
    @PostMapping(params = "cancel")
    public String redirectToCreate() {
        return "redirect:/bestelling";
    }

    @PostMapping(params = "inplannen")
    public String inplannenProcess(@Valid  BestellingData bestellingData, BindingResult errors, Model model){
        String message="";
        try {
            // Are there any input validation errors detected by JSR 380 bean validation?
            if (errors.hasErrors() ) {
                message = "Correct input errors, please";
                throw new IllegalArgumentException();
            }
            // Now that the input seems to be OK, let's create a new entry or update/delete an existing entry
            message = fsfService.processBestellingInplannen(bestellingData);

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