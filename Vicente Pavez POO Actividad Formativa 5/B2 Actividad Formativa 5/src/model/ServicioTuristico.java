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
        return "\n -- Servicios Tursiticos: -- \n " + "Nombre: " + nombre + " | Duración en Horas: " + duracionHoras;
    }   
    
    RutaGastronomica registroRutaGastronomica = new RutaGastronomica("", 0, 0);
    PaseoLacustre registroPaseoLacustre = new PaseoLacustre("", 0, "");
    ExcursionCultural registroExcursionCultural = new ExcursionCultural("", 0, "");
        
    public void mostrarInformacion() {
	System.out.println(registroRutaGastronomica.toString());
        System.out.println(registroPaseoLacustre.toString());
        System.out.println(registroExcursionCultural.toString());
    }
}