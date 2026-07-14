/*
 * Representa a un operador local de Llanquihue Tour
 * Contiene los atributos de nombre, apellido y direccion
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Operadores extends Personas{
    private String nombre;
    private String apellido;
    private Direccion direccion;
    
    public Operadores(String nombre, String apellido, Direccion direccion) {
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
        return "\n -- Operador Local: -- \n " + "Nombre:" + getNombre() + " " + getApellido() + " | Dirección: " + direccion;
    }
}