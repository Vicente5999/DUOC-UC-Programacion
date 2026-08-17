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

public class PedidoEncomienda extends Pedido {
        private String nombreRemitente;
        private String nombreDestinatario;
        private String pesoEncomienda;
        private String tamanoEncomienda;
        private Direccion direccion;

    public PedidoEncomienda(String idPedido, String tipoPedido, String nombreRemitente, String nombreDestinatario, String pesoEncomienda, String tamanoEncomienda, Direccion direccion) {
            super(idPedido, tipoPedido);
            this.nombreRemitente = "";
            this.nombreDestinatario = "";
            this.pesoEncomienda = "";
            this.tamanoEncomienda = "";
            this.direccion = direccion;
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
        public String toString () {
            return "\n -- Pedido Encomienda: -- \n " + "ID: " + getIDPedido() + " | Dirección: " + direccion + " | Tipo de Pedido: " + getTipoPedido() + " | Nombre de Remitente: " + nombreRemitente + " | Nombre del Destinatario: " + nombreDestinatario + " | Peso Encomienda: " + pesoEncomienda + " | Tamaño Encomienda: " + tamanoEncomienda;
        }
    }