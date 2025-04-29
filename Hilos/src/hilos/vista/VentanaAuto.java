package hilos.vista;

import hilos.clase.Auto;

import javax.swing.*;

public class VentanaAuto {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Auto auto = new Auto();
            auto.ingresarDatosEnUnaVentana();
            auto.mostrarDatosEnVentana();
        });
    }
}

