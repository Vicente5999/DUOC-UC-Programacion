/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class GestorEntidades {

    Direccion direccionGuias = new Direccion("", 0, "", "", 0);

    List<Registrable> Interfaz = new ArrayList<>();
    GuiaTuristico GuiaTuristico = new GuiaTuristico("", "", direccionGuias) {
        @Override
        public void mostrarResumen() {
            System.out.println();
            Interfaz.add(GuiaTuristico);
        }
    };
    ColaboradorExterno ColaboradorExterno = new ColaboradorExterno("") {
        @Override
        public void mostrarResumen() {
            System.out.println();
            Interfaz.add(ColaboradorExterno);
        }
    };
    Vehiculo Vehiculo = new Vehiculo("", "") {
        @Override
        public void mostrarResumen() {
            System.out.println();
            Interfaz.add(Vehiculo);
        };
    };

    public void mostrarTodos() {
        for (Registrable Resumen : Interfaz) {
            Resumen.mostrarResumen();
        }
    }
}