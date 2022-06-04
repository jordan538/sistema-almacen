package modelo;

public class Categorias {
    private String codCat;
    private String nomCat;
    
    public Categorias() {
    }

    public Categorias(String codCat, String nomCat) {
        this.codCat = codCat;
        this.nomCat = nomCat;
    }

    public String getCodCat() {
        return codCat;
    }

    public void setCodCat(String codCat) {
        this.codCat = codCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }
    
    
}
