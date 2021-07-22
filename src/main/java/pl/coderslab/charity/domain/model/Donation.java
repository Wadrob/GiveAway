package pl.coderslab.charity.domain.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "donations")
public class Donation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Min(1) @Max(100)
    private Integer quantity;
    @OneToMany
    @NotEmpty
    private List <Category> categories = new ArrayList<>();
    @ManyToOne
    @NotEmpty
    private Institution institution;
    @NotEmpty @NotBlank
    @Size(max = 100, message = "Maksymalnie 100 znaków")
    private String street;
    @NotEmpty @NotBlank
    @Size(max = 30)
    private String city;
    @NotBlank @NotEmpty
    @Size(max = 6)
    private String zipCode;
    @NotNull
    private LocalDateTime pickUpDateTime;
    @Size (max = 300)
    private String pickUpComment;

}
