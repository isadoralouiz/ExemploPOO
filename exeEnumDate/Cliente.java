package exeEnumDate;

import java.util.List;

public class Cliente {
   
   protected String nome;
   protected String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pedido fazerPedido(List<Pizza> pizza){
        
        double valorTotal = 0;
        for (Pizza pi : pizza) {
            valorTotal += pi.calcularPreco();
        }

        Pedido p = new Pedido(this, pizza, valorTotal);
        return p;
    }
}
