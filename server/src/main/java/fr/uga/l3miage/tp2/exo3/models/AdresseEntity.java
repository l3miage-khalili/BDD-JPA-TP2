package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "adresse")
public class AdresseEntity {
    @Id
    @Column(name = "id")
    private Long id ;

    @Column(name = "rue")
    private String rue ;

    @Column(name = "numero")
    private String numero ;

    @Column(name = "code_postal")
    private String codePostal ;

    @Column(name = "ville")
    private String ville ;

    @OneToOne
    @JoinColumn(name = "id_client")
    private ClientEntity clientEntity ;
}
