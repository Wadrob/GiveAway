package pl.coderslab.charity.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.domain.repository.InstitutionRepository;

public class InstitutionConverter implements Converter<String, Institution> {

    @Autowired
    private InstitutionRepository institutionRepository;

    @Override
    public Institution convert(String s) {
        return institutionRepository.findById(Long.parseLong(s)).get();
    }
}
