package exeEnumDate;
public class Pizza {

        public enum TamanhoPizza{
        PEQUENA(29.90),
        MEDIA(39.90),
        GRANDE(49.90),
        GIGANTE(59.90);
        
        protected double precoBase;
        
        TamanhoPizza(double precoBase) {
        this.precoBase = precoBase;
    }

        public double getPrecoBase() {
            return precoBase;
        }

        public void setPrecoBase(double precoBase) {
            this.precoBase = precoBase;
        }
    }

    protected String sabor;
    protected TamanhoPizza tamanhoPizza;

    public Pizza(String sabor, TamanhoPizza tamanhoPizza) {
        this.sabor = sabor;
        this.tamanhoPizza = tamanhoPizza;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public TamanhoPizza getTamanhoPizza() {
        return tamanhoPizza;
    }

    public void setTamanhoPizza(TamanhoPizza tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }

    public Double calcularPreco(){
        double preco = 0;
        
        switch (tamanhoPizza) {
                case PEQUENA:
                    preco = TamanhoPizza.PEQUENA.precoBase;
                    break;
                case MEDIA:
                    preco = TamanhoPizza.MEDIA.precoBase;
                    break;
                case GRANDE:
                    preco = TamanhoPizza.GRANDE.precoBase;
                    break;
                default:
                    preco = TamanhoPizza.GIGANTE.precoBase;
                    break;
            }

        return preco;
    }
}
