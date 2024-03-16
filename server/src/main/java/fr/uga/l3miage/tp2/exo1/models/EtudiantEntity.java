package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "etudiant")
public class EtudiantEntity {
    @Id
    @Column(name = "agalan")
    private Long agalan ;

    @Column(name = "nom")
    private String nom ;

    @Column(name = "email")
    private String email ;

    @ManyToMany
    @JoinTable(
            name = "etudiant_club_sportif",
            joinColumns = @JoinColumn(name = "agalan"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private Set<ClubSportifEntity> clubSportifEntities ;
}
