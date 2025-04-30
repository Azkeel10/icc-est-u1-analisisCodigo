import java.util.Random;

public class Bechmarking {
    private MetodosOrdenamiento mOrdenamiento;
//-------------------------------------------------------------------------------------------------------------
    public Bechmarking() {
        long currentMillis = System.currentTimeMillis();    //Para fecha
        long currentNano = System.nanoTime();

        System.out.println(currentMillis);
        System.out.println(currentNano);

        mOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatorio(10000);
        Runnable tarea =()-> mOrdenamiento.burbujaTradicional(arreglo);
                        //()-> Sirve para no ejecutar el metodo 
                        //pero si guardarla para poder enviar com atributo 

        double tiempoDuracionMilis = medirConCurretTimeMilles(tarea);
        double tiempoDuracionNano = medirConNanoTime(tarea);

        System.out.println("Tiempo en millis segundos: " + tiempoDuracionMilis);
        System.out.println("Tiempo en Nano segundos: " + tiempoDuracionNano);
    }
//-------------------------------------------------------------------------------------------------------------
    public int[] generarArregloAleatorio(int tamaño){

        int[] array = new int[tamaño];
        Random random = new Random();

        for (int i = 0 ; i < tamaño; i++){
            array[i] = random.nextInt(100000);
        }

        return array;
    }
//-------------------------------------------------------------------------------------------------------------
    public double medirConCurretTimeMilles(Runnable tarea){

        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin =  System.currentTimeMillis();

        return (fin - inicio) / 1000.0;
    }
//-------------------------------------------------------------------------------------------------------------
    public double medirConNanoTime(Runnable tarea){

        long inicio = System.nanoTime();
        tarea.run();
        long fin =  System.nanoTime();

        return (fin - inicio) / 1_000_000_000.0;
    }
//-------------------------------------------------------------------------------------------------------------
}
