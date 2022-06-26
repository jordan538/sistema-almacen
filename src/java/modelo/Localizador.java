package modelo;

public class Localizador {
    private String codLoca;
    private String desLoca;
    
    public Localizador() {
    }

    public Localizador(String codLoca, String desLoca) {
        this.codLoca = codLoca;
        this.desLoca = desLoca;
    }

    public String getCodLoca() {
        return codLoca;
    }

    public void setCodLoca(String codLoca) {
        this.codLoca = codLoca;
    }

    public String getDesLoca() {
        return desLoca;
    }

    public void setDesLoca(String desLoca) {
        this.desLoca = desLoca;
    }
    
    
}
