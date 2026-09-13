package model;

import java.util.List;
import java.util.Random;

public class Repartidor implements Runnable {
    
    private String nombre;
    private List<Pedido> pedidosAsignados;

    public Repartidor(String nombre, List<Pedido> pedidosAsignados) {
        this.nombre = nombre;
        this.pedidosAsignados = pedidosAsignados;
    }

    @Override
    public void run() {
        Random random = new Random();
        
        for (Pedido pedido : pedidosAsignados) {
            System.out.println("[Repartidor: " + nombre + "] Entregando " 
                    + pedido.getClass().getSimpleName() + " #" + pedido.getIdPedido() + "...");
            
            try {
                int tiempoSimulado = 1000 + random.nextInt(3000);
                Thread.sleep(tiempoSimulado);
            } catch (InterruptedException e) {
                System.out.println("[Repartidor: " + nombre + "] Error en la entrega.");
                Thread.currentThread().interrupt();
            }
            
            System.out.println("[Repartidor: " + nombre + "] Pedido #" + pedido.getIdPedido() + " entregado.");
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Pedido> getPedidosAsignados() { return pedidosAsignados; }
    public void setPedidosAsignados(List<Pedido> pedidosAsignados) { this.pedidosAsignados = pedidosAsignados; }
}
