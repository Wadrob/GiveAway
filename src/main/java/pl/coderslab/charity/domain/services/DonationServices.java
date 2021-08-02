package pl.coderslab.charity.domain.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.repository.DonationRepository;

@Service
@Transactional
@AllArgsConstructor
public class DonationServices {

    private final DonationRepository donationRepository;

    public Integer allQuantity(){
        return donationRepository.allQuantity();
    }

    public Long allDonationNumber(){
        return donationRepository.count();
    }

    public void saveDonation(Donation donation){
        donationRepository.save(donation);
    }


}
