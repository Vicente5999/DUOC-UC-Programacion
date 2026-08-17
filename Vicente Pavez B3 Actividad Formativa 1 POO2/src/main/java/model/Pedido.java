/*
 * Representa a un pedido dentro del programa
 * Contiene atributos como idPedido y tipoPedido
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Pedido {
    private String idPedido;
    private String tipoPedido;

    public Pedido(String idPedido, String tipoPedido) {
        this.idPedido = idPedido;
        this.tipoPedido = tipoPedido;
    }
    public String getIDPedido() {
        return idPedido;
    }
    public void setIDPedido(String nuevoIDPedido) {
        idPedido = nuevoIDPedido;
    }
    public String getTipoPedido() {
        return tipoPedido;
    }
    public void setTipoPedido(String nuevoTipoPedido) {
    }

    @Override
    public String toString () {
        return "\n -- Pedido: -- \n " + "ID: " + idPedido + " | Tipo de Pedido: " + tipoPedido;
    }

    public String asignarRepartidor() {
        System.out.println("\n -- Pedido: -- \n " + "ID: " + idPedido + " | Tipo de Pedido: " + tipoPedido);
        return null;
    }
}
