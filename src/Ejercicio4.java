import java.util.Scanner;

public class Ejercicio4 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final int TAMANYO = 5;
        int[] array = new int[TAMANYO];
        String mensaje = "Inrtoduzca un numero positivo";

        try{
            solicitarNumeros(array, mensaje);
            mostrarArray(array);
        }catch(NullPointerException npe){
            System.out.println("El array no esta creado");
        }

    }

    public static void solicitarNumeros(int[] array, String mensaje){
        System.out.println(mensaje);
        int numero;
        int contador = 0;
        for(int i = 0; i < 10; i++){
            try{
                System.out.printf("indica el numero %d:\n", (contador+1));
                numero = Integer.parseInt(scanner.nextLine());
                array[contador] = numero;
                contador++;
            }catch (NumberFormatException nfe){
                System.out.println("Solo numero por favor");
            }catch (IndexOutOfBoundsException iobe){
                System.out.println("El array esta lleno");
                break;
            }
        }
    }

    public static void mostrarArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("NUMERO "+(i+1)+": "+array[i]);
        }
    }
}