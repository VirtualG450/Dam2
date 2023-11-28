package ProgramServiciosProcesos.CasoPractico1UD2;

import java.util.Random;

// Me he dado cuenta de que no documento nada, asi que de ahora en adelante intentare documentar todo
public class principal {

    public static void main(String[] args) {
        //Creo el array temperaturas y le asigno 3650 digitos de tipo int
        int[] temperaturas = new int[3650];
        /* Buscando en internet como obtener numeros random encontre en stackoverflow una opcion, dejo el enlace al post
         * https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java#:~:text=Using%20Random%20class%20in%20Java.%20Random%20rand%20%3D,%2B%20min%3B%20Source%20of%20some%20Java%20Random%20awesomeness.
         * asi que lo aplique a este ejercicio */
        Random aleatorio = new Random();

        //Hago un bucle for que por cada digito de temperaturas haga un numero aleatorio entre el rango
        //-30 y 50 que luego se asignara a la posicion i del array temperaturas
        for (int i=0;i<temperaturas.length;i++){
            int numerorandom = aleatorio.nextInt(81)-30;
            temperaturas[i]=numerorandom;
        }
        /* Este codigo es el que usaba para comprobar que habia en el array, lo dejo en 1 linea, 
        para probarlo recomiendo comentar todo por debajo de este for.
        for (int i=0;i<temperaturas.length;i++){ System.out.print(temperaturas[i]+"|");} */

        //Buscando como dividir un array lo mas parecido que encontre es crear otro array y
        //copiar una parte del array principal usando arraycopy

        //Dividire el array principal en 4 partes, por lo cual hare 4 arrays
        //primero divido el length del array principal en 4 partes iguales
        int partes = (temperaturas.length/4);
        //Despues hago los arrays del tamaño de las partes
        int[] array1 = new int[partes];
        int[] array2 = new int[partes];
        int[] array3 = new int[partes];
        int[] array4 = new int[partes];

        //usando arraycopy copio el contenido de temperaturas en cada array
        System.arraycopy(temperaturas,0,array1,0,partes);
        System.arraycopy(temperaturas,partes,array2,0,partes);
        System.arraycopy(temperaturas,partes*2,array3,0,partes);
        System.arraycopy(temperaturas,partes*3,array4,0,partes);

        //ahora usando el metodo runnable creo 4 threads que llamaran al metodo Getmayordearray
        //dando como resultado el numero mayor en el array mostrado por la terminal
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                int mayor1 = hilos.Getmayordearray(array1);
                System.out.println("El mayor del hilo 1 es: "+mayor1);
            }
        });t1.start();
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                int mayor2 = hilos.Getmayordearray(array2);
                System.out.println("El mayor del hilo 2 es: "+mayor2);
            }
        });t2.start();
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run(){
                int mayor3 = hilos.Getmayordearray(array3);
                System.out.println("El mayor del hilo 3 es: "+mayor3);
            }
        });t3.start();
        Thread t4 = new Thread(new Runnable(){
            @Override
            public void run(){
                int mayor4 = hilos.Getmayordearray(array4);
                System.out.println("El mayor del hilo 4 es: "+mayor4);
            }
        });t4.start();
    }
}