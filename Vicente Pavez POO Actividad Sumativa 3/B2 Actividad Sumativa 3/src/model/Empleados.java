/*
 * Representa a un empleado de Llanquihue Tour
 * Contiene atributos como nombre, apellido, cargo y dirección
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Empleados extends Personas {
    private String cargo;
    private Direccion direccion;
 
    public Empleados(String cargo, String nombre, String apellido, Direccion direccion) {
        super (nombre, apellido);
        this.cargo = cargo;
        this.direccion = direccion;
    }
    
    public String getCargo() {
        return cargo;
    } 
    public void setCargo(String nuevocargo) {
        cargo = nuevocargo;
    }
    public Direccion getDireccion() {
        return direccion;
    } 
    public void setDireccion(Direccion nuevaDireccion) {
        direccion = nuevaDireccion;
    }

    @Override
    public String toString() {
        return "\n -- Empleado: -- \n " + "Nombre: " + getNombre() + " " + getApellido() + " | Cargo:" + cargo + " | Dirección: " + direccion;
    }
}