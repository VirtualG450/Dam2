package ProgramServiciosProcesos.UD3.CasoPractico1;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import ProgramServiciosProcesos.CasoPractico1UD2.principal;

    //El objetivos de este ejercicio es crear 2 aplicaciones java que funcionen como cliente y
    //servidor en la que el cliente introduzca dos numeros y una operacion a realizar, el servidor
    //los recibe mediante el uso de sockets, realizara la operacion necesaria y los devolvera al
    //cliente usando el mismo metodo

public class Cliente {

    //Variables necesarias para enviar al servidor y operacion a realizar
    private int numero1,numero2;
    private String operacion;
    public static void main(String[] args) throws IOException {

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

        //Ahora que tenemos el input ya podemos hacer la conexion desde la parte del cliente
        //Creamos un socket al que le indicamos conectarse a localhost en el puerto 8888
        
        Socket soc = new Socket("localhost", 8888);

        //Juntamos los numeros y la operacion a realizar en un String y lo enviamos al servidor
        PrintWriter pw = new PrintWriter(soc.getOutputStream());
        pw.println(numero1+operacion+numero2);
        pw.flush();

        InputStreamReader in = new InputStreamReader(soc.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String resultado = br.readLine();

        System.out.println("El resultado es "+resultado);
        
        //Cerramos el escaner y el socket para liberar los recursos
        sc.close();
        soc.close();
        
    }
}
