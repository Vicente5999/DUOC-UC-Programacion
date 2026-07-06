/*
 * Representa a una Ruta Gastronomica de Llanquihue Tour
 * Está vinculada con la superclase ServicioTuristico
 * Contiene atributos como super (nombre, duracionHoras) y numeroDeParadas
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;
    
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super (nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }
    
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    } 
    public void setNumeroDeParadas(int nuevoNumeroDeParadas) {
        numeroDeParadas = nuevoNumeroDeParadas;
    }
    
    @Override
    public String toString() {
        return "\n -- Ruta Gastronomica: -- \n " + "Número de Paradas: " + numeroDeParadas;
    }
}