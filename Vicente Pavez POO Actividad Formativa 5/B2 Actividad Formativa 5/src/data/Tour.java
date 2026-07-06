/*
 * Representa a un Tour de Llanquihue Tour
 * Contiene atributos como nombre, tipo y precio
 */

package data;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Tour {
    private String nombre;
    private String tipo;
    private int precio;
 
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    } 
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String nuevoTipo) {
        tipo = nuevoTipo;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int nuevoPrecio) {
        precio = nuevoPrecio;
    }
    
 
    @Override
    public String toString() {
        return "\n Registro Tour: \n Nombre: " + nombre + " | Tipo:" + tipo + " | Precio: $" + precio;
        
    }
}
