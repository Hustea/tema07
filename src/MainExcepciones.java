import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainExcepciones {
    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje, int minLength, int maxLength) {
        boolean valido = true;
        String valor = null;
        do {
            try{
                System.out.println(mensaje);
                valor = scanner.nextLine();
                int length = valor.length();
                valido = length >= minLength && length <= maxLength;
                if (!valido) {
                    System.err.printf("La longitud debe de estar entre %d y %d\n", minLength, maxLength);
                }
            }catch (NoSuchElementException nsee){
                System.err.println("La entrada no puede estar vacia");
            }catch (IllegalStateException ise){
                System.err.println("El scanner esta cerrado");
            }

        } while (!valido);
        return valor;
    }

    public static boolean validarMatricula(String matricula) {
        int i;
        if (matricula.length() != 8) {
            return false;
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            return false;
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}