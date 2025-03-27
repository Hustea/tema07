import java.util.Scanner;

public class Ejercicio7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String[] array = {"Pablo", "Ivan", "Tomas", "Oscar"};
        String[] arrayMal = {"Pablo", "Ivan", "Tomas", null};

        try{
            //mostrarCadenasArray(array);
            mostrarCadenasArray(arrayMal);
        }catch (NullPointerException npe){
            System.out.println("No deben haber valores Null en el array");
        }
    }

    public static void mostrarCadenasArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1)+". "+array[i].charAt(0));
        }
    }
}