package pl.coderslab.charity.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.domain.services.InstitutionService;

import java.util.List;


@Controller
public class HomeController {

    private final InstitutionService institutionService;

    public HomeController(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }

    @ModelAttribute
    private List <Institution> institutions (){
        return institutionService.allInstitutions();
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        return "home/index";
    }

}
