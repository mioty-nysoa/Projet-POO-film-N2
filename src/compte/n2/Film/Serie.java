package compte.n2.Film;

import java.time.LocalDate;
import java.util.List;

    public class Serie extends Contenue {
        private int episode;
        private int dureeEpisode;


        public Serie(String titre, String realisateur, List<String> acteurs, List<String> genre,
                     String avis, int saison, List<String> cibles, LocalDate dateSortie,
                     String description, int episode, int dureeEpisode) {
            super(titre, realisateur, acteurs, genre, avis, saison, cibles, dateSortie, description);
            this.episode = episode;
            this.dureeEpisode = dureeEpisode;
        }

        public int getEpisode() {
            return episode;
        }

        public void setEpisode(int episode) {
            this.episode = episode;
        }

        public int getDureeEpisode() {
            return dureeEpisode;
        }

        public void setDureeEpisode(int dureeEpisode) {
            this.dureeEpisode = dureeEpisode;
        }
    }

