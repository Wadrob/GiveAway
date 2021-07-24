package pl.coderslab.charity.domain.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.model.Category;
import pl.coderslab.charity.domain.repository.CategoryRepository;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CategoryServices {

    private final CategoryRepository categoryRepository;

    public List <Category> allCategories (){
        return categoryRepository.findAll();
    }
}
