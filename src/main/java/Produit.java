

public class Produit {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String desc;
    private double nbrStock;

    public Produit(){};
    public Produit(long id, String nom, double prix, String desc, double nbrStock, String marque){
        this.id =id; this.nom=nom; this.marque =marque;
        this.prix=prix; this.desc=desc; this.nbrStock=nbrStock;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id+"\t"+this.nom+"\t"+this.prix+"\t"+this.nbrStock+"\t"+this.marque+"\n";
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getNbrStock() {
        return nbrStock;
    }

    public void setNbrStock(double nbrStock) {
        this.nbrStock = nbrStock;
    }
}
