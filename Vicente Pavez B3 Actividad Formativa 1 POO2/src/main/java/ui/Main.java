package ui;

/**
 *
 * @author Vicente5999 (GitHub)
 */

import java.util.Scanner;

import model.*;

public class Main {

    public static void main(String[] args) {

        Direccion direccionClientes = new Direccion("", 0, "", "", 0);
        Direccion direccionPedidoComida = new Direccion("", 0, "", "", 0);
        Direccion direccionPedidoExpress = new Direccion("", 0, "", "", 0);
        Direccion direccionPedidoEncomienda = new Direccion("", 0, "", "", 0);
        Cliente registroCliente = new Cliente("", "", "", 0, direccionClientes);
        Repartidor registroRepartidor = new Repartidor("", "", 0, "", "", "");
        PedidoComida registroPedidoComida = new PedidoComida("", "", "", "", "", direccionPedidoComida);
        PedidoExpress registroPedidoExpress = new PedidoExpress("", "", "", false, false, direccionPedidoExpress);
        PedidoEncomienda registroPedidoEncomienda = new PedidoEncomienda("", "", "", "", "", "", direccionPedidoEncomienda);

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

                System.out.println("\n[Pedido Comida]\n" + "Asignando repartidor...\n" + "→ Verificando mochila térmica... OK\n");
                System.out.println(registroRepartidor.asignarRepartidor());

            // Pedido de Encomienda
            } else if (pedidoTipo.equalsIgnoreCase("encomienda")) {
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

                System.out.println("[Pedido Encomienda] Asignando repartidor... \n→ Validando peso y embalaje... OK \n");
                System.out.println(registroRepartidor.asignarRepartidor());

            // Pedido Express
            } else if (pedidoTipo.equalsIgnoreCase("express")) {
                System.out.println("\n¿Cual es su tipo de Pedido? (supermercado/farmacia):");
                String pedidoTipo2 = input.nextLine();

                // Pedido Supermercado
                if (pedidoTipo2.equalsIgnoreCase("supermercado")) {
                    registroPedidoExpress.setPedidoSupermercado(true);
                }

                // Pedido Farmacia
                else if (pedidoTipo2.equalsIgnoreCase("farmacia")) {
                    registroPedidoExpress.setPedidoFarmacia(true);
                }
                else {
                    System.out.println("Opcion no valida. Por favor, ingrese una opción valida.\n");
                }

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

                System.out.println("\n[Pedido Express]\n" + "Asignando repartidor...\n" + "→ Repartidor más cercano con disponibilidad inmediata encontrado.\n");
                System.out.println(registroRepartidor.asignarRepartidor());

            } else {
                System.out.println("Opcion no valida. Por favor, ingrese una opción valida.\n");
            }

        }
    }
}
