/*
 * Representa a un cliente dentro del programa
 * Contiene atributos como username y direccion heredado de la clase Direccion
 * También incluye objetos heredados de la clase Persona, eso incluye nombre, apellido, numTelefono
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Cliente extends Persona {
    private String username;
    private Direccion direccion;

    public Cliente(String username, String nombre, String apellido, int numTelefono, Direccion direccion) {
        super(nombre, apellido, numTelefono);
        this.username = "";
        this.direccion = direccion;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String nuevoUsername) {
        username = nuevoUsername;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }

    @Override
    public String toString () {
        return "\n -- Cliente: -- \n " + "Nombre: " + getNombre() + " | Apellido: " + getApellido() + " | Numero de Teléfono: " + getNumTelefono() + " | Username: " + username + " | Direccion: " + direccion;
    }

    @Override
    public String asignarRepartidor() {

        return null;
    }
}