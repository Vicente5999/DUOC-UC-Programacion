/*
 * Representa la clase Main del programa
 * Contiene el código principal para el funcionamiento del programa
 */

package ui;

import data.EstadoPedido;
import data.ZonaDeCarga;
import model.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Main {
        public static void main(String[] args) {

            java.awt.EventQueue.invokeLater(() -> {
                new VentanaPrincipal().setVisible(true);
            });

            ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

            zonaDeCarga.agregarPedido(new Pedido("1", "Huechuraba", EstadoPedido.PENDIENTE));
            zonaDeCarga.agregarPedido(new Pedido("2", "Providencia", EstadoPedido.PENDIENTE));
            zonaDeCarga.agregarPedido(new Pedido("3", "La Florida", EstadoPedido.PENDIENTE));
            zonaDeCarga.agregarPedido(new Pedido("4", "La Reina", EstadoPedido.PENDIENTE));
            zonaDeCarga.agregarPedido(new Pedido("5", "Puente Alto", EstadoPedido.PENDIENTE));

            ExecutorService executor = Executors.newFixedThreadPool(3);

            executor.execute(new Repartidor("Consu", zonaDeCarga));
            executor.execute(new Repartidor("Cata", zonaDeCarga));
            executor.execute(new Repartidor("Seba", zonaDeCarga));

            executor.shutdown();

            try {
                executor.awaitTermination(15, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                System.out.println("El proceso fue interrumpido.");
                Thread.currentThread().interrupt();
            }

            System.out.println("[Zona de carga vacía]");
            System.out.println("Todos los pedidos han sido entregados correctamente.");
        }
    }