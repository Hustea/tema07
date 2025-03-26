import java.util.ArrayList;
import java.util.Scanner;

public class Egercicio1 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String mensaje = "Inrtoduzca un numero positivo";
        double[] array = solicitarNumeros(mensaje);
    }

    /**
     * ESTO ES DE GERMAN VA EN IO CREO
     * @param mensaje
     * @return
     */
    public static double[] solicitarNumeros(String mensaje){
        ArrayList<Double> numeros = new ArrayList<>();
        System.out.println(mensaje);
        double numero;
        int contador = 1;
        do{
            try{
                System.out.printf("indica el numero %d:\n", contador);
                numero = Double.parseDouble(scanner.nextLine());
                numeros.add(numero);
                contador++;
            }catch (NumberFormatException nfe){
                numero = 1;
                System.out.println("Solo numero por favor");
            }
        }while(numero >= 0);

        double[] valores = new double[numeros.size()];
        for(int i = 0; i < numeros.size(); i++){
            valores[i] = numeros.get(i);
        }
        return valores;
    }
}



/*

    private final static Scanner scanner = new Scanner(System.in);
    private static final float GROW_FACTOR = 2f;
    static int size = 0;

    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        int[] array = new int[TAMANYO_ARRAY];
        int numero;

        do{
            System.out.println("Introduzca un numero:");
            numero = Integer.parseInt(scanner.nextLine());

            // exepcion

            if(numero >= 0){
                rellenarArray(array, numero);
            }
        }while(numero >= 0);
        System.out.println("Hasta pronto");
        scanner.close();
    }


public static void rellenarArray(int[] array, int numero){
    if(size == array.length-1){
        expand( array);
    }
    array[size] = numero;
    size++;
}


private static void expand(int[] data) {
    int[] aux = new int[Math.round(data.length * GROW_FACTOR)];
    for (int i = 0; i < data.length; i++) {
        aux[i] = data[i];
    }
    data = aux;
}
 */
