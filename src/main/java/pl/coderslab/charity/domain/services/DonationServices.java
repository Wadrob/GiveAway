package pl.coderslab.charity.domain.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.repository.DonationRepository;

import java.util.List;

@Service
@Transactional
public class DonationServices {

    private final DonationRepository donationRepository;

    public DonationServices(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Integer allDonationsNumber(){
        int sum = 0;
        List <Donation> donationList = donationRepository.findAll();
        for(Donation donation : donationList){
            sum += donation.getQuantity();
        }
        return sum;
    }
}
