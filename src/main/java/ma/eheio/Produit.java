package ma.eheio;

public class Produit {

    private Long Id;

    private String Nom;

    private  Double Prix;

    private int Qnt;

    public Double getPrix() {
        return Prix;
    }

    public int getQnt() {
        return Qnt;
    }

    public Long getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setPrix(Double prix) {
        Prix = prix;
    }

    public void setQnt(int qnt) {
        Qnt = qnt;
    }
}
