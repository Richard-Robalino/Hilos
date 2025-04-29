package hilos.clase;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

public class Auto {
    @Getter @Setter private String marca;
    @Getter @Setter private String modelo;
    @Getter @Setter private String precio;

    public void ingresarDatosEnUnaVentana() {
        JTextField campoMarca = new JTextField();
        JTextField campoModelo = new JTextField();
        JTextField campoPrecio = new JTextField();

        Object[] mensaje = {
                "Marca:", campoMarca,
                "Modelo:", campoModelo,
                "Precio:", campoPrecio
        };

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Ingrese los datos del auto", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            setMarca(campoMarca.getText());
            setModelo(campoModelo.getText());
            setPrecio(campoPrecio.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Ingreso cancelado.");
        }
    }

    public void mostrarDatosEnVentana() {
        String mensaje = "Auto ingresado:" +
                "\nMarca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nPrecio: " + getPrecio();
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
