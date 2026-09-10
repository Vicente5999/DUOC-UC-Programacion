/*
 * Representa la clase Main donde se ecnuentra la clase principal a ejecutar
 * Contiene el codigo necesario para registrar pedidos de comida, express y encomenda\
 */

package ui;

/**
 *
 * @author Vicente5999 (GitHub)
 */

import java.util.Scanner;

import data.GestionDatos;
import model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Direccion direccionClientes = new Direccion("", 0, "", "", 0);
        Direccion direccionPedidoComida = new Direccion("", 0, "", "", 0);
        Direccion direccionPedidoExpress = new Direccion("", 0, "", "", 0);
        Direccion direccionPedidoEncomienda = new Direccion("", 0, "", "", 0);
        Cliente registroCliente = new Cliente("", "", "", 0, direccionClientes);
        Repartidor registroRepartidor = new Repartidor("", "", 0, "", "", "");
        PedidoComida registroPedidoComida = new PedidoComida("", "", 0, "", "", "", direccionPedidoComida);
        PedidoExpress registroPedidoExpress = new PedidoExpress("", "", 0, "", "", "", direccionPedidoExpress);
        PedidoEncomienda registroPedidoEncomienda = new PedidoEncomienda("", "", 0, "", "", "", "", direccionPedidoEncomienda);

        try (Scanner input = new Scanner(System.in)) {

            // Registro de Cliente
            System.out.println("\n--- Registro Cliente ---");
            System.out.println("Ingrese nombre del cliente:");
            registroCliente.setNombre(input.nextLine());
            System.out.println("Ingrese apellido del cliente:");
            registroCliente.setApellido(input.nextLine());

            // Registro de Repartidor
            System.out.println("\n--- Registro Repartidor ---");
            System.out.println("Ingrese nombre del repartidor:");
            registroRepartidor.setNombre(input.nextLine());
            System.out.println("Ingrese apellido del repartidor:");
            registroRepartidor.setApellido(input.nextLine());

            // Tipo de Pedido
            System.out.println("\n¿Cual es su tipo de Pedido? (comida/encomienda/express):");
            String pedidoTipo = input.nextLine();

            // Pedido de Comida
            if (pedidoTipo.equalsIgnoreCase("comida")) {
                registroPedidoComida.setTipoPedido("delivery de comida");
                System.out.println("Ingrese tipo de Alimento (Ej: Comida Rapida, Comida Japonesa, Comida Italiana");
                registroPedidoComida.setTipoAlimento(input.nextLine());
                System.out.println("Ingrese nombre del Restaurante:");
                registroPedidoComida.setNombreRestaurante(input.nextLine());
                System.out.println("Ingrese nombre del Alimento:");
                registroPedidoComida.setNombreAlimento(input.nextLine());

                // Registro de Dirección
                System.out.println("-- Direccion del cliente: --");
                System.out.println("Ingrese calle del cliente:");
                registroPedidoComida.getDireccion().setCalle(input.nextLine());

                System.out.println("Ingrese numero de la calle del cliente:");
                registroPedidoComida.getDireccion().setNumero(input.nextInt());

                input.nextLine();

                System.out.println("Ingrese numero de casa/depto del cliente (pon '0' si no tiene):");
                registroPedidoComida.getDireccion().setCasa(input.nextInt());
                input.nextLine();
                System.out.println("Ingrese comuna del cliente:");
                registroPedidoComida.getDireccion().setComuna(input.nextLine());
                System.out.println("Ingrese ciudad del cliente:");
                registroPedidoComida.getDireccion().setCiudad(input.nextLine());

                registroPedidoComida.setDistanciaKm(7.2);

                System.out.println(registroPedidoComida.asignarRepartidor());
                System.out.println(registroPedidoComida.calcularTiempoEntrega());
                System.out.println(registroRepartidor.asignarRepartidor());
                System.out.println(registroPedidoComida.mostrarResumen());

                registroPedidoComida.setIDPedido("ID: CM8834A");

                // Pedido de Encomienda
            } else if (pedidoTipo.equalsIgnoreCase("encomienda")) {
                registroPedidoEncomienda.setTipoPedido("envio de encomienda");
                System.out.println("Ingrese nombre del remitente:");
                registroPedidoEncomienda.setNombreRemitente(input.nextLine());
                System.out.println("Ingrese nombre del destinatario:");
                registroPedidoEncomienda.setNombreDestinatario(input.nextLine());

                System.out.println("-- Direccion del destinatario: --");
                System.out.println("Ingrese calle del destinatario:");
                registroPedidoEncomienda.getDireccion().setCalle(input.nextLine());

                System.out.println("Ingrese numero de la calle del destinatario:");
                registroPedidoEncomienda.getDireccion().setNumero(input.nextInt());

                input.nextLine();

                System.out.println("Ingrese numero de casa/depto del destinatario (pon '0' si no tiene):");
                registroPedidoEncomienda.getDireccion().setCasa(input.nextInt());
                input.nextLine();
                System.out.println("Ingrese comuna del destinatario:");
                registroPedidoEncomienda.getDireccion().setComuna(input.nextLine());
                System.out.println("Ingrese ciudad del destinatario:");
                registroPedidoEncomienda.getDireccion().setCiudad(input.nextLine());

                registroPedidoEncomienda.setDistanciaKm(7.2);

                System.out.println("Ingrese tamaño de la encomienda (Ej: alturaCM x AnchoCM x profundidadCM):");
                registroPedidoEncomienda.setTamanoEncomienda(input.nextLine());
                System.out.println("Ingrese peso de la encomienda en kilogramos:");
                registroPedidoEncomienda.setPesoEncomienda(input.nextLine());
                System.out.println(registroPedidoEncomienda.mostrarResumen());

                System.out.println(registroPedidoEncomienda.asignarRepartidor());
                System.out.println(registroPedidoEncomienda.calcularTiempoEntrega());
                System.out.println(registroRepartidor.asignarRepartidor());
                System.out.println(registroPedidoEncomienda.mostrarResumen());

                registroPedidoEncomienda.setIDPedido("#EN7982A");

                // Pedido Express
            } else if (pedidoTipo.equalsIgnoreCase("express")) {
                System.out.println("\n¿Cual es su tipo de Pedido? (supermercado/farmacia):");
                String pedidoTipo2 = input.nextLine();

                // Pedido Supermercado
                if (pedidoTipo2.equalsIgnoreCase("supermercado")) {
                    registroPedidoExpress.setPedidoSupermercado("si");
                    registroPedidoExpress.setPedidoFarmacia("no");
                    registroPedidoExpress.setPedidoSupermercado("supermercado");
                    System.out.println("Ingrese nombre(s) del o los alimentos a adquirir:");
                    registroPedidoExpress.setNombrePedido(input.nextLine());

                    // Registro de Dirección
                    System.out.println("\n -- Direccion del cliente: --");
                    System.out.println("Ingrese calle del cliente:");
                    registroPedidoExpress.getDireccion().setCalle(input.nextLine());

                    System.out.println("Ingrese numero de la calle del cliente:");
                    registroPedidoExpress.getDireccion().setNumero(input.nextInt());

                    input.nextLine();

                    System.out.println("Ingrese numero de casa/depto del cliente (pon '0' si no tiene):");
                    registroPedidoExpress.getDireccion().setCasa(input.nextInt());
                    input.nextLine();
                    System.out.println("Ingrese comuna del cliente:");
                    registroPedidoExpress.getDireccion().setComuna(input.nextLine());
                    System.out.println("Ingrese ciudad del cliente:");
                    registroPedidoExpress.getDireccion().setCiudad(input.nextLine());

                    registroPedidoExpress.setDistanciaKm(7.2);

                    System.out.println(registroPedidoExpress.asignarRepartidor());
                    System.out.println(registroPedidoExpress.calcularTiempoEntrega());
                    System.out.println(registroRepartidor.asignarRepartidor());
                    System.out.println(registroPedidoExpress.mostrarResumen());

                    registroPedidoExpress.setIDPedido("#EX2476S");

                }

                // Pedido Farmacia
                else if (pedidoTipo2.equalsIgnoreCase("farmacia")) {
                    registroPedidoExpress.setPedidoFarmacia("farmacia");

                    registroPedidoExpress.setPedidoFarmacia("si");
                    registroPedidoExpress.setPedidoSupermercado("no");

                    System.out.println("Ingrese nombre(s) del o los medicamentos a adquirir:");
                    registroPedidoExpress.setNombrePedido(input.nextLine());

                    // Registro de Dirección
                    System.out.println("\n -- Direccion del cliente: --");
                    System.out.println("Ingrese calle del cliente:");
                    registroPedidoExpress.getDireccion().setCalle(input.nextLine());

                    System.out.println("Ingrese numero de la calle del cliente:");
                    registroPedidoExpress.getDireccion().setNumero(input.nextInt());

                    input.nextLine();

                    System.out.println("Ingrese numero de casa/depto del cliente (pon '0' si no tiene):");
                    registroPedidoExpress.getDireccion().setCasa(input.nextInt());
                    input.nextLine();
                    System.out.println("Ingrese comuna del cliente:");
                    registroPedidoExpress.getDireccion().setComuna(input.nextLine());
                    System.out.println("Ingrese ciudad del cliente:");
                    registroPedidoExpress.getDireccion().setCiudad(input.nextLine());

                    registroPedidoExpress.setDistanciaKm(7.2);

                    System.out.println(registroPedidoExpress.asignarRepartidor());
                    System.out.println(registroPedidoExpress.calcularTiempoEntrega());
                    System.out.println(registroRepartidor.asignarRepartidor());
                    System.out.println(registroPedidoExpress.mostrarResumen());

                    registroPedidoExpress.setIDPedido("#EX5466F");

                    System.out.println("¿Desea asignar manualmente un repartidor? (si/no)");
                    String repartidorManual = input.nextLine();

                    if (repartidorManual.equalsIgnoreCase("si")) {
                        System.out.println("\n--- Registro Repartidor ---");
                        System.out.println("Ingrese nombre del repartidor:");
                        registroRepartidor.setNombre(input.nextLine());
                        System.out.println("Ingrese apellido del repartidor:");
                        registroRepartidor.setApellido(input.nextLine());
                    } else if (repartidorManual.equalsIgnoreCase("no")) {
                        System.out.println(registroPedidoExpress.asignarRepartidor());
                        System.out.println(registroPedidoExpress.calcularTiempoEntrega());
                        System.out.println(registroRepartidor.asignarRepartidor());
                    }
                } else {
                    System.out.println("Opcion no valida. Por favor, ingrese una opción valida.\n");
                }

            } else {
                System.out.println("Opcion no valida. Por favor, ingrese una opción valida.\n");
            }

            System.out.println("¿Desea ver el estado del despacho, cancelar el pedido o ver el historial de pedidos? (despacho/cancelar/historial)\n");
            String despachoHistorialCancelar = input.nextLine();

            if (despachoHistorialCancelar.equalsIgnoreCase("despacho")) {
                if (pedidoTipo.equalsIgnoreCase("comida")) {
                    System.out.println(registroPedidoComida.despachar());
                } else if (pedidoTipo.equalsIgnoreCase("encomienda")) {
                    System.out.println(registroPedidoEncomienda.despachar());
                } else if (pedidoTipo.equalsIgnoreCase("express")) {
                    System.out.println(registroPedidoExpress.despachar());
                } else {
                    System.out.println("debe realizar un pedido para iniciar la interfaz");
                }
            }
            else if (despachoHistorialCancelar.equalsIgnoreCase("cancelar")) {
                if (pedidoTipo.equalsIgnoreCase("comida")) {
                    System.out.println(registroPedidoComida.cancelar());
                } else if (pedidoTipo.equalsIgnoreCase("encomienda")) {
                    System.out.println(registroPedidoEncomienda.cancelar());
                } else if (pedidoTipo.equalsIgnoreCase("express")) {
                    System.out.println(registroPedidoExpress.cancelar());
                } else {
                    System.out.println("debe realizar un pedido para iniciar la interfaz");
                }
            } else if (despachoHistorialCancelar.equalsIgnoreCase("historial")) {
                if (pedidoTipo.equalsIgnoreCase("comida")) {
                    System.out.println(registroPedidoComida.verHistorial());
                    try {
                        File archivo = new File(GestionDatos.archivoDatos);
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
                } else if (pedidoTipo.equalsIgnoreCase("encomienda")) {
                    System.out.println(registroPedidoEncomienda.verHistorial());
                    try {
                        File archivo = new File(GestionDatos.archivoDatos);
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
                } else if (pedidoTipo.equalsIgnoreCase("express")) {
                    System.out.println(registroPedidoExpress.verHistorial());
                    try {
                        File archivo = new File(GestionDatos.archivoDatos);
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
                } else {
                    System.out.println("debe realizar un pedido para iniciar la interfaz");
                }
            }
        }

        // Guardado de Pedidos
        GestionDatos.datosPedidos(
                registroCliente.toString(),
                registroRepartidor.toString(),
                registroPedidoComida.toString(),
                registroPedidoEncomienda.toString(),
                registroPedidoExpress.toString()
        );

        }
    }