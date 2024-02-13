package ProgramServiciosProcesos.UD3.CasoPractico1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//nota: los mensajes sysout son principalmente para yo saber si el codigo funciona hasta ciertos puntos
public class Servidor {
    public static void main(String[] args) {
        
        //Empiezo creando un mensaje para indicar que se intenta iniciar el servidor
        System.out.println("Iniciando servidor");

        //En el try catch intento crear el socket del servidor en el puerto 8888
        try {
            ServerSocket ss = new ServerSocket(8888);
            Socket soc = ss.accept();
            //Si se ha conseguido llegar a este punto indico el mensaje de sysout
            System.out.println("Esperando conexion");

            //Si la conexion se completa sin problemas aparecera el siguiente mensaje
            System.out.println("Conexion establecida");
        } catch (IOException e) {
            //Si hay algun error indico el siguiente mensaje sysout
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }

    }
}
