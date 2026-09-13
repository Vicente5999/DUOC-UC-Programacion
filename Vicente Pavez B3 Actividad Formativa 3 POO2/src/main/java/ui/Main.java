package ui;

import model.*;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        
        Pedido p1 = new PedidoComida(101, "Av. Siempre Viva 123", 2.5);
        Pedido p2 = new PedidoExpress(102, "Calle Falsa 456", 5.0);
        Pedido p3 = new PedidoEncomienda(103, "Av. Libertad 789", 12.0);
        Pedido p4 = new PedidoComida(104, "Pasaje Las Rosas 321", 1.5);
        Pedido p5 = new PedidoExpress(105, "Av. Central 654", 3.2);
        Pedido p6 = new PedidoEncomienda(106, "Calle Sur 987", 8.0);

        Repartidor repartidor1 = new Repartidor("Camila", Arrays.asList(p1, p4));
        Repartidor repartidor2 = new Repartidor("Luis", Arrays.asList(p2, p5));
        Repartidor repartidor3 = new Repartidor("Javier", Arrays.asList(p3, p6));

        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("--- Iniciando simulación de entregas SpeedFast ---");

        executor.execute(repartidor1);
        executor.execute(repartidor2);
        executor.execute(repartidor3);

        executor.shutdown(); 

        try {
            if (!executor.awaitTermination(15, TimeUnit.SECONDS)) {
                executor.shutdownNow(); 
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("--- Todos los repartidores han terminado sus entregas ---");
    }
}
