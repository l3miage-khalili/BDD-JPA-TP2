package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "commande")
public class CommandeEntity {
    @Id
    @Column(name = "id")
    private Long id ;

    @Column(name = "date")
    private Date date ;

    @Column(name = "montant_total")
    private double montantTotal ;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private ClientEntity clientEntity ;

    @OneToMany(mappedBy = "commandeEntity")
    private Set<ProduitEntity> produitEntities ;
}
