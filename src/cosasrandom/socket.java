package cosasrandom;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class socket {

    public static void main(String[] args) {
        
            try {
                Socket s=new Socket("time-a.mist.gov",13);
                void close(s);
            } catch (UnknownHostException une) {
                System.out.println("Servidor no encontrado");
            } catch (IOException une) {
                System.out.println("Error en la comunicacion");
            }
    }
    
}
