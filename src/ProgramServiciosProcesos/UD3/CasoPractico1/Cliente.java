package ProgramServiciosProcesos.UD3.CasoPractico1;
import java.util.Scanner;

    //El objetivos de este ejercicio es crear 2 aplicaciones java que funcionen como cliente y
    //servidor en la que el cliente introduzca dos numeros y una operacion a realizar, el servidor
    //los recibe mediante el uso de sockets, realizara la operacion necesaria y los devolvera al
    //cliente usando el mismo metodo

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
        sc.nextLine();
        String operacion = sc.nextLine();
        // Test sysout  System.out.println(numero1+" "+numero2+" "+operacion);

        //Ahora que tenemos 
        

        //Cerramos el escaner
        sc.close();
        
    }
}
