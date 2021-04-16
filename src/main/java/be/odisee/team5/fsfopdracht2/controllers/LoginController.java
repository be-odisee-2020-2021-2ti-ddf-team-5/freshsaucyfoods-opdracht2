package be.odisee.team5.fsfopdracht2.controllers;
import be.odisee.team5.fsfopdracht2.domain.Persoon;
import be.odisee.team5.fsfopdracht2.formdata.BestellingData;
import be.odisee.team5.fsfopdracht2.service.FreshSaucyFoodsService;
import be.odisee.team5.fsfopdracht2.service.UserContextService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/Login")
public class LoginController {

    @Autowired
    protected FreshSaucyFoodsService FreshSaucyFoodsService=null; // ready for dependency injection

    @Autowired
    protected UserContextService userContextService=null;

    @RequestMapping(value={"/login","/login.html"},method= RequestMethod.GET)
    public String login(ModelMap model){
        return "/Login.html";
    }


    @RequestMapping(value={"/logout","/logoutSuccess.html"},method=RequestMethod.GET)
    public String logout(ModelMap model){
        return "/logoutSuccess";
    }
    // je zal naar logoutSuccess.jsp gaan

    @RequestMapping(value={"/accessDenied","/accessDenied.html"},method=RequestMethod.GET)
    public String accessDenied(ModelMap model){
        return "/accessDenied";
    }
    // je zal naar accessDenied.jsp gaan

    @RequestMapping(value={"/","/menu.html","/index.html"},method=RequestMethod.GET)
    public String menu(ModelMap model){
        Persoon dePersoon=null;
        dePersoon = userContextService.getAuthenticatedPersoon();
        model.addAttribute("persoon",dePersoon);
        return "/menu";
    }
    // je zal naar menu.jsp gaan

    // je zal gaan naar de pagina conform uw rol

}





