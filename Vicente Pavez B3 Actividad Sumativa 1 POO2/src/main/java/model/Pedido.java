/*
 * Representa a un pedido dentro del programa
 * Contiene atributos como idPedido, tipoPedido y distanciaKm
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public abstract class Pedido implements ControladorDeEnvios {
    private String idPedido;
    private String tipoPedido;
    private double distanciaKm;

    public Pedido(String idPedido, String tipoPedido, double distanciaKm) {
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
        tipoPedido = nuevoTipoPedido;
    }
    public double getDistanciaKm() {
        return distanciaKm;
    }
    public void setDistanciaKm(double nuevoDistanciaKm) {
        distanciaKm = nuevoDistanciaKm;
    }

    public String mostrarResumen() {
        return "Resumen: \n";
    }

    public abstract String asignarRepartidor();

    //public abstract int calcularTiempoEntrega();
}