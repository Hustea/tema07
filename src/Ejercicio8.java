import java.util.Scanner;

public class Ejercicio8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        final int TAMANYO = 5;
        final int DIVISOR = 2;
        int[] array1 = {-2, -1, 1, 1, 2};
        int[] array2 = {0, 0, 0, 0, 0};
        int[] array3 = null;
        int[] array4 = {-2, -1};

        try{
            double[] arrayDividido = dividirEntreArray(DIVISOR, array1, TAMANYO);
            //double[] arrayDividido = dividirEntreArray(DIVISOR, array2, TAMANYO);
            //double[] arrayDividido = dividirEntreArray(DIVISOR, array3, TAMANYO);
            //double[] arrayDividido = dividirEntreArray(DIVISOR, array4, TAMANYO);
            mostrarArray(arrayDividido);
        }catch ( ArithmeticException ae){
            System.out.println("No puedes dividir por 0");
        }catch (NullPointerException npe){
            System.out.println("Los valores no pueden ser Null");
        }catch (IndexOutOfBoundsException ioob){
            System.out.println("El array no puede ser menor de "+TAMANYO);
        }
    }

    /**
     * Metodo utilizado para dividir numero y almacenarlos en otro array
     * @param num divisor
     * @param array array
     * @param tamanyo tamanyo del bucle
     * @return array ya dividido
     */
    public static double[] dividirEntreArray(int num, int[] array, int tamanyo){
        double[] arrayDividido = new double[array.length];
        for(int i = 0; i < tamanyo; i++){
            arrayDividido[i] = num / array[i];
        }
        return arrayDividido;
    }

    /**
     * metodo utilizado para mostrar el contenido de un array
     * @param array
     */
    public static void mostrarArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1)+". "+array[i]);
        }
    }
}
