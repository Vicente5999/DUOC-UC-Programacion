/*
 * Representa a un pedido express dentro del programa
 * Contiene atributos como nombrePedido, pedidoSupermercado, pedidoFarmacia y direccion de la clase Direccion
 * También incluye objetos heredados de la clase Pedido, eso incluye idPedido y tipoPedido
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class PedidoExpress extends Pedido {
    private String nombrePedido;
    private boolean pedidoSupermercado;
    private boolean pedidoFarmacia;
    private Direccion direccion;

    public PedidoExpress(String idPedido, String tipoPedido, String nombrePedido, boolean pedidoSupermercado, boolean pedidoFarmacia, Direccion direccion) {
        super(idPedido, tipoPedido);
        this.nombrePedido = "";
        this.pedidoSupermercado = false;
        this.pedidoFarmacia = false;
        this.direccion = direccion;
    }
    public String getNombrePedido() {
        return nombrePedido;
    }
    public void setNombrePedido(String nuevoNombrePedido) {
        nombrePedido = nuevoNombrePedido;
    }
    public boolean getPedidoFarmacia() {
        return pedidoFarmacia;
    }
    public void setPedidoFarmacia(boolean nuevoPedidoFarmacia) {
        pedidoFarmacia = nuevoPedidoFarmacia;
    }
    public boolean getPedidoSupermercado() {
        return pedidoSupermercado;
    }
    public void setPedidoSupermercado(boolean nuevoPedidoSupermercado) {
        pedidoSupermercado = nuevoPedidoSupermercado;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }

    @Override
    public String toString () {
        return "\n -- Pedido Express: -- \n " + "ID: " + getIDPedido() + " | Dirección: " + direccion + " | Tipo de Pedido: " + getTipoPedido();
    }
}