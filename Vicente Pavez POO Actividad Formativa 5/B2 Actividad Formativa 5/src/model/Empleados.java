/*
 * Representa a un empleado de Llanquihue Tour
 * Contiene atributos como nombre, apellido, cargo y dirección
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Empleados {
    private String cargo;
    private String nombre;
    private String apellido;
    private Direccion direccion;
 
    public Empleados(String cargo, String nombre, String apellido, Direccion direccion) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.apellido = apellido;
    }
    
    public String getCargo() {
        return cargo;
    } 
    public void setCargo(String nuevocargo) {
        cargo = nuevocargo;
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
        return "\n -- Empleado: -- \n " + "Nombre: " + nombre + " " + apellido + " | Cargo:" + cargo + " | Dirección: " + direccion; 
    }
}