package pl.coderslab.charity.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.services.CategoryServices;
import pl.coderslab.charity.domain.services.DonationServices;
import pl.coderslab.charity.domain.services.InstitutionService;

@Controller
@AllArgsConstructor
public class DonationController {

    private final DonationServices donationServices;
    private final InstitutionService institutionService;
    private final CategoryServices categoryServices;


    @RequestMapping ("/donation")
    public String donationForm (Model model){
        model.addAttribute("donation", new Donation());
        model.addAttribute("institutions", institutionService.allInstitutions());
        model.addAttribute("categories", categoryServices.allCategories());
        return "form/form";
    }

    @PostMapping ("/donation/confirmation")
    public String donationConfirmation (){
        return "confirm";
    }
}
