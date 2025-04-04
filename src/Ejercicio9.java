import exeptions.ArithmeticZeroDivisorException;
import exeptions.IndexArrayOutOfBoundsException;
import exeptions.NullArrayPointerException;

import java.util.Scanner;

public class Ejercicio9 {
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
        }catch (ArithmeticZeroDivisorException azde){
            System.out.println(azde.getMessage());
        }catch (NullArrayPointerException nape){
            System.out.println(nape.getMessage());
        }catch (IndexArrayOutOfBoundsException iaoobe){
            System.out.println(iaoobe.getMessage());
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
            if(array[i] == 0){
                throw new ArithmeticZeroDivisorException("No puedes dividir entre 0");
            }else if(array == null){
                throw new NullArrayPointerException("El array no puede estar vacio");
            }else if(i >= array.length){
                throw new IndexArrayOutOfBoundsException("No puedes pasarte de la capacidad del array");
            }
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
