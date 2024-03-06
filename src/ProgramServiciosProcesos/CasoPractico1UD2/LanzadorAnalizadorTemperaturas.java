package ProgramServiciosProcesos.CasoPractico1UD2;

import java.util.Scanner;

public class LanzadorAnalizadorTemperaturas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final int dias = 3650; //365 por 10 años
        int[] TemperaturasDiesAnyos = new int[dias];

        //Guardar aleatoriamente temperaturas entre -30 y 50
        for (int i = 0; i < TemperaturasDiesAnyos.length; i++) {
            TemperaturasDiesAnyos[i]=(int) (Math.random()*(50-(-30)+1)+(-30));
        }

        System.out.println("¿Con cuantos hilos quieres analizar los datos?");
        int numHilos = sc.nextInt();

        int temperaturasPorHilo = TemperaturasDiesAnyos.length/numHilos;

        AnalizadorTemperaturas [] hilos = new AnalizadorTemperaturas[numHilos];

        //Crear y empezar los hilos para encontrar la temperatura maxima
        //en cada subconjunto
        for(int i=0; i<numHilos;i++) {
            int [] arrayHiloEspecifico = new int [temperaturasPorHilo];
            int posicioninicial = i*temperaturasPorHilo;
            System.arraycopy(TemperaturasDiesAnyos, posicioninicial, arrayHiloEspecifico, 0, temperaturasPorHilo);
            hilos[i]=new AnalizadorTemperaturas(arrayHiloEspecifico);
            hilos[i].start();
        }

        //Esperamos que todos los hilos terminen su ejecucion
        for(AnalizadorTemperaturas h: hilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }

        //Encontrar de todas las maximas, la mas maxima
        int temperaturaMaxima=Integer.MAX_VALUE;

        for(AnalizadorTemperaturas h: hilos) {
            int temperaturaMaximaPorHilo = h.getTempMaxima();
            if(temperaturaMaximaPorHilo>temperaturaMaxima)
                temperaturaMaxima = temperaturaMaximaPorHilo;
        }

        System.out.println("La temperatura maxima de los ultimos diez años es: "+temperaturaMaxima);
        sc.close();
    }
}
