package pl.coderslab.charity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.coderslab.charity.web.converters.CategoryConverter;
import pl.coderslab.charity.web.converters.InstitutionConverter;

@SpringBootApplication
public class CharityApplication {

    public static void main(String[] args) {SpringApplication.run(CharityApplication.class, args);
    }

    @Bean
    public CategoryConverter categoryConverter(){
        return new CategoryConverter();
    }

    @Bean
    public InstitutionConverter institutionConverter(){
        return new InstitutionConverter();
    }

}
