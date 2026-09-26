/*
 * Representa a un repartidor dentro del programa
 * Contiene atributos como zonaDeCarga (desde ZonaDeCarga.java) y nombre
 * También contiene un constructor, getters, setters y un toString
 * También implementa un runnable para la entrega de pedidos
 */

package model;

import data.EstadoPedido;
import data.ZonaDeCarga;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class Repartidor implements Runnable {
    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void run() {
        while (true) {
            Pedido pedido = zonaDeCarga.retirarPedido();

            if (pedido == null) {
                break;
            }

            System.out.println("[Repartidor - " + nombre + "] Retirando pedido #" + pedido.getIDPedido() + "...");
            pedido.setEstado(EstadoPedido.EN_REPARTO);
            System.out.println("[Repartidor - " + nombre + "] Estado: " + pedido.getEstado());

            try {
                System.out.println("[Repartidor - " + nombre + "] Entregando pedido #" + pedido.getIDPedido() + "...");
                Thread.sleep((long) (Math.random() * 1500 + 1000));
            } catch (InterruptedException e) {
                System.out.println("El repartidor " + nombre + " fue interrumpido.");
                Thread.currentThread().interrupt();
            }

            pedido.setEstado(EstadoPedido.ENTREGADO);
            System.out.println("[Repartidor - " + nombre + "] Estado: " + pedido.getEstado());
        }
    }
}