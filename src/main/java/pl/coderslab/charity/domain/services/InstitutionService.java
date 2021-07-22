package pl.coderslab.charity.domain.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.domain.repository.InstitutionRepository;

import java.util.List;


@Service
@Transactional
public class InstitutionService {

    private final InstitutionRepository institutionRepo;

    public InstitutionService(InstitutionRepository institutionRepo) {
        this.institutionRepo = institutionRepo;
    }

    public List <Institution> allInstitutions (){
        return institutionRepo.findAll();
    }
}
