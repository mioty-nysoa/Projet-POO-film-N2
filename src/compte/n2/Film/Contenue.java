package compte.n2.Film;
import java.time.LocalDate;
import java.util.List;

public class Contenue {

        private String titre;
        private String realisateur;
        private List<String> acteurs;
        private List<String> genre;
        private String avis;
        private int saison;
        private List<String> cibles;
        private LocalDate dateSortie;
        private String description;


        public Contenue(String titre, String realisateur, List<String> acteurs, List<String> genre,
                        String avis, int saison, List<String> cibles, LocalDate dateSortie,
                        String description) {
            this.titre = titre;
            this.realisateur = realisateur;
            this.acteurs = acteurs;
            this.genre = genre;
            this.avis = avis;
            this.saison = saison;
            this.cibles = cibles;
            this.dateSortie = dateSortie;
            this.description = description;
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

        public List<String> getGenre() {
            return genre;
        }

        public void setGenre(List<String> genre) {
            this.genre = genre;
        }

        public String getAvis() {
            return avis;
        }

        public void setAvis(String avis) {
            this.avis = avis;
        }

        public int getSaison() {
            return saison;
        }

        public void setSaison(int saison) {
            this.saison = saison;
        }

        public List<String> getCibles() {
            return cibles;
        }

        public void setCibles(List<String> cibles) {
            this.cibles = cibles;
        }

        public LocalDate getDateSortie() {
            return dateSortie;
        }

        public void setDate_sortie(LocalDate date_sortie) {
            this.dateSortie = date_sortie;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

