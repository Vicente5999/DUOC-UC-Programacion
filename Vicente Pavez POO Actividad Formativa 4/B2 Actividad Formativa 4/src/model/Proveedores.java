/*
 * Representa a un proveedor de alojamiento y transporte Llanquihue Tour
 * Contiene atributos comio nombre y direcccion
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Proveedores {
    private String nombre;
    private Direccion direccion;
    
    public Proveedores(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    } 
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public Direccion getDireccion() {
        return direccion;
    } 
    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }
    
    @Override
    public String toString() {
        return "\n -- Proveedor: -- \n " + "Nombre: " + nombre + " | Dirección: " + direccion;
    }    
}