package hilos.clase;

public class ProcesoD implements Runnable{
    private int n;

    public ProcesoD(int numero) {
        n = numero;
    }

    public void asterisco(int n) {
        for (int i = 0; i <n; i++) {
            System.out.print("**************************");
        }
    }

    @Override
    public void run() {
        asterisco(n);
    }
}
