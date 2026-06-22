package compte.n2.Film;

enum typeAbonnement{
    premium,standard,basique
}
public class Abonnement {
    private double prix;
    private typeAbonnement type;
    private String duree;

    public Abonnement(double prix, typeAbonnement type,String duree) {
        this.prix = prix;
        this.type = type;
        this.duree=duree;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public typeAbonnement getType() {
        return type;
    }

    public void setType(typeAbonnement type) {
        this.type = type;
    }

    public String afficherInfos(){
        return "l'abonnement "+type+" est de "+prix+" pendant "+duree;
    }
}