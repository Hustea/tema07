import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    private final static Scanner scanner = new Scanner(System.in);
    static int errores = 0;
    public static void main(String[] args) {
        final int TAMANYO = 10;
        String mensaje = "Inrtoduzca un numero positivo";
        double[] array = solicitarNumeros(mensaje, TAMANYO);
        double mayor = sacarNumeroMayorArray(array);

        System.out.println("numero mas alto: "+ mayor);
        System.out.println("numero de errore: "+ errores);
    }


    public static double[] solicitarNumeros(String mensaje, int tamanyo){
        double[] array = new double[tamanyo];
        System.out.println(mensaje);
        double numero;
        int contador = 0;
        do{
            try{
                System.out.printf("indica el numero %d:\n", contador + 1);
                numero = Double.parseDouble(scanner.nextLine());
                array[contador] = numero;
                contador++;
            }catch (NumberFormatException nfe){
                System.out.println("Solo numero por favor");
                errores++;
            }
        }while(contador != array.length);

        return array;
    }

    public static double sacarNumeroMayorArray(double[] array){
        double aux = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > aux){
                aux = array[i];
            }
        }
        return aux;
    }
}

