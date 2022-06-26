
package modelo;

public class Proveedor {
    private String codProv;
    private int rucProv;
    private String razonProv;
    private String dirProv;
    private String telProv; 
    
    public Proveedor() {
    }

    public Proveedor(String codProv, int rucProv, String razonProv, String dirProv, String telProv) {
        this.codProv = codProv;
        this.rucProv = rucProv;
        this.razonProv = razonProv;
        this.dirProv = dirProv;
        this.telProv = telProv;
    }

    public String getCodProv() {
        return codProv;
    }

    public void setCodProv(String codProv) {
        this.codProv = codProv;
    }

    public int getRucProv() {
        return rucProv;
    }

    public void setRucProv(int rucProv) {
        this.rucProv = rucProv;
    }

    public String getRazonProv() {
        return razonProv;
    }

    public void setRazonProv(String razonProv) {
        this.razonProv = razonProv;
    }

    public String getDirProv() {
        return dirProv;
    }

    public void setDirProv(String dirProv) {
        this.dirProv = dirProv;
    }

    public String getTelProv() {
        return telProv;
    }

    public void setTelProv(String telProv) {
        this.telProv = telProv;
    }
    
    
    
}
