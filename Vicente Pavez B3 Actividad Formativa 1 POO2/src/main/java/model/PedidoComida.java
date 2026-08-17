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

    public PedidoComida(String idPedido, String tipoPedido, String nombreRestaurante, String nombreAlimento, String tipoAlimento, Direccion direccion) {
        super(idPedido, tipoPedido);
        this.nombreRestaurante = "";
        this.nombreAlimento = "";
        this.tipoAlimento = "";
        this.direccion = direccion;
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
    public String toString () {
        return "\n -- Pedido Comida: -- \n " + "ID: " + getIDPedido() + " | Dirección: " + direccion + " | Tipo de Pedido: " + getTipoPedido() + " | Nombre de Alimento: " + nombreAlimento + " | Nombre del Restaurante: " + nombreRestaurante + " | Tipo de Alimento: " + tipoAlimento;
    }
}