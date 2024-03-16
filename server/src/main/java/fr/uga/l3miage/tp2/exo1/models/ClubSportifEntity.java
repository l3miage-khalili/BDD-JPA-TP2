package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "club_sportif")
public class ClubSportifEntity {
    @Id
    @Column(name = "id")
    private Long id ;

    @Column(name = "nom")
    private String nom ;

    @Column(name = "description")
    private String description ;

    @ManyToMany(mappedBy = "clubSportifEntities")
    private Set<EtudiantEntity> etudiantEntities ;
}
