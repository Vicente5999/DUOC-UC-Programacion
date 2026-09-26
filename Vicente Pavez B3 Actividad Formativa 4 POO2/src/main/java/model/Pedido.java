/*
 * Representa a un pedido dentro del programa
 * Contiene atributos como id, direccionEntrega y estado
 * También contiene constructores, getters, setters y un toString
 */

package model;

import data.EstadoPedido;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Pedido {
    protected String id;
    protected String direccionEntrega;
    protected String tipo;
    protected EstadoPedido estado;

    public Pedido(String id, String direccionEntrega, EstadoPedido estado) {
        this.id = id;
        this.direccionEntrega = direccionEntrega;
        this.estado = estado;
    }

    public Pedido(String id, String direccion, String tipo) {
    }

    public void setIDPedido(String nuevoIDPedido) {
        id = nuevoIDPedido;
    }
    public String getIDPedido() {
        return id;
    }

    public void setDireccionEntrega(String nuevoDireccionEntrega) {
        direccionEntrega = nuevoDireccionEntrega;
    }
    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setEstado(EstadoPedido nuevoEstado) {
        estado = nuevoEstado;
    }
    public EstadoPedido getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", estado=" + estado +
                '}';
    }
}
