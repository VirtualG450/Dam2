package ProgramServiciosProcesos.Videoconferencia1Diciembre;

public class LanzadorHiloContador {
		
	public static void main(String[]args) {
		
		//Creamos un array con 5 hilos
		//implementando runnable
		HiloContador arrayHilos[] = new HiloContador[5];
		
		//los lanzamos
		for (int i=0;i<5;i++) {
			arrayHilos[i]=new HiloContador("Hilo "+i);
            arrayHilos[i].SetLimite(10);
			Thread hilo = new Thread(arrayHilos[i]);
			
			hilo.start();
		}
		
		
		//Cada hilo tendra un nombre
		//Cada hilo contara hasta x
	}
}
