package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class DeveloppeurEntity extends EmployeEntity{
    @Column(name = "langage_prefere")
    private String langagePrefere ;

    @Column(name = "niveau_competence")
    private String niveauCompetence ;
}
