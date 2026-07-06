/*
 * Representa a un guia turistico de Llanquihue Tour
 * Contiene los atributo nombre, apellido, direccion
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Guias {
    private String nombre;
    private String apellido;
    private Direccion direccion;
    
    public Guias(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
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
    public Direccion getDireccion() {
        return direccion;
    } 
    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }
    
    @Override
    public String toString() {
        return "\n -- Guía Turístico: -- \n " + "Nombre:" + nombre + " " + apellido + " | Dirección: " + direccion; 
    }
}
