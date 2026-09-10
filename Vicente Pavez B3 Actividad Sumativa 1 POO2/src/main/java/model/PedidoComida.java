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

public class PedidoComida extends Pedido implements ControladorDeEnvios.Despachable, ControladorDeEnvios.Rastreable, ControladorDeEnvios.Cancelable {
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
        int tiempoBase = 15;
        int tiempoPorKm = 2;
        return "Tiempo de Entrega: " + Math.round(tiempoBase + tiempoPorKm * getDistanciaKm()) + " min";
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

    @Override
    public String despachar() {
        return "El pedido ya ha sido despachado.";
    }

    @Override
    public String cancelar() {
        return "El pedido se ha cancelado.";
    }

    @Override
    public String verHistorial() {
        return "Mostrando el historial del pedido... \n";
    }

    @Override
    public String toString () {
        return "\n -- Pedido Comida: -- \n " + "ID: " + getIDPedido() + " | Dirección: " + direccion + " | Tipo de Pedido: " + getTipoPedido() + " | Nombre de Alimento: " + nombreAlimento + " | Nombre del Restaurante: " + nombreRestaurante + " | Tipo de Alimento: " + tipoAlimento;
    }

    @Override
    public String asignarRepartidor() {
        return "[Pedido Comida]\nAsignando repartidor...\n→ Verificando mochila térmica... OK";
    }

    @Override
    public String mostrarResumen() {
        return "Resumen del Pedido: \n" +
                getTipoPedido() + "\n" + nombreRestaurante + "\n" + nombreAlimento + "\n" + tipoAlimento + "\n" + direccion + "\n" + getIDPedido();
    }

    public String asignarRepartidor(String nombreRepartidor) {
        return asignarRepartidor() + "\n→ Pedido asignado a " + nombreRepartidor;
    }
}