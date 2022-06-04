package modelo;

public class Empleados {
    private String codEmp;
    private String nomEmp;
    private String appEmp;
    private String apmEmp;
    private String dniEmp;
    private String telfEmp;
    private int codArea;
    
    public Empleados() {
    }

    public Empleados(String codEmp, String nomEmp, String appEmp, String apmEmp, String dniEmp, String telfEmp, int codArea) {
        this.codEmp = codEmp;
        this.nomEmp = nomEmp;
        this.appEmp = appEmp;
        this.apmEmp = apmEmp;
        this.dniEmp = dniEmp;
        this.telfEmp = telfEmp;
        this.codArea = codArea;
    }

    public String getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getAppEmp() {
        return appEmp;
    }

    public void setAppEmp(String appEmp) {
        this.appEmp = appEmp;
    }

    public String getApmEmp() {
        return apmEmp;
    }

    public void setApmEmp(String apmEmp) {
        this.apmEmp = apmEmp;
    }

    public String getDniEmp() {
        return dniEmp;
    }

    public void setDniEmp(String dniEmp) {
        this.dniEmp = dniEmp;
    }

    public String getTelfEmp() {
        return telfEmp;
    }

    public void setTelfEmp(String telfEmp) {
        this.telfEmp = telfEmp;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    
    
}
