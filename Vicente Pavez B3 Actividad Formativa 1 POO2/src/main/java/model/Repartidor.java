/*
 * Representa a un repartidor dentro del programa
 * Contiene atributos como restauranteAsignado y tipoVehiculo
 * También incluye objetos heredados de la clase Persona, eso incluye nombre, apellido, numTelefono
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Repartidor extends Persona {
        private String restauranteAsignado;
        private String tipoVehiculo;

    public Repartidor(String nombre, String apellido, int numTelefono, String nombreRestaurante, String nombreAlimento, String tipoAlimento) {
            super(nombre, apellido, numTelefono);
            this.restauranteAsignado = "";
            this.tipoVehiculo = "";
        }
        public String getRestauranteAsignado() {
            return restauranteAsignado;
        }
        public void setRestauranteAsignado(String nuevoRestauranteAsignado) {
            restauranteAsignado = nuevoRestauranteAsignado;
        }
        public String getTipoVehiculo() {
            return tipoVehiculo;
        }
        public void setTipoVehiculo(String nuevoTipoVehiculo) {
            tipoVehiculo = nuevoTipoVehiculo;
        }

        @Override
        public String toString () {
            return "\n -- Repartidor: -- \n " + " Nombre: " + getNombre() + " " + getApellido() + " | Restaurante Asignado: " + restauranteAsignado + " | Tipo de Vehiculo: " + tipoVehiculo;
        }

        @Override
        public String asignarRepartidor() {
            return "→ Pedido asignado a " + getNombre() + " " + getApellido() + "\n";
        }
    }