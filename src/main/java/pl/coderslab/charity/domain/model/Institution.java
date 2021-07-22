package pl.coderslab.charity.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table (name = "institutions")
@Getter @Setter
public class Institution {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty @NotBlank
    @Size (max = 100)
    private String name;
    @Size(max = 500, message = "Maksymalnie 500 znaków")
    private String description;
}
