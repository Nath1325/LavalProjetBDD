package laval.ProjetBDD.models;

import org.springframework.data.annotation.Id;

public class Restaurant {

    @Id
    private String id;
    private String nom;
    private String adresse;
    private String lat;
    private String lon;

    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}
