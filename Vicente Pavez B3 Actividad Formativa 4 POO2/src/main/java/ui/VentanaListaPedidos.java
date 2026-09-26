/*
 * Representa a la ventana de lista de pedidos para el programa
 * Contiene el codigo necesario para la interfaz grafica del programa
 * Contiene funciones como cargarDatos, JFrame y JButton
 */

package ui;

import data.GestorPedidos;
import model.Pedido;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class VentanaListaPedidos extends JFrame {
    private JTable tabla;
    private DefaultTableModel modelo;
    private GestorPedidos gestor;

    public VentanaListaPedidos(GestorPedidos gestor) {
        this.gestor = gestor;
        setTitle("Listado de Pedidos");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        String[] columnas = {"ID", "Dirección", "Tipo"};
        modelo = new DefaultTableModel(columnas, 0);
        tabla = new JTable(modelo);

        cargarDatos();

        add(new JScrollPane(tabla), BorderLayout.CENTER);

        JButton btnActualizar = new JButton("Refrescar");
        btnActualizar.addActionListener(e -> cargarDatos());
        add(btnActualizar, BorderLayout.SOUTH);
    }

    private void cargarDatos() {
        modelo.setRowCount(0);
        for (Pedido p : gestor.getPedidos()) {
            Object[] fila = {p.getIDPedido(), p.getDireccionEntrega(), p.getEstado()};
            modelo.addRow(fila);
        }
    }
}