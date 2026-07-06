/*
 * Representa al Servicio Turistico de Llanquihue Tour
 * Contiene los atributos de nombre y duracionHoras
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class ServicioTuristico {
    private String nombre;
    private int duracionHoras;
    
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    } 
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public int getDuracionHoras() {
        return duracionHoras;
    } 
    public void setDuracionHoras(int nuevoDuracionHoras) {
        duracionHoras = nuevoDuracionHoras;
    }
    
    @Override
    public String toString() {
        return "\n -- Servicio Tursiticos: -- \n " + "Nombre:" + nombre + " | Duración en Horas: " + duracionHoras;
    }
}