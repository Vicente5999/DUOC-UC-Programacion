/*
 * Representa a la "zona de carga" dentro del programa
 * Contiene una lista con los pedidos pendientes
 * También contiene funciones como agregarPedido y retirarPedido
 */

package data;

import model.Pedido;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class ZonaDeCarga {
    private List<Pedido> pedidosPendientes;

    public ZonaDeCarga() {
        this.pedidosPendientes = new LinkedList<>();
        System.out.println("[Zona de carga inicializada]");
    }

    public synchronized void agregarPedido(Pedido p) {
        pedidosPendientes.add(p);
        System.out.println("Pedido #" + p.getIDPedido() + " agregado. Destino: " + p.getDireccionEntrega());
    }

    public synchronized Pedido retirarPedido() {
        if (pedidosPendientes.isEmpty()) {
            return null;
        }
        return pedidosPendientes.remove(0);
    }
}