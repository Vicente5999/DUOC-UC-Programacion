/*
 * Representa a la ventana principal del programa
 * Contiene el codigo necesario para la interfaz grafica del programa
 * Contiene funciones como JFrame y JButton
 */


package ui;

import data.GestorPedidos;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class VentanaPrincipal extends JFrame {
    private GestorPedidos gestor;

    public VentanaPrincipal() {
        gestor = new GestorPedidos();

        setTitle("SpeedFast - Gestión de Entregas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnRegistrar = new JButton("Registrar pedido");
        JButton btnListar = new JButton("Listar pedidos");
        JButton btnAsignar = new JButton("Asignar repartidor / Iniciar entrega");

        btnRegistrar.addActionListener(e -> {
            new VentanaRegistroPedido(gestor).setVisible(true);
        });

        btnListar.addActionListener(e -> {
            new VentanaListaPedidos(gestor).setVisible(true);
        });

        btnAsignar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Función aún no disponible.");
        });

        add(btnRegistrar);
        add(btnListar);
        add(btnAsignar);
    }
}