package compte.n2.Film;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avis {

    private int idAvis;
    private Utilisateur utilisateur;
    private int note;
    private String commentaire;
    private LocalDate dateEnvoie;

    public Avis(int idAvis, Utilisateur utilisateur, int note,String commentaire, LocalDate dateEnvoie) {
        this.idAvis = idAvis;
        this.utilisateur = utilisateur;
        this.note = note;
        this.commentaire = commentaire;
        this.dateEnvoie = dateEnvoie;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getIdAvis() {
        return idAvis;
    }

    public void setIdAvis(int idAvis) {
        this.idAvis = idAvis;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public LocalDate getDateEnvoie() {
        return dateEnvoie;
    }

    public void setDateEnvoie(LocalDate dateEnvoie) {
        this.dateEnvoie = dateEnvoie;
    }
    public List<Avis> afficherAvis(List<Avis> listDesAvis){
        if(listDesAvis.isEmpty()){
            System.out.println("liste d'Avis vide");
            return new ArrayList<>();
        }
        for (Avis unAvis:listDesAvis){
            System.out.println("L'avis est rédiger par" +unAvis.getUtilisateur().getNom());
            System.out.println("Avec une note de " +unAvis.getNote());
            System.out.println("Commenté avec"+unAvis.getCommentaire());
        }
        return listDesAvis;
    }
}
