package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "poste")
public abstract class EmployeEntity {
    @Id
    @Column(name = "id")
    private Long id ;

    @Column(name = "nom")
    private String nom ;

    @Column(name = "email")
    private String email ;

    @Column(name = "salaire")
    private double salaire ;
}
