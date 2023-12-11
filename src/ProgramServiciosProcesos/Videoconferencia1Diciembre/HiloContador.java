package ProgramServiciosProcesos.Videoconferencia1Diciembre;

public class HiloContador implements Runnable{
	//Variables
	private int limite;
	private String nombre;
	
	//constructor
	public HiloContador(String nombre) {
		this.nombre=nombre;
	}
    //metodo run()
	@Override
	public void run() {
		for (int i=0;i<limite;i++) {
			System.out.println(i + " " + nombre);
		}
		
	}
    //metodo
	public void SetLimite(int valor) {
		this.limite=valor;
	}
	
	
	
}
