package ProgramServiciosProcesos;

public class Bucle extends Thread {

    private String nombre;
    public Bucle (String nombre) {
        this.nombre=nombre;
    }

    public void run() {
        for (int i = 0;i<50;i++) {
            System.out.println("Proceso "+nombre+" en "+i);
        }
    }
}
