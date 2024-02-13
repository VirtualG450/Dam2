package ProgramServiciosProcesos.UD3.CasoPractico1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        
        //Creamos el Socket del servidor y le asignamos un puerto
        try {
        System.out.println("Iniciando servidor");
            ServerSocket ss = new ServerSocket(8888);
            Socket soc = ss.accept();

            //Si la conexion se completa sin problemas aparecera el siguiente mensaje
            System.out.println("Conexion establecida");
        } catch (IOException e) {
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }

    }
}
