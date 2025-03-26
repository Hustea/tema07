import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String mensaje = "Inrtoduzca un numero positivo";
        double[] array = solicitarNumeros(mensaje);


        if(array.length == 0){
            System.out.println("El array esta vacio");
        }else{
            double mayor = sacarNumeroMayorArray(array);
            System.out.println("Numero mas alto: "+mayor);
        }

    }

    /**
     * solicitar numeros
     * @param mensaje
     * @return
     */
    public static double[] solicitarNumeros(String mensaje){
        ArrayList<Double> numeros = new ArrayList<>();
        System.out.println(mensaje);
        double numero;
        int contador = 1;
        boolean validar = false;
        do{
            try{
                System.out.printf("indica el numero %d:\n", contador++);
                numero = Double.parseDouble(scanner.nextLine());
                numeros.add(numero);
            }catch (NumberFormatException nfe){
                validar = true;
            }
        }while(validar != true);

        double[] valores = new double[numeros.size()];
        for(int i = 0; i < numeros.size(); i++){
            valores[i] = numeros.get(i);
        }
        return valores;
    }

    /**
     * imprimir por pantalla
     * @param array
     * @return
     */
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
