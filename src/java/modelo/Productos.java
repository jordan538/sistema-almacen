package modelo;

public class Productos {
    private int codProd;
    private String desProd;
    private int stockProd;
    private String umProd;
    private String fecProd;   
    
    public Productos() {
    }

    public Productos(int codProd, String desProd, int stockProd, String umProd, String fecProd) {
        this.codProd = codProd;
        this.desProd = desProd;
        this.stockProd = stockProd;
        this.umProd = umProd;
        this.fecProd = fecProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDesProd() {
        return desProd;
    }

    public void setDesProd(String desProd) {
        this.desProd = desProd;
    }

    public int getStockProd() {
        return stockProd;
    }

    public void setStockProd(int stockProd) {
        this.stockProd = stockProd;
    }

    public String getUmProd() {
        return umProd;
    }

    public void setUmProd(String umProd) {
        this.umProd = umProd;
    }

    public String getFecProd() {
        return fecProd;
    }

    public void setFecProd(String fecProd) {
        this.fecProd = fecProd;
    }

    
    
}
