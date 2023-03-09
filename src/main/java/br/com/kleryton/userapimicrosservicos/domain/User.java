package br.com.kleryton.userapimicrosservicos.domain;

import lombok.*;
import static lombok.EqualsAndHashCode.Include;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER")
public class User {

    @Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String passowrd;
    private Double hourlyPrice; //preço hora trabalhada;

}
