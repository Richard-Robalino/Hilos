package hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable {
    private String letra;

    public ProcesoE(String letras) {
        letra = letras;
    }

    public void amable(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public void run() {
        amable(letra);
    }
}
