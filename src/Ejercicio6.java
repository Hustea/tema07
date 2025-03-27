import exeptions.NumberEmptyException;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Ejercicio6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        final int DIVISOR = 2;
        int[] array = {-2, -1, 0, 1, 2};

        try{
            double[] arrayDividido = dividirEntreArray(DIVISOR, array);
            mostrarArray(arrayDividido);
        }catch ( ArithmeticException ae){
            System.out.println("No puedes dividir por 0");
        }
    }

    public static double[] dividirEntreArray(int num, int[] array){
        double[] arrayDividido = new double[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                arrayDividido[i] = 0;
            }else{
                arrayDividido[i] = array[i] / num;
            }
        }
        return arrayDividido;
    }

    public static void mostrarArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1)+". "+array[i]);
        }
    }
}
