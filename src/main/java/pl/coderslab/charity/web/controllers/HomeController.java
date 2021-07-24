package pl.coderslab.charity.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.domain.services.DonationServices;
import pl.coderslab.charity.domain.services.InstitutionService;

import java.util.List;


@Controller
@AllArgsConstructor
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationServices donationServices;

    @ModelAttribute
    private List <Institution> institutions (){
        return institutionService.allInstitutions();
    }

    @ModelAttribute (name = "allQuantity")
    private Integer allQuantityNumber(){
        return donationServices.allQuantity();
    }

    @ModelAttribute (name = "allDonationsNumber")
    private Integer allDonationNUmber(){
        return donationServices.allDonationNumber();
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        return "home/index";
    }

}
