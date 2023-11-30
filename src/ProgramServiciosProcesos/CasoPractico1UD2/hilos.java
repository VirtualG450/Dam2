package ProgramServiciosProcesos.CasoPractico1UD2;

public class hilos {

    //Despues de buscar un buen rato en internet el mejor metodo que encontre para obtener
    //el mayor numero del fue hacer un metodo que recibe como argumento el 
    //array para luego buscar el mayor y devolverlo

    //Hago que el mayor numero sea el menor del rango posible
    private static int mayor = -30;

    //Despues con un bucle for y una condicion if hago que revise todas las posiciones del 
    //array, cada vez que la posicion del array sea mayor a la variable mayor esta sera reemplazada
    //por la nueva hasta que haya recorrido todo el array quedando el mayor que haya sido encontrado
    public static int Getmayordearray(int[] arrayrecibido) {
        for (int i=0;i<arrayrecibido.length;i++){
            if (mayor<arrayrecibido[i]){
                mayor = arrayrecibido[i];
            }
        }
        //Una vez hecho la operacion devuelvo el numero mayor
        return mayor;
    } 
    
}
