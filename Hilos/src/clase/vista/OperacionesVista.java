
package clase.vista;

import clase.impl.OperacionesImpl;
import clase.interfaz.Operaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperacionesVista {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Operaciones Matemáticas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        Operaciones op = new OperacionesImpl();

        JLabel label1 = new JLabel("Ingrese primer número:");
        JLabel label2 = new JLabel("Ingrese segundo número:");
        JLabel resultLabel = new JLabel("Resultado:");


        JTextField num1Field = new JTextField(20);
        JTextField num2Field = new JTextField(20);


        JButton sumButton = new JButton("Sumar");
        JButton resButton = new JButton("Resta");
        JButton mulButton = new JButton("Multiplicacion");
        JButton divButton = new JButton("Division");


        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);  // No editable, solo muestra el resultado


        resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double x = Double.parseDouble(num1Field.getText());
                    double y = Double.parseDouble(num2Field.getText());


                    double result = op.resta(x, y);

                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingrese números válidos.");
                }
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double x = Double.parseDouble(num1Field.getText());
                    double y = Double.parseDouble(num2Field.getText());


                    double result = op.multiplicacion(x, y);

                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingrese números válidos.");
                }
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double x = Double.parseDouble(num1Field.getText());
                    double y = Double.parseDouble(num2Field.getText());


                    double result = op.divicion(x, y);

                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingrese números válidos.");
                }
            }
        });

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double x = Double.parseDouble(num1Field.getText());
                    double y = Double.parseDouble(num2Field.getText());


                    double result = op.sumar(x, y);

                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingrese números válidos.");
                }
            }
        });


        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(sumButton);
        frame.add(resButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(resultLabel);
        frame.add(resultField);


        frame.setVisible(true);
    }
}
