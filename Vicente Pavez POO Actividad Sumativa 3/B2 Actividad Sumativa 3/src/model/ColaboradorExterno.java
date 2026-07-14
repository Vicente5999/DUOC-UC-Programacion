package model;

public class ColaboradorExterno implements Registrable {
    private String nombre;

    public ColaboradorExterno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    @Override
    public void mostrarResumen() {

    }
}
