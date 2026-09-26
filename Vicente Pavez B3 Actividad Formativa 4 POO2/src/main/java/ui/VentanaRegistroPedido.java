/*
 * Representa a la Ventana del Registro de los Pedidos del programa
 * Contiene el codigo necesario para la interfaz grafica del programa
 * Contiene funciones como guardarPedido, JFrame y JButton
 */

package ui;

import data.GestorPedidos;
import model.Pedido;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Vicente5999 (GitHub)
 */

public class VentanaRegistroPedido extends JFrame {
    private JTextField txtId;
    private JTextField txtDireccion;
    private JComboBox<String> cmbTipo;
    private GestorPedidos gestor;

    public VentanaRegistroPedido(GestorPedidos gestor) {
        this.gestor = gestor;
        setTitle("Registrar Nuevo Pedido");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2, 5, 5));
        setLocationRelativeTo(null);

        add(new JLabel("ID Pedido:"));
        txtId = new JTextField();
        add(txtId);

        add(new JLabel("Dirección:"));
        txtDireccion = new JTextField();
        add(txtDireccion);

        add(new JLabel("Tipo:"));
        cmbTipo = new JComboBox<>(new String[]{"comida", "encomienda", "express"});
        add(cmbTipo);

        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        btnGuardar.addActionListener(e -> guardarPedido());
        btnCancelar.addActionListener(e -> dispose());

        add(btnGuardar);
        add(btnCancelar);
    }

    private void guardarPedido() {
        String id = txtId.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String tipo = (String) cmbTipo.getSelectedItem();

        if (id.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pedido nuevoPedido = new Pedido(id, direccion, tipo);
        gestor.agregarPedido(nuevoPedido);

        JOptionPane.showMessageDialog(this, "Pedido registrado exitosamente.");
        dispose();
    }
}