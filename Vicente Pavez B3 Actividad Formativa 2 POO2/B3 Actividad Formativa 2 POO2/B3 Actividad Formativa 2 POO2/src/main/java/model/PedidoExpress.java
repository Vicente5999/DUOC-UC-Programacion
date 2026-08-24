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
    private String pedidoSupermercado;
    private String pedidoFarmacia;
    private Direccion direccion;

    public PedidoExpress(String idPedido, String tipoPedido, double distanciaKm, String nombrePedido, String pedidoSupermercado, String pedidoFarmacia, Direccion direccion) {
        super(idPedido, tipoPedido, distanciaKm);
        this.nombrePedido = "";
        this.pedidoSupermercado = pedidoSupermercado;
        this.pedidoFarmacia = pedidoFarmacia;
        this.direccion = direccion;
    }

    public String calcularTiempoEntrega() {
        int tiempoBase = 10;
        if (distanciaKm > 5) {
            tiempoBase = tiempoBase + 5;
        } return "Tiempo de Entrega: " + tiempoBase + " min";
    }

    public String getNombrePedido() {
        return nombrePedido;
    }
    public void setNombrePedido(String nuevoNombrePedido) {
        nombrePedido = nuevoNombrePedido;
    }
    public String getPedidoFarmacia() {
        return pedidoFarmacia;
    }
    public void setPedidoFarmacia(String nuevoPedidoFarmacia) {
        pedidoFarmacia = nuevoPedidoFarmacia;
    }
    public String getPedidoSupermercado() {
        return pedidoSupermercado;
    }
    public void setPedidoSupermercado(String nuevoPedidoSupermercado) {
        pedidoSupermercado = nuevoPedidoSupermercado;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }
    public double getDistanciaKm() {
        return distanciaKm;
    }
    public void setDistanciaKm(double nuevoDistanciaKm) {
        distanciaKm = nuevoDistanciaKm;
    }

    @Override
    public String toString () {
        return "\n -- Pedido Express: -- \n " + "ID: " + getIDPedido() + " | Dirección: " + direccion + " | Tipo de Pedido: " + getTipoPedido();
    }

    @Override
    public String asignarRepartidor() {
        return "Asignando repartidor...\n" +
                "→ Repartidor más cercano con disponibilidad inmediata encontrado.";
    }

    public String asignarRepartidor(String nombreRepartidor) {
        return asignarRepartidor() + "\n→ Pedido asignado a " + nombreRepartidor;
    }
}