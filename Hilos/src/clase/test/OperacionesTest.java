package clase.test;

import clase.impl.OperacionesImpl;
import clase.interfaz.Operaciones;

import javax.swing.*;
import java.util.Scanner;

public class OperacionesTest {


    public static void main(String[] args) {
        System.out.println("Hola mundo");
        double x=0.0;
        double y=0.0;
        double resultado=0.0;
        Operaciones op = new OperacionesImpl();
        Scanner entrada = new Scanner(System.in);
        // System.out.println("Ingresa primer numero:");
        //x= entrada.nextDouble();
        x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese primer numero "));
        //System.out.println("Ingresa segundo numero:");
        //y= entrada.nextDouble();
        y=Double.parseDouble(JOptionPane.showInputDialog("Ingrese segundo numero "));


        //System.out.println("la suma es " +op.sumar(x,y));
        JOptionPane.showMessageDialog(null, "la respuesta es : "+ op.sumar(x,y));
    }
}
