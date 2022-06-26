
package modelo;

public class Marcas {
    private String codMar;
    private String nomMar;
    
    public Marcas() {
    }

    public Marcas(String codMar, String nomMar) {
        this.codMar = codMar;
        this.nomMar = nomMar;
    }

    public String getCodMar() {
        return codMar;
    }

    public void setCodMar(String codMar) {
        this.codMar = codMar;
    }

    public String getNomMar() {
        return nomMar;
    }

    public void setNomMar(String nomMar) {
        this.nomMar = nomMar;
    }
        
}
