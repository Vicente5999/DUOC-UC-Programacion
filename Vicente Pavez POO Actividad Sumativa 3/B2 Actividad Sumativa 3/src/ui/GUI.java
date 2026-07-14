package ui;

import model.Direccion;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {

        try {
            String nombreGuia = JOptionPane.showInputDialog(null, "Ingresa el nombre del Guia Turistico:");
            if (nombreGuia == null) return; // Si cancela, termina el programa

            String apellidoGuia = JOptionPane.showInputDialog(null, "Ingresa el apellido del Guia Turistico:");
            if (apellidoGuia == null) return;

            String calle = JOptionPane.showInputDialog(null, "Ingresa la calle del Guia Turistico:");
            if (calle == null) return;

            String numeroStr = JOptionPane.showInputDialog(null, "Ingresa el numero de la calle:");
            if (numeroStr == null) return;

            int numeroCalle = Integer.parseInt(numeroStr);

            int casa = 0;
            boolean opcionValida = false;

            do {
                String esCondominio = JOptionPane.showInputDialog(null, "¿Su dirección contiene número de condominio o departamento? (si/no):");

                if (esCondominio == null) return;

                if (esCondominio.equalsIgnoreCase("si")) {
                    casa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de casa/depto del Guia Turistico:"));
                    opcionValida = true;

                } else if (esCondominio.equalsIgnoreCase("no")) {
                    opcionValida = true;

                } else {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese 'si' o 'no'.", "Atención", JOptionPane.WARNING_MESSAGE);
                }

            } while (!opcionValida);

            String comuna = JOptionPane.showInputDialog(null, "Ingrese comuna del Guia Turistico:");
            if (comuna == null) return;

            String ciudad = JOptionPane.showInputDialog(null, "Ingrese ciudad del Guia Turistico:");
            if (ciudad == null) return;

            String modeloVehiculo = JOptionPane.showInputDialog(null, "Ingresa el modelo del Vehiculo:");
            if (modeloVehiculo == null) return; // Si cancela, termina el programa

            String tipoVehiculo = JOptionPane.showInputDialog(null, "Ingresa el tipo de Vehiculo:");
            if (tipoVehiculo == null) return;

            Direccion nuevaDireccion = new Direccion(calle, numeroCalle, ciudad, comuna, casa);
            GuiaTuristico nuevoGuia = new GuiaTuristico(nombreGuia, apellidoGuia, nuevaDireccion);
            Vehiculo nuevoVehiculo = new Vehiculo(modeloVehiculo, tipoVehiculo);

            // 4. Mostrar el resultado
            JOptionPane.showMessageDialog(
                    null,
                    "Nuevo Guia Turistico registrado exitosamente\n\n" + nuevoGuia.toString(),
                    "Resumen del Registr de Guia Turistico",
                    JOptionPane.INFORMATION_MESSAGE
            );
            JOptionPane.showMessageDialog(
                    null,
                    "Nuevo Vehiculo registrado exitosamente\n\n" + nuevoVehiculo.toString(),
                    "Resumen del Registro de Vehiculo",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: Debes ingresar números en el número de calle y de casa.",
                    "Error de formato",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}