package ProgramServiciosProcesos;

public class bucletest {
    public static int tareas = 0;

    public static void main(String[] args) {
        bucletestb b1,b2;
        b1=new bucletestb("primero");
        b2=new bucletestb("segundo");
        b1.start();
        b2.start();
    }
}
