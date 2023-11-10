package ProgramServiciosProcesos;

public class Hilo extends Thread {

    private String nombre;
    private int retardo;

    public Hilo(String s,int d){
        nombre = s;
        retardo = d;
    }

    public void run(){
        try {
            sleep(retardo);
        } catch (InterruptedException e) {
        }
        System.out.println(nombre+"-> Retardo: "+retardo);
    }
}