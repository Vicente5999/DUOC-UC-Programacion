/*
 * Representa a una dirección de un cliente Llanquihue Tour
 * Contiene atributos como calle, numero, casa, comuna y ciudad
 */

package model;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Direccion {
    private String calle;
    private int numero;
    private int casa;
    private String comuna;
    private String ciudad;
    
    public Direccion(String calle, int numero, String ciudad, String comuna, int casa) {
        this.calle = calle;
        this.numero = numero;
        this.casa = casa;
        this.comuna = comuna;
        this.ciudad = ciudad;
    }
    
    public String getCalle() {
        return calle;
    } 
    public void setCalle(String nuevaCalle) {
        calle = nuevaCalle;
    }
    public int getNumero() {
        return numero;
    } 
    public void setNumero(int nuevoNumero) {
        numero = nuevoNumero;
    }
    public int getCasa() {
        return casa;
    } 
    public void setCasa (int nuevaCasa) {
        casa = nuevaCasa;
    }
    public String getComuna() {
        return comuna;
    } 
    public void setComuna(String nuevaComuna) {
        comuna = nuevaComuna;
    }
    public String getCiudad() {
        return ciudad;
    } 
    public void setCiudad(String nuevaCiudad) {
        ciudad = nuevaCiudad;
    }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + "casa " + casa + ", " + comuna + ", " + ciudad;
    }
}