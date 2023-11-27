package ProgramServiciosProcesos;

public class bucletestb extends Thread {

    private String nombre;

    public bucletestb(String nombre){
        this.nombre=nombre;
    }

    public void run(){
        while (bucletest.tareas < 100) {
            System.out.println("Hilo "+nombre+" añadio 1");
            bucletest.tareas++;
        } System.out.println(nombre+" terminado con "+bucletest.tareas);
    }
}
