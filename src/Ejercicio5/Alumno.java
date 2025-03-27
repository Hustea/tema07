package Ejercicio5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Alumno {
    String nombre;
    LocalDate fechaNacimiento;
    int alturaCm;

    Alumno(String nombre, LocalDate fechaNacimiento, int alturaCm){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.alturaCm = alturaCm;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public int getEdad() {
        return calcularEdad(fechaNacimiento);
    }

    public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                ", nombre='" + nombre + '\'' +
                ", edad='" + getEdad() + '\'' +
                ", alturaCm=" + alturaCm +
                '}';
    }
}
