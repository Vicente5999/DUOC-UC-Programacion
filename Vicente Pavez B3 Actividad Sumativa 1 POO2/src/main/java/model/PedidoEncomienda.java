/*
 * Representa a un pedido de encomienda dentro del programa
 * Contiene atributos como nombreRemitente, nombreDestinatario, pesoEncomienda, tamanoEncomienda y direccion de la clase Direccion
 * También incluye objetos heredados de la clase Pedido, eso incluye idPedido y tipoPedido
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class PedidoEncomienda extends Pedido implements ControladorDeEnvios.Despachable, ControladorDeEnvios.Rastreable, ControladorDeEnvios.Cancelable {
    private String nombreRemitente;
    private String nombreDestinatario;
    private String pesoEncomienda;
    private String tamanoEncomienda;
    private Direccion direccion;

    public PedidoEncomienda(String idPedido, String tipoPedido, double distanciaKm, String nombreRemitente, String nombreDestinatario, String pesoEncomienda, String tamanoEncomienda, Direccion direccion) {
        super(idPedido, tipoPedido, distanciaKm);
        this.nombreRemitente = "";
        this.nombreDestinatario = "";
        this.pesoEncomienda = "";
        this.tamanoEncomienda = "";
        this.direccion = direccion;
    }

    public String calcularTiempoEntrega() {
        return "Tiempo de Entrega: " + Math.round(20.0 + 1.5 * getDistanciaKm()) + " min";
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nuevoNombreRemitente) {
        nombreRemitente = nuevoNombreRemitente;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nuevoNombreDestinatario) {
        nombreDestinatario = nuevoNombreDestinatario;
    }

    public String getPesoEncomienda() {
        return pesoEncomienda;
    }

    public void setPesoEncomienda(String nuevoPesoEncomienda) {
        pesoEncomienda = nuevoPesoEncomienda;
    }

    public String getTamanoEncomienda() {
        return tamanoEncomienda;
    }

    public void setTamanoEncomienda(String nuevoTamanoEncomienda) {
        tamanoEncomienda = nuevoTamanoEncomienda;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }

    @Override
    public String asignarRepartidor() {
        return "Asignando repartidor...\n" +
                "→ Validando peso y embalaje... OK";
    }

    @Override
    public String despachar() {
        return "El pedido ha sido despachado.";
    }

    @Override
    public String cancelar() {
        return "El pedido ha sido cancelado.";
    }

    @Override
    public String verHistorial() {
        return "Mostrando el historial del pedido...";
    }


    @Override
    public String mostrarResumen() {
        return "Resumen del Pedido: \n" +
                getTipoPedido() + "\n" + nombreRemitente + "\n" + nombreDestinatario + "\n" + direccion + "\n" + getDistanciaKm() + "\n" + tamanoEncomienda + "\n" + pesoEncomienda + "\n" + getIDPedido();
    }

        public String asignarRepartidor(String nombreRepartidor) {
            return asignarRepartidor() + "\n→ Pedido asignado a " + nombreRepartidor;
        }
    }