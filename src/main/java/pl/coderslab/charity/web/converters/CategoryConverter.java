package pl.coderslab.charity.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.charity.domain.model.Category;
import pl.coderslab.charity.domain.repository.CategoryRepository;

public class CategoryConverter implements Converter<String, Category > {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category convert(String s) {
        return categoryRepository.findById(Long.parseLong(s)).get();
    }
}
