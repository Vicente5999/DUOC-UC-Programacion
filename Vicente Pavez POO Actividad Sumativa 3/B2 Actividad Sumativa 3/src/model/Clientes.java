/*
 * Representa a un cliente de Llanquihue Tour
 * Contiene atributos como nombre, apellido y direccion
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Clientes extends Personas {
    private Direccion direccion;
    
    public Clientes(String nombre, String apellido, Direccion direccion) {
        super (nombre, apellido);
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    } 
    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }
    
    @Override
    public String toString() {
        return "\n -- Cliente: -- \n " + "Nombre: " + getNombre() + " " + getApellido() + " | Dirección: " + direccion;
    }    
}