package exIterator;

public class Massa {
    
   protected String tipoMassa;
   protected double precoMassa;
   protected String molhoMassa;

    public Massa(String molhoMassa, double precoMassa, String tipoMassa) {
        this.molhoMassa = molhoMassa;
        this.precoMassa = precoMassa;
        this.tipoMassa = tipoMassa;
    }

    public String getTipoMassa() {
        return tipoMassa;
    }

    public void setTipoMassa(String tipoMassa) {
        this.tipoMassa = tipoMassa;
    }

    public double getPrecoMassa() {
        return precoMassa;
    }

    public void setPrecoMassa(double precoMassa) {
        this.precoMassa = precoMassa;
    }

    public String getMolhoMassa() {
        return molhoMassa;
    }

    public void setMolhoMassa(String molhoMassa) {
        this.molhoMassa = molhoMassa;
    }
}
