/*
 * Representa la clase Main donde se ecnuentra la clase principal a ejecutar 
 * Contiene todo el codigo necesario para registrar Tours, Clientes, Empleados, Guías Turisticos, Operadores Locales y Proveedores de Llanquihue Tour
 * Incluye un sistema de visualización de registros y busqueda de registros por nombre
 * También puedes modificar los registros en un archivo txt ubicado en "resources/tours.txt" los cuales están separados mediante el caracter ";"
 */

package ui;

/**
 *
 * @author Vicente5999 (GitHub)
 */

import data.GestorDatos;
import data.Tour;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import model.Clientes;
import model.Direccion;
import model.Empleados;
import model.ExcursionCultural;
import model.GuiaTuristico;
import model.Operadores;
import model.PaseoLacustre;
import model.Proveedores;
import model.RutaGastronomica;

public class Main {

   public static void main(String[] args) {
        
        Direccion direccionClientes = new Direccion("", 0, "", "", 0);
        Direccion direccionEmpleados = new Direccion("", 0, "", "", 0);
        Direccion direccionGuias = new Direccion("", 0, "", "", 0);
        Direccion direccionOperadores = new Direccion("", 0, "", "", 0);
        Direccion direccionProveedores = new Direccion("", 0, "", "", 0);
        Clientes registroCliente = new Clientes("", "", direccionClientes);
        Empleados registroEmpleados = new Empleados("", "", "", direccionEmpleados);
        GuiaTuristico registroGuias = new GuiaTuristico("", "", direccionGuias);
        Operadores registroOperadores = new Operadores("", "", direccionOperadores);
        Proveedores registroProveedores = new Proveedores("", direccionProveedores);
        Tour registroTour = new Tour("", "", 0);
        registroCliente.setDireccion(direccionClientes);
        RutaGastronomica registroRutaGastronomica = new RutaGastronomica("", 0, 0) {};
        PaseoLacustre registroPaseoLacustre = new PaseoLacustre("", 0, "") {};
        ExcursionCultural registroExcursionCultural = new ExcursionCultural("", 0, "");
        
        try (Scanner input = new Scanner(System.in)) {
            // Registro de Cliente
            System.out.println("\n--- Registro Cliente ---");
            System.out.println("Ingrese nombre del cliente:");
            registroCliente.setNombre(input.nextLine());
            System.out.println("Ingrese apellido del cliente:");
            registroCliente.setApellido(input.nextLine());
            
            System.out.println("-- Direccion del cliente: --");
            System.out.println("Ingrese calle del cliente:");
            registroCliente.getDireccion().setCalle(input.nextLine());
            
            System.out.println("Ingrese numero de la calle del cliente:");
            registroCliente.getDireccion().setNumero(input.nextInt());
       
            input.nextLine();
          
            boolean opcionValida = true;
            
            do {
                System.out.println("¿Su dirección contiene número condominio o departamento? (si/no):");
                String esCondominio = input.nextLine();
                
                if (esCondominio.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese numero de casa/depto del cliente:");
                   registroCliente.getDireccion().setCasa(input.nextInt());
                    input.nextLine();
                    System.out.println("Ingrese comuna del cliente:");
                    registroCliente.getDireccion().setComuna(input.nextLine());
                    System.out.println("Ingrese ciudad del cliente:");
                    registroCliente.getDireccion().setCiudad(input.nextLine());
                    opcionValida = true; 
                    
                } else if (esCondominio.equalsIgnoreCase("no")) {
                    System.out.println("Ingrese comuna del cliente:");
                    registroCliente.getDireccion().setComuna(input.nextLine());
                    System.out.println("Ingrese ciudad del cliente:");
                    registroCliente.getDireccion().setCiudad(input.nextLine());
                    opcionValida = true;
                    
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");      
                }
                
            } while (!opcionValida);
            
            // Registro de Tour
            System.out.println("\n--- Registro Tour ---");
            System.out.println("Ingrese nombre del tour:");
            registroTour.setNombre(input.nextLine());
            System.out.println("Ingrese tipo de tour:");
            registroTour.setTipo(input.nextLine());
            System.out.println("Ingrese precio del tour:");

            opcionValida = false;
            
            if (input.hasNextInt()) {
                do { 
                    registroTour.setPrecio(input.nextInt());
                    opcionValida = true;
                } while (!opcionValida);
            } else {
                System.out.println("Ingrese un numero valido"); 
            }
            
            input.nextLine();
            

            // Registro de Ruta Gastronomica
            System.out.println("\n--- Registro Tour ---");
            System.out.println("Ingrese nombre de la Ruta Gastronomica:");
            registroRutaGastronomica.setNombre(input.nextLine());
            System.out.println("Ingrese duración en Horas de la Ruta Gastronomica:");
            registroRutaGastronomica.setDuracionHoras(input.nextInt());
            input.nextLine();
            System.out.println("Ingrese número de paradas en la Ruta Gastronomica:");
            registroRutaGastronomica.setNumeroDeParadas(input.nextInt());
            input.nextLine();

            // Registro de Paseo Lacustre
            System.out.println("\n--- Registro Tour ---");
            System.out.println("Ingrese nombre del Paseo Lacustre:");
            registroPaseoLacustre.setNombre(input.nextLine());
            System.out.println("Ingrese duración en Horas del Paseo Lacustre:");
            registroPaseoLacustre.setDuracionHoras(input.nextInt());
            input.nextLine();
            System.out.println("Ingrese el tipo de embarcación del Paseo Lacustre:");
            registroPaseoLacustre.setTipoEmbaracion(input.nextLine());
            
            // Registro de Excursion Cultural
            System.out.println("\n--- Registro Tour ---");
            System.out.println("Ingrese nombre de la Excursion Cultural:");
            registroExcursionCultural.setNombre(input.nextLine());
            System.out.println("Ingrese duración en Horas de la Excursion Cultural:");
            registroExcursionCultural.setDuracionHoras(input.nextInt());
            input.nextLine();
            System.out.println("Ingrese el lugar historico la Excursion Cultural:");
            registroExcursionCultural.setLugarHistorico(input.nextLine());
           
            // Registro de empleado
            opcionValida = false;
            do {
                System.out.println("¿Desea registrar a un empleado? (si/no):");
                String nuevoEmpleado = input.nextLine();
                
                if (nuevoEmpleado.equalsIgnoreCase("si")) {
                    System.out.println("\n--- Registro Empleado ---");
                    System.out.println("Ingrese nombre del empleado:");
                    registroEmpleados.setNombre(input.nextLine());
                    System.out.println("Ingrese apellido del empleado:");
                    registroEmpleados.setApellido(input.nextLine());
            
                    System.out.println("Ingrese cargo del empleado:");
                    registroEmpleados.setCargo(input.nextLine());
                    opcionValida = true;
                    
                    System.out.println("-- Direccion del cliente: --");
                    System.out.println("Ingrese calle del empleado:");
                    registroEmpleados.getDireccion().setCalle(input.nextLine());
            
                    System.out.println("Ingrese numero de la calle del empleado:");
                    registroEmpleados.getDireccion().setNumero(input.nextInt());                        
   
                    input.nextLine();
                         
                do {
                    System.out.println("¿Su dirección contiene número condominio o departamento? (si/no):");
                    String esCondominio = input.nextLine();
                
                    if (esCondominio.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese numero de casa/depto del empleado:");
                        registroEmpleados.getDireccion().setCasa(input.nextInt());
                        input.nextLine();
                        System.out.println("Ingrese comuna del empleado:");
                        registroEmpleados.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del empleado:");
                        registroEmpleados.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true; 
                    
                    } else if (esCondominio.equalsIgnoreCase("no")) {
                        System.out.println("Ingrese comuna del empleado:");
                        registroEmpleados.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del empleado:");
                        registroEmpleados.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true;
                    
                    } else {
                        System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");      
                    }
                    
                        } while (!opcionValida);
                
                } else if (nuevoEmpleado.equalsIgnoreCase("no")) {
                    opcionValida = true;
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");
                }
                
            } while (!opcionValida);

            // Registro de Guía Turistíco
            opcionValida = false;
            do {
                System.out.println("¿Desea registrar a un guia turistico? (si/no):");
                String regGuia = input.nextLine();
                
                if (regGuia.equalsIgnoreCase("si")) {
                    System.out.println("\n--- Registro Guia Turistico ---");
                    System.out.println("Ingrese nombre del Guia Turistico:");
                    registroGuias.setNombre(input.nextLine());
                    System.out.println("Ingrese apellido del Guia Turistico:");
                    registroGuias.setApellido(input.nextLine());
                    opcionValida = true;
                    
                    System.out.println("-- Direccion del Guia Turistico: --");
                    System.out.println("Ingrese calle del Guia Turistico:");
                    registroGuias.getDireccion().setCalle(input.nextLine());
            
                    System.out.println("Ingrese numero de la calle del Guia Turistico:");
                    registroGuias.getDireccion().setNumero(input.nextInt());
                            
                    input.nextLine();
                                                     
                do {
                    System.out.println("¿Su dirección contiene número condominio o departamento? (si/no):");
                    String esCondominio = input.nextLine();
                
                    if (esCondominio.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese numero de casa/depto del Guia Turistico:");
                        registroGuias.getDireccion().setCasa(input.nextInt());
                        input.nextLine();
                        System.out.println("Ingrese comuna del Guia Turistico:");
                        registroGuias.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del Guia Turistico:");
                        registroGuias.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true; 
                    
                    } else if (esCondominio.equalsIgnoreCase("no")) {
                        System.out.println("Ingrese comuna del Guia Turistico:");
                        registroGuias.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del Guia Turistico:");
                        registroGuias.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true;
                    
                    } else {
                        System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");      
                    }
                    
                        } while (!opcionValida);
                    
                } else if (regGuia.equalsIgnoreCase("no")) {
                    opcionValida = true;
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");
                }
                    } while (!opcionValida);

            // Registro de Operador Local
            opcionValida = false;
            do {
                System.out.println("¿Desea registrar a un Operador Local? (si/no):");
                String regOperador = input.nextLine();
                
                if (regOperador.equalsIgnoreCase("si")) {
                    System.out.println("\n--- Registro Operador Local ---");
                    System.out.println("Ingrese nombre del Operador Local:");
                    registroOperadores.setNombre(input.nextLine());
                    System.out.println("Ingrese apellido del Operador Local:");
                    registroOperadores.setApellido(input.nextLine());
                    opcionValida = true;
                    
                    System.out.println("-- Direccion del Operador Local: --");
                    System.out.println("Ingrese calle del Operador Local:");
                    registroOperadores.getDireccion().setCalle(input.nextLine());
            
                    System.out.println("Ingrese numero de la calle del Operador Local:");
                    registroOperadores.getDireccion().setNumero(input.nextInt());
                            
                    input.nextLine();
 
                do {
                    System.out.println("¿Su dirección contiene número condominio o departamento? (si/no):");
                    String esCondominio = input.nextLine();
                
                    if (esCondominio.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese numero de casa/depto del Operador Local:");
                        registroOperadores.getDireccion().setCasa(input.nextInt());
                        input.nextLine();
                        System.out.println("Ingrese comuna del Operador Local:");
                        registroOperadores.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del Operador Local:");
                        registroOperadores.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true; 
                    
                    } else if (esCondominio.equalsIgnoreCase("no")) {
                        System.out.println("Ingrese comuna del Operador Local:");
                        registroOperadores.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del Operador Local:");
                        registroOperadores.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true;
                    
                    } else {
                        System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");      
                    }
                        } while (!opcionValida);
                    
                } else if (regOperador.equalsIgnoreCase("no")) {
                    opcionValida = true;
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");
                }
                    } while (!opcionValida);

            // Registro de un Proveedor
            opcionValida = false;
            do {
                System.out.println("¿Desea registrar a un Proveedor? (si/no):");
                String regProveedor = input.nextLine();
                
                if (regProveedor.equalsIgnoreCase("si")) {
                    System.out.println("\n--- Registro Proveedor de Alojamiento y Transporte ---");
                    System.out.println("Ingrese nombre del proveedor:");
                    registroProveedores.setNombre(input.nextLine());
                    opcionValida = true;
                    
                    System.out.println("-- Direccion del Proveedor de Alojamiento y Transporte: --");
                    System.out.println("Ingrese calle del cliente:");
                    registroProveedores.getDireccion().setCalle(input.nextLine());
            
                    System.out.println("Ingrese numero de la calle del Proveedor de Alojamiento y Transporte:");   
                    registroProveedores.getDireccion().setNumero(input.nextInt());
                            
                    input.nextLine();
                         
                do {
                    System.out.println("¿Su dirección contiene número condominio o departamento? (si/no):");
                    String esCondominio = input.nextLine();
                
                    if (esCondominio.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese numero de casa/depto del Proveedor de Alojamiento y Transporte:");
                        registroProveedores.getDireccion().setCasa(input.nextInt());
                        input.nextLine();
                        System.out.println("Ingrese comuna del Proveedor de Alojamiento y Transporte:");
                        registroProveedores.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del Proveedor de Alojamiento y Transporte:");
                        registroProveedores.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true; 
                    
                    } else if (esCondominio.equalsIgnoreCase("no")) {
                        System.out.println("Ingrese comuna del Proveedor de Alojamiento y Transporte:");
                        registroProveedores.getDireccion().setComuna(input.nextLine());
                        System.out.println("Ingrese ciudad del Proveedor de Alojamiento y Transporte:");
                        registroProveedores.getDireccion().setCiudad(input.nextLine());
                        opcionValida = true;
                    
                    } else {
                        System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");      
                    }
                    
                        } while (!opcionValida);
                
                } else if (regProveedor.equalsIgnoreCase("no")) {
                    opcionValida = true;
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");
                }
                    } while (!opcionValida);
                    
            // Resultados Finales
            System.out.println("\n--- Resumen de Registros ---");
            if (!registroTour.getNombre().isEmpty() && !registroTour.getTipo().isEmpty()) registroTour.toString();
            if (!registroCliente.getNombre().isEmpty()) System.out.println(registroCliente.toString());
            if (!registroEmpleados.getNombre().isEmpty()) System.out.println(registroEmpleados.toString());
            if (!registroGuias.getNombre().isEmpty()) System.out.println(registroGuias.toString());
            if (!registroOperadores.getNombre().isEmpty()) System.out.println(registroOperadores.toString());
            if (!registroProveedores.getNombre().isEmpty()) System.out.println(registroProveedores.toString());
            if (!registroRutaGastronomica.getNombre().isEmpty()) System.out.println(registroRutaGastronomica.toString());
            if (!registroPaseoLacustre.getNombre().isEmpty()) System.out.println(registroPaseoLacustre.toString());
            if (!registroExcursionCultural.getNombre().isEmpty()) System.out.println(registroExcursionCultural.toString());
            
                  
            GestorDatos.datosTour(
                registroTour.toString(),
                registroCliente.toString(),
                registroEmpleados.toString(),
                registroGuias.toString(), 
                registroOperadores.toString(), 
                registroProveedores.toString()
            );
              
            // Ver registro completo
            opcionValida = false; 
            do {
                System.out.println("\n¿Desea ver el registro completo guardado en el archivo? (si/no):");
                String verResultadoFinal = input.nextLine();
                
                if (verResultadoFinal.equalsIgnoreCase("si")) {
                    System.out.println("\n--- Registro Completo Llanquihue Tour ---");

                    try {
                        File archivo = new File(GestorDatos.archivoDatos);
                        Scanner lectorArchivo = new Scanner(archivo);

                        while (lectorArchivo.hasNextLine()) {
                            String linea = lectorArchivo.nextLine();
                            String[] partes = linea.split(";");
                            System.out.println(partes[0]);
                        }
                        lectorArchivo.close();
                        
                    } catch (FileNotFoundException e) {
                        System.out.println("Error: No se encontró el archivo de registros. Asegúrese de que se haya guardado correctamente.");
                    }
                    
                    opcionValida = true;
                } else if (verResultadoFinal.equalsIgnoreCase("no")) {
                    opcionValida = true;
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");
                } 
                    } while (!opcionValida);
            
            // Filtrar por nombre
            opcionValida = false;
            do {
                System.out.println("\n¿Desea buscar un nombre especifico en el registro? (si/no):");
                String opcionBusqueda = input.nextLine();
                
                if (opcionBusqueda.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nombre que desea buscar:");
                    String nombreBuscado = input.nextLine().toLowerCase();
                    
                    System.out.println("\n--- Resultados de Busqueda ---");
                    
                    try {
                        File archivo = new File(GestorDatos.archivoDatos);
                        Scanner lectorArchivo = new Scanner(archivo);
                        boolean encontroResultados = false;
                        
                        while (lectorArchivo.hasNextLine()) {
                            String linea = lectorArchivo.nextLine();

                            if (linea.toLowerCase().contains(nombreBuscado)) {
                                System.out.println("Registro encontrado: " + linea);
                                encontroResultados = true;
                            }
                        }
                        lectorArchivo.close();
                        
                        if (!encontroResultados) {
                            System.out.println("No se encontraron registros que coincidan con el nombre: " + nombreBuscado);
                        }
                        
                    } catch (FileNotFoundException e) {
                        System.out.println("Error: No se encontró el archivo de registros. Asegúrese de que se haya guardado correctamente.");
                    } 
                    
                    opcionValida = true;
            
                } else if (opcionBusqueda.equalsIgnoreCase("no")) {
                    opcionValida = true;
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese 'si' o 'no'.\n");
                }
            } while (!opcionValida);
        }            
    }
}