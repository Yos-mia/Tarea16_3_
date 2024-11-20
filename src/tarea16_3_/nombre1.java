package tarea16_3_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nombre1 {

    public nombre1() {
        // Ventana principal
        JFrame framePrincipal = new JFrame("Ventana Principal");
        framePrincipal.setSize(300, 200);
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setLayout(null);

        JLabel lblIngreseNombre = new JLabel("Ingrese su nombre:");
        lblIngreseNombre.setBounds(20, 20, 200, 25);
        framePrincipal.add(lblIngreseNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(20, 60, 200, 25);
        framePrincipal.add(txtNombre);

        JButton btnMostrar = new JButton("Mostrar en otra ventana");
        btnMostrar.setBounds(20, 100, 200, 30);
        framePrincipal.add(btnMostrar);

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                
                // Segunda ventana
                JFrame frameSecundaria = new JFrame("Ventana Secundaria");
                frameSecundaria.setSize(300, 150);
                frameSecundaria.setLayout(new FlowLayout());
                frameSecundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JLabel lblNombre = new JLabel("El nombre ingresado es: " + nombre);
                frameSecundaria.add(lblNombre);

                frameSecundaria.setVisible(true);
            }
        });

        framePrincipal.setVisible(true);
    }

    public static void main(String[] args) {
        new nombre1();
    }
}
