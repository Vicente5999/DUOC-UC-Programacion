/*
 * Representa a una persona dentro del programa
 * Contiene atributos como nombre, apellido, numTelefono
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int numTelefono;

    public Persona(String nombre, String apellido, int numTelefono) {
        this.nombre = "";
        this.apellido = "";
        this.numTelefono = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String nuevoApellido) {
        apellido = nuevoApellido;
    }
    public int getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(int nuevoNumTel) {
        numTelefono = nuevoNumTel;
    }

    @Override
    public String toString () {
        return "\n -- Nombre: -- \n " + "Nombre: " + nombre + " | Apellido: " + apellido + " | Numero de Teléfono: " + numTelefono;
    }

    public abstract String asignarRepartidor();
}
