/*
 * Representa a un guia turistico de Llanquihue Tour
 * Contiene los atributo nombre, apellido, direccion
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class GuiaTuristico extends Personas implements Registrable {
    private Direccion direccion;
    
    public GuiaTuristico(String nombre, String apellido, Direccion direccion) {
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
        return "\n -- Guía Turístico: -- \n " + "Nombre:" + getNombre() + " " + getApellido() + " | Dirección: " + direccion;
    }

    @Override
    public void mostrarResumen() {

    }
}
