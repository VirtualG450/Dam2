package ProgramServiciosProcesos.UD3.CasoPractico1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//nota: los mensajes sysout son principalmente para yo saber si el codigo funciona hasta ciertos puntos
public class Servidor {

    //creo la variable en la que guardare el resultado
    private static int resultado;
    public static void main(String[] args) throws IOException{
        
        //Empiezo creando un mensaje para indicar que se intenta iniciar el servidor
        System.out.println("Iniciando servidor");

        //creo el ServerSocket del servidor en el puerto 8888
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("Esperando conexion");
        Socket soc = ss.accept();

        //Si la conexion se completa sin problemas aparecera el siguiente mensaje
        System.out.println("Conexion establecida");

        //Creo el stream de input, se recibira el string creado por el cliente
        //que se almacenara en un String llamado clienteinput
        InputStreamReader in = new InputStreamReader(soc.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String clienteinput = br.readLine();

        //Busco en el String los operadores y si coincide se ejecuta el codigo
        //Separo el String en 2 partes desde la ubicacion del operador que luego
        //paso a int para realizar la operacion
        if (clienteinput.matches("+")){
            System.out.println("Procesando suma");
            String[] partes = clienteinput.split("+");
            int parte1 = Integer.parseInt(partes[0]);
            int parte2 = Integer.parseInt(partes[1]);
            resultado = parte1 + parte2;

        } else if (clienteinput.matches("-")){
            System.out.println("Procesando resta");
            String[] partes = clienteinput.split("-");
            int parte1 = Integer.parseInt(partes[0]);
            int parte2 = Integer.parseInt(partes[1]);
            resultado = parte1 - parte2;

        } else if (clienteinput.matches("*")){
            System.out.println("Procesando multiplicacion");
            String[] partes = clienteinput.split("*");
            int parte1 = Integer.parseInt(partes[0]);
            int parte2 = Integer.parseInt(partes[1]);
            resultado = parte1 * parte2;

        } else if (clienteinput.matches("/")){
            System.out.println("Procesando division");
            String[] partes = clienteinput.split("/");
            int parte1 = Integer.parseInt(partes[0]);
            int parte2 = Integer.parseInt(partes[1]);
            resultado = parte1 / parte2;

        }

        PrintWriter pr = new PrintWriter(soc.getOutputStream());
        pr.println(resultado);
        pr.flush();
        //Indicamos que se ha enviado el resultado y cerramos el socket
        System.out.println("Resultado enviado");
        ss.close();
    }
}

