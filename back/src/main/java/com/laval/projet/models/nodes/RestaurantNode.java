package com.laval.projet.models.nodes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Getter
@Setter
public class RestaurantNode {

    @Id
    private long id;

    private String nom;

    private String categories;

    private String siteWeb;

    private String numeroCivique;

    private String rue;

    private String codePostal;

    private String arrondissement;

    private String ville;

    private String latitude;

    private String longitude;

    private String numeroTelephone;
}
