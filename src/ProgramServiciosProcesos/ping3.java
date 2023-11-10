package ProgramServiciosProcesos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ping3 {
	public static void main(String[] args) {
		
		ProcessBuilder ping = new ProcessBuilder("cmd","/c","ping -n 3 google.es");

		try {
			Process pi = ping.start();
            /*
            InputStreamReader isr = new InputStreamReader(pi.getInputStream(),"ISO-8859-1");
            BufferedReader br = new BufferedReader(isr);
            */
            BufferedReader br = new BufferedReader(new InputStreamReader(pi.getInputStream(),"ISO-8859-1"));

            String linea = "";
            System.out.println("Ejecutando ping 3 veces a google.es:");

            while ((linea = br.readLine())!= null) {
                System.out.println(linea);
            }

            br.close();
            //isr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
