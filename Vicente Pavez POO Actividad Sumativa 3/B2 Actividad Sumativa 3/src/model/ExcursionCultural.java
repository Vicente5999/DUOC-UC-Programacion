/*
 * Representa a una Excursion Cultural de Llanquihue Tour
 * Está vinculada con la superclase ServicioTuristico
 * Contiene atributos como super (nombre, duracionHoras) y lugarHistorico
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class ExcursionCultural extends ServicioTuristico {
 private String lugarHistorico;
    
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super (nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }
    
    public String getLugarHistorico() {
        return lugarHistorico;
    } 
    public void setLugarHistorico(String nuevoLugarHistorico) {
        lugarHistorico = nuevoLugarHistorico;
    }
    
    @Override
    public String toString() {
        return "\n -- Excursion Cultural: -- \n " + "Lugar Historico: " + lugarHistorico;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Excursion Cultural: " + getNombre()
            + " | Lugar Historico a Visitar: " + lugarHistorico);
    }
}
