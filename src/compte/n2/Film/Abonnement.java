package compte.n2.Film;

enum typeAbonnement{
    premium,standard,basique
}
public class Abonnement {
    private int prix;
    private typeAbonnement type;

    public Abonnement(int prix, typeAbonnement type) {
        this.prix = prix;
        this.type = type;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public typeAbonnement getType() {
        return type;
    }

    public void setType(typeAbonnement type) {
        this.type = type;
    }
}