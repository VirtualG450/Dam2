package ProgramServiciosProcesos.UD3.CasoPractico1;
import java.util.Scanner;

public class Cliente {
    //Variables necesarias para enviar al servidor y operacion a realizar
    private int numero1,numero2;
    private String operacion;
    public static void main(String[] args) {
        //Creamos el input del usuario usando scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");

        //Solicitar al usuario los numeros y operacion a realizar que se almacenan en las variables
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("Introduce la operacion a realizar suma(+),resta(-),multiplicacion(*) o division(/)");
        String operacion = sc.nextLine();

        System.out.println(numero1+" "+numero2+" "+operacion);
        

        //Cerramos el escaner
        sc.close();
        
    }
}
