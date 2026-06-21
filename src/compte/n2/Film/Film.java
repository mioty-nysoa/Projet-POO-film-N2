package compte.n2.Film;
import java.time.LocalDate;
import java.util.List;

    public class Film extends Contenue {
        private int dureeFilm;

        public Film(String titre, String realisateur, List<String> acteurs, List<String> genre,
                            String avis, int saison, List<String> cibles, LocalDate dateSortie,
                            String description, int duree_film) {
            super(titre, realisateur, acteurs, genre, avis, saison, cibles, dateSortie, description);
            this.dureeFilm = duree_film;
        }

        public int getDureeFilm() {
            return dureeFilm;
        }

        public void setDuree_film(int dureeFilm) {
            this.dureeFilm = dureeFilm;
        }
    }

