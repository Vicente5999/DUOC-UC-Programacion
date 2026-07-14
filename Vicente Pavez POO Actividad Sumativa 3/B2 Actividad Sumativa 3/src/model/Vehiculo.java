package model;

public class Vehiculo implements Registrable{
    @Override
    public void mostrarResumen() {

    }
    private String modelo;
    private String tipo;

    public Vehiculo(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String nuevoModelo) {
            modelo = nuevoModelo;
        }
        public String getTipo() {
            return tipo;
        }
        public void setTipo(String nuevoTipo) {
            tipo = nuevoTipo;
        }

        @Override
        public String toString() {
            return "\n -- Vehiculo: -- \n " + "Modelo: " + modelo + " Tipo: " + tipo;
        }
    }
