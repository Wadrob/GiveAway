package pl.coderslab.charity.domain.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.domain.repository.InstitutionRepository;

import java.util.List;


@Service
@Transactional
@AllArgsConstructor
public class InstitutionService {

    private final InstitutionRepository institutionRepo;

    public List <Institution> allInstitutions (){
        return institutionRepo.findAll();
    }
}
