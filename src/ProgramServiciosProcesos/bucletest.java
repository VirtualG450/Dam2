package ProgramServiciosProcesos;

public class bucletest {
    public static int tareas = 0;
    public static boolean puedoactuar = true;

    public static void main(String[] args) {
        bucletestb b1,b2;
        b1=new bucletestb("1");
        b2=new bucletestb("2");
        b1.start();
        b2.start();
    }
}
