/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vicente5999 (GitHub)
 */

import model.ServicioTuristico;

public class GestorServicios {

        List<ServicioTuristico> servicios = new ArrayList<>();
        
            ServicioTuristico nuevoTourCultural = new ServicioTuristico("Excrusión Cultural", 4) {
                @Override
                public void mostrarInformacion() {
                    System.out.println("Excrusión Cultural" + " | Horas: " + "4");
                    servicios.add(nuevoTourCultural);

                }
            };
                ServicioTuristico nuevoTourLacustre = new ServicioTuristico("Paseo Lacustre", 3) {
                @Override
                public void mostrarInformacion() {
                    System.out.println("Paseo Lacustre" + " | Horas: " + "3");
                    servicios.add(nuevoTourLacustre);
                }
            };
                
                ServicioTuristico nuevoTourGastronomico = new ServicioTuristico("Ruta Gastronomica", 5) {
                @Override
                public void mostrarInformacion() {
                    System.out.println("Ruta Gastronómica" + " | Horas: " + "5");
                    servicios.add(nuevoTourGastronomico);

                }
            };
                ServicioTuristico nuevoTourTecnologico = new ServicioTuristico("Tour Tecnologico", 4) {
                @Override
                public void mostrarInformacion() {
                    System.out.println("Tour Tecnologico" + " | Horas: " + "4");
                    servicios.add(nuevoTourTecnologico);

                }
            };
                ServicioTuristico nuevoTourArtistico = new ServicioTuristico("Tour Artistico", 6) {
                @Override
                public void mostrarInformacion() {
                    System.out.println("Tour Artistico" + " | Horas: " + "6");
                    servicios.add(nuevoTourArtistico);

                }
            };
    }

        List<ServicioTuristico> servicios = new ArrayList<>();

            public void mostrarTodos() {
            for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
    }
}

void main() {
}
