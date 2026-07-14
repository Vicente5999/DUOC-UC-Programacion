/*
 * Representa a un Paseo Lacustre de Llanquihue Tour
 * Está vinculada con la superclase ServicioTuristico
 * Contiene atributos como super (nombre, duracionHoras) y tipoEmbaracion
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public abstract class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbaracion;
    
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbaracion) {
        super (nombre, duracionHoras);
        this.tipoEmbaracion = tipoEmbaracion;
    }
    
    public String getTipoEmbaracion() {
        return tipoEmbaracion;
    } 
    public void setTipoEmbaracion(String nuevoTipoEmbaracion) {
        tipoEmbaracion = nuevoTipoEmbaracion;
    }
    
    @Override
    public String toString() {
        return "\n -- Paseo Lacustre: -- \n " + "Tipo Embaración: " + tipoEmbaracion;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Paseo Lacustre: " + getNombre()
            + " | Tipo de Embarcacion: " + tipoEmbaracion);
    }
}