import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:El return esta devolviento una lista vacia: return int[] {};
    // Solucion:Modifica el return para q regrese el arreglo: return arreglo;
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
    // Método de burbuja tradicional con errores
    // Error encontrado:if (arreglo[i] < arreglo[j]) {
    // Solucion: if (arreglo[i] > arreglo[j]) {

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }
//-------------------------------------------------------------------------------------------------------------
    // Método de burbuja tradicional con errores
    // Error encontrado: 58 = for (int j = 0; j < n; j++) {
    // Solucion: 58 = for (int j = 0; j < n - i - 1; j++) {
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
    // Método de selección con errores
    // Error encontrado: 89 = No existe return 
    // Solucion: 89 = return arreglo;
    
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
    // Método de selección con errores
    // Error encontrado: 101 = for (int j = i + 1; j < arreglo.length; j--) {
    // Solucion: 101 = for (int j = i + 1; j < arreglo.length; j++) {
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
    // Método de selección con errores
    // Error encontrado: 131/133 = int smallerNumber = arreglo[i];/arreglo[indiceMinimo] = smallerNumber;
    // Solucion: 131/133 = int smallerNumber = arreglo[indiceMinimo]; / arreglo[i] = smallerNumber;
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length-1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
    // Método de inserción con errores
    // Error encontrado: 147 = while (j > 0 && arreglo[i] < key) {
    // Solucion: 147 = while (i >= 0 && arreglo[i] > key) {
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
    // Método de inserción con errores
    // Error encontrado: 166 = for (; j >= 0 && arreglo[j] > actual; j--) { / arreglo[j + 1] = arreglo[j];
    // Solucion: 166 = while (i >= 0 && arreglo[j] > actual) { / arreglo[i + 1] = arreglo[i];
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > actual) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }

            arreglo[i + 1] = actual;
        }

        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
    // Método de inserción con errores
    // Error encontrado:  while (i > 0 && arreglo[i] < key) {
    // Solucion: while (i > 0 && arreglo[i] > key) {
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i --;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }
//-------------------------------------------------------------------------------------------------------------
}
