package exEnumDate;

import java.time.format.DateTimeFormatter;

public class Pedido {

    protected int idPedido;
    protected DateTimeFormatter dataPedido;
    protected Cliente cliente;

    public Pedido(Cliente cliente, DateTimeFormatter dataPedido, int idPedido) {
        this.cliente = cliente;
        this.dataPedido = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.idPedido = idPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

}
