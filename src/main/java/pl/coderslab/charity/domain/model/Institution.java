package pl.coderslab.charity.domain.model;

import javax.persistence.*;

@Entity
@Table (name = "institutions")
public class Institution {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
