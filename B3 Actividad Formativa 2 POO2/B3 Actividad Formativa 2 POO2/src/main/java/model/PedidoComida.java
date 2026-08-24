/*
 * Representa a un pedido de comida dentro del programa
 * Contiene atributos como nombreRestaurante, nombreAlimento, tipoAlimento y direccion de la clase Direccion
 * También incluye objetos heredados de la clase Pedido, eso incluye idPedido y tipoPedido
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class PedidoComida extends Pedido {
    private String nombreRestaurante;
    private String nombreAlimento;
    private String tipoAlimento;
    private Direccion direccion;

    public PedidoComida(String idPedido, String tipoPedido, double distanciaKm, String nombreRestaurante, String nombreAlimento, String tipoAlimento, Direccion direccion) {
        super(idPedido, tipoPedido, distanciaKm);
        this.nombreRestaurante = nombreRestaurante;
        this.nombreAlimento = nombreAlimento;
        this.tipoAlimento = tipoAlimento;
        this.direccion = direccion;
    }

    public String calcularTiempoEntrega() {
        return "Tiempo de Entrega: " + Math.round(20.0 + 1.5 * distanciaKm) + " min";
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }
    public void setNombreRestaurante(String nuevoNombreRestaurante) {
        nombreRestaurante = nuevoNombreRestaurante;
    }
    public String getNombreAlimento() {
        return nombreAlimento;
    }
    public void setNombreAlimento(String nuevoNombreAlimento) {
        nombreAlimento = nuevoNombreAlimento;
    }
    public String getTipoAlimento() {
        return tipoAlimento;
    }
    public void setTipoAlimento(String nuevoTipoAlimento) {
        tipoAlimento = nuevoTipoAlimento;
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
        return "\n -- Pedido Comida: -- \n " + "ID: " + getIDPedido() + " | Dirección: " + direccion + " | Tipo de Pedido: " + getTipoPedido() + " | Nombre de Alimento: " + nombreAlimento + " | Nombre del Restaurante: " + nombreRestaurante + " | Tipo de Alimento: " + tipoAlimento;
    }

    @Override
    public String asignarRepartidor() {
        return "[Pedido Comida]\nAsignando repartidor...\n→ Verificando mochila térmica... OK";
    }

    public String asignarRepartidor(String nombreRepartidor) {
        return asignarRepartidor() + "\n→ Pedido asignado a " + nombreRepartidor;
    }
}