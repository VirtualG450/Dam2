package ProgramServiciosProcesos;

public class CreadorHilos {
    public static void main(String[] args) {
        Hilo h1,h2;
        h1 = new Hilo("Hilo 1", (int)(Math.random() * 2000));
        h2 = new Hilo("Hilo 2", (int)(Math.random() * 2000));
        h1.start();
        h2.start();
    }
}
