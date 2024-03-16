package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "produit")
public class ProduitEntity {
    @Id
    @Column(name = "id")
    private Long id ;

    @Column(name = "nom")
    private String nom ;

    @Column(name = "prix")
    private double prix ;

    @Column(name = "quantite")
    private int quantite ;

    @ManyToOne
    @JoinColumn(name = "id_commande")
    private CommandeEntity commandeEntity ;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private CategorieDeProduitEntity categorieDeProduitEntity ;
}
