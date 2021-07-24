package pl.coderslab.charity.domain.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.repository.DonationRepository;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DonationServices {

    private final DonationRepository donationRepository;

    public Integer allQuantity(){
        int sum = 0;
        List <Donation> donationList = donationRepository.findAll();
        for(Donation donation : donationList){
            sum += donation.getQuantity();
        }
        return sum;
    }

    public Integer allDonationNumber(){
        return donationRepository.findAll().size();
    }


}
