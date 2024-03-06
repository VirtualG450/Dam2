package ProgramServiciosProcesos.CasoPractico1UD2;

public class AnalizadorTemperaturas extends Thread {

    //subarray de temperaturas
    private int[] temperaturas;
    private int tempMaxima;

    public AnalizadorTemperaturas(int [] temperaturas){
        this.temperaturas = temperaturas;
        this.tempMaxima = Integer.MIN_VALUE;
    }

    @Override
    public void run() {
        //buscar la temperatura maxima del array
        for(int temp: temperaturas){
            if(temp>tempMaxima)
                tempMaxima = temp;
        }
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

}
