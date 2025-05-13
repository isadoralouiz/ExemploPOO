package exeEnumDate;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {


    protected DateTimeFormatter dataPedido;
    protected Cliente cliente;
    protected double valorTotal;
    protected List<Pizza> listPizza;

    public Pedido(Cliente cliente, List<Pizza> listPizza, double valorTotal) {
        this.dataPedido = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.cliente = cliente;
        this.listPizza = listPizza;
        this.valorTotal = valorTotal;
    }

    public DateTimeFormatter getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(DateTimeFormatter dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Pizza> getListPizza() {
        return listPizza;
    }

    public void setListPizza(List<Pizza> listPizza) {
        this.listPizza = listPizza;
    }

    public void addPizza(Pizza pizza){
        listPizza.add(pizza);
    }

    
    public void calcularTotal(){
        int valorTotal = 0;

        for (Pizza p : listPizza) {
            valorTotal += p.calcularPreco();
        }
    }

}
