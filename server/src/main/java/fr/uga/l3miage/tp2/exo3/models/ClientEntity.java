package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
public class ClientEntity {
    @Id
    @Column(name = "id")
    private Long id ;

    @Column(name = "nom")
    private String nom ;

    @Column(name = "email")
    private String email ;

    @OneToMany(mappedBy = "clientEntity")
    private Set<CommandeEntity> commandeEntities ;

    @OneToOne(mappedBy = "clientEntity")
    private AdresseEntity adresseEntity ;
}
