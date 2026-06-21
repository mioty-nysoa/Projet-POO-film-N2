package compte.n2.Film;

import java.util.List;

public class Admin {
    private List<Utilisateur> tousLesUtilisateurs;

    public Admin(List<Utilisateur> tousLesUtilisateurs) {
        this.tousLesUtilisateurs = tousLesUtilisateurs;
    }

    public int calculerRevenusTotaux() {
        int totalArgent = 0;

        for (Utilisateur user : tousLesUtilisateurs) {

            if (user.getAbonnement() != null) {
                totalArgent = totalArgent + user.getAbonnement().getPrix();
            }
        }

        return totalArgent;
    }
}
