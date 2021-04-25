package be.odisee.team5.fsfopdracht2.controllers;

import be.odisee.team5.fsfopdracht2.domain.Persoon;
import be.odisee.team5.fsfopdracht2.service.FreshSaucyFoodsService;
import be.odisee.team5.fsfopdracht2.service.UserContextService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {

    protected FreshSaucyFoodsService freshSaucyFoodsService = null;

    protected UserContextService UserContextService = null;

    @RequestMapping(value = {"/login", "/login.html"}, method = RequestMethod.GET)
    public String login(ModelMap model){
        return "/login";
    }

    @RequestMapping(value = {"/byebye", "/byebye.html"}, method = RequestMethod.GET)
    public String logout(ModelMap model){
        return "/byebye";
    }

    @RequestMapping(value = {"/403", "/403.html"}, method = RequestMethod.GET)
    public String accessDenied(ModelMap model){
        return "/403";
    }
}
