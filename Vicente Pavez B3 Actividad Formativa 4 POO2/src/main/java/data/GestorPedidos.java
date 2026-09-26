/*
 * Representa al Gestor de pedidos dentro del programa
 * Contiene las funciones agregar agregarPedido y getPedidos
 */

package data;

import model.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class GestorPedidos {
    private List<Pedido> pedidos;

    public GestorPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}