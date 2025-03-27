package Ejercicio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("crear al primer alumno:");
        System.out.println("Inserte el nombre:");
        String nombre1 = scanner.nextLine();
        System.out.println("Inserte la altura en cm:");
        int altura1 = Integer.parseInt(scanner.nextLine());
        LocalDate fecha1 = validarFecha();
        Alumno Alumno1 = new Alumno(nombre1, fecha1, altura1);

        System.out.println("crear al segundo alumno:");
        System.out.println("Inserte el nombre:");
        String nombre2 = scanner.nextLine();
        System.out.println("Inserte la altura en cm:");
        int altura2 = Integer.parseInt(scanner.nextLine());
        LocalDate fecha2 = validarFecha();
        Alumno Alumno2 = new Alumno(nombre2, fecha2, altura2);

        System.out.println(Alumno1);
        System.out.println(Alumno2);

        compararAlturaAlumnos(Alumno1, Alumno2);
        scanner.close();
    }

    public static void compararAlturaAlumnos(Alumno alumno1, Alumno alumno2){
        if(alumno1.getAlturaCm() == alumno2.getAlturaCm()){
            System.out.println("Son igual de altos los dos alumnos");
        }else if(alumno1.getAlturaCm() > alumno2.getAlturaCm()){
            System.out.println(alumno1.getNombre()+" Es mas alto que "+ alumno2.getNombre());
        }else{
            System.out.println(alumno2.getNombre()+" Es mas alto que "+ alumno1.getNombre());
        }
    }

    public static LocalDate validarFecha(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = null;
        boolean fechaValida = false;

        while (!fechaValida) {
            System.out.println("Introduce una fecha (dd/MM/yyyy): ");
            String input = scanner.nextLine();

            try {
                fecha = LocalDate.parse(input, formatter);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no válida. Inténtalo de nuevo.");
            }
        }
        return fecha;
    }
}

