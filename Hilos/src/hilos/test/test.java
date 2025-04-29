package hilos.test;
import hilos.clase.*;

import javax.swing.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Auto auto = new Auto();
        auto.ingresarDatosEnUnaVentana();
        auto.mostrarDatosEnVentana();

      Persona p=new Persona();
        p.setNombre("Richard Robalino");
        p.setDireccion("Comite del pueblo");
        p.setFechadenacimiento("3 de Octubre de 1999");

        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Fecha de nacimiento: "+p.getFechadenacimiento());
        System.out.println("Dirrecion: "+p.getDireccion());

      ProcesoA a =new ProcesoA("Richard");
        ProcesoB b =new ProcesoB(1000);
        ProcesoC c =new ProcesoC(0);
        Runnable x=new ProcesoD(50);
        Thread d =new Thread(x);

        Runnable z=new ProcesoE("hola como esta?");
        Thread e =new Thread(z);

        a.start();
        b.start();
        c.start();
        d.start();
        z.run();
    }
}
