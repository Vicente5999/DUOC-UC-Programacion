/*
 * Representa a un pedido dentro del programa
 * Contiene atributos como idPedido, tipoPedido y distanciaKm
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public interface ControladorDeEnvios {

    public interface Despachable {
        String despachar();

        String asignarRepartidor();
    }

    public interface Cancelable {
        String cancelar();
    }

    public interface Rastreable {
        String verHistorial();
    }
}
