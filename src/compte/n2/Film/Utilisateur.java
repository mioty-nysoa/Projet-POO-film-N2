package compte.n2.Film;

import java.util.List;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String email;
    private Abonnement abonnement;
    private List<Contenue>favorie;
    private List<Contenue>films;
    private List<Contenue>archives;

    public Utilisateur(String nom, String prenom, String email, Abonnement abonnement,
                       List<Contenue> favorie, List<Contenue> films, List<Contenue> archives) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.abonnement = abonnement;
        this.favorie = favorie;
        this.films = films;
        this.archives = archives;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public List<Contenue> getFavorie() {
        return favorie;
    }

    public void setFavorie(List<Contenue> favorie) {
        this.favorie = favorie;
    }

    public List<Contenue> getFilms() {
        return films;
    }

    public void setFilms(List<Contenue> films) {
        this.films = films;
    }

    public List<Contenue> getArchives() {
        return archives;
    }

    public void setArchives(List<Contenue> archives) {
        this.archives = archives;
    }
}

