package pl.coderslab.charity.domain.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "donations")
public class Donation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    @OneToMany
    private List <Category> categories = new ArrayList<>();
    @ManyToOne
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    private LocalDateTime pickUpDateTime;
    private String pickUpComment;

    //walidacja pól ( długości pól )
}
