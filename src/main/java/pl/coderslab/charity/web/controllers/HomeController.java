package pl.coderslab.charity.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.domain.services.DonationServices;
import pl.coderslab.charity.domain.services.InstitutionService;

import java.util.List;


@Controller
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationServices donationServices;

    public HomeController(InstitutionService institutionService, DonationServices donationServices) {
        this.institutionService = institutionService;
        this.donationServices = donationServices;
    }

    @ModelAttribute
    private List <Institution> institutions (){
        return institutionService.allInstitutions();
    }

    @ModelAttribute (name = "allDonations")
    private Integer allDonationsNumber(){
        return donationServices.allDonationsNumber();
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        return "home/index";
    }

}
