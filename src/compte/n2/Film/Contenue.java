package compte.n2.Film;
import java.time.LocalDate;
import java.util.List;

enum GenreFilm{
    action,fiction,horreur,romance,comedie,dessin
};
 enum UtilisateurCible{
    enfant,ados,adulte
};
public class Contenue {

    private int idContenue;
    private String titre;
    private String realisateur;
    private List<String> acteurs;
    private GenreFilm genre;
    private List<Avis> listeAvis;
    private UtilisateurCible cible;
    private LocalDate dateSortie;
    private String description;

    public Contenue(int idContenue, String titre, String realisateur,
                    List<String> acteurs, GenreFilm genre, List<Avis> listeAvis,
                    UtilisateurCible cible, LocalDate dateSortie, String description) {
        this.idContenue = idContenue;
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
        this.genre = genre;
        this.listeAvis = listeAvis;
        this.cible = cible;
        this.dateSortie = dateSortie;
        this.description = description;
    }

    public int getIdContenue() {
        return idContenue;
    }

    public void setIdContenue(int idContenue) {
        this.idContenue = idContenue;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<String> acteurs) {
        this.acteurs = acteurs;
    }

    public GenreFilm getGenre() {
        return genre;
    }

    public void setGenre(GenreFilm genre) {
        this.genre = genre;
    }

    public List<Avis> getListeAvis() {
        return listeAvis;
    }

    public void setListeAvis(List<Avis> listeAvis) {
        this.listeAvis = listeAvis;
    }

    public UtilisateurCible getCible() {
        return cible;
    }

    public void setCible(UtilisateurCible cible) {
        this.cible = cible;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public double calculeNoteMoyenne(){
        if(listeAvis.isEmpty()){
            return 0;
        }
        double somme = 0;
        for(Avis avis :listeAvis){
            somme = somme + avis.getNote();
        }
        return somme/listeAvis.size();
    }
    public void lire(){
        System.out.println("Lecture de "+titre+"...");
    }
    public void pause(){
        System.out.println("Lecture en pause");
    }

}

