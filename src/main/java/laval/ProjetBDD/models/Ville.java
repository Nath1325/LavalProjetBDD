package laval.ProjetBDD.models;

import org.springframework.data.annotation.Id;

public class Ville {

    @Id
    private String id;
    private String nom;

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
