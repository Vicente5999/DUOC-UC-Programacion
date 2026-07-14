package model;

public class Personas {
    private String nombre;
    private String apellido;

    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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
}
