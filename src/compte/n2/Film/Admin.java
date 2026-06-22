package compte.n2.Film;

import java.util.ArrayList;
import java.util.List;

public class Admin {
   private int idAdmin;
   private String nomAdmin;
   private String emailAdmin;
   private List<Abonnement> listeAbonnements;
   private List<Contenue> listeContenue;

    public Admin(int idAdmin, String nomAdmin, String emailAdmin, List<Abonnement> listeAbonnements,List<Contenue> listeContenue) {
        this.idAdmin = idAdmin;
        this.nomAdmin = nomAdmin;
        this.emailAdmin = emailAdmin;
        this.listeAbonnements = listeAbonnements;
        this.listeContenue=listeContenue;
    }

    public List<Contenue> getListeContenue() {
        return listeContenue;
    }

    public void setListeContenue(List<Contenue> listeContenue) {
        this.listeContenue = listeContenue;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    public List<Abonnement> getListeAbonnements() {
        return listeAbonnements;
    }

    public void setListeAbonnements(List<Abonnement> listeAbonnements) {
        this.listeAbonnements = listeAbonnements;
    }
    public double calculeRevenu(List<Abonnement> listeAbonnements){
      double sommeTotale=0;

      if(listeAbonnements.isEmpty()){
          return sommeTotale;
      }
      for(Abonnement unAbonnement:listeAbonnements){
          sommeTotale=sommeTotale+unAbonnement.getPrix();
      }
      return sommeTotale;
    }
    public List<Contenue> voirFlmPopulaire(List<Contenue> catalogue){
        List<Contenue> populaires=new ArrayList<>();

        if(catalogue.isEmpty()){
            System.out.println("la liste est vide ");
            return populaires;
        }
        for(Contenue unContenue:catalogue){
            if(unContenue.calculeNoteMoyenne()>= 4.0){
                populaires.add(unContenue);
            }
        }
        return populaires;
    }
    public void ajouterContenue(Contenue nouveauContenue){
        listeContenue.add(nouveauContenue);
    }

}
