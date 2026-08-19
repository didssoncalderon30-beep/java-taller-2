import java.util.Scanner;
import java.time.LocalDate;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        String signo;
        System.out.print("Ingrese el dia de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        anio = sc.nextInt();

        // Determinar signo zodiacal
        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            signo = "Acuario";
        } 
        else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 19)) {
            signo = "Piscis";
        } 
        else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            signo = "Aries";
        } 
        else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            signo = "Tauro";
        } 
        else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            signo = "Géminis";
        } 
        else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } 
        else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            signo = "Leo";
        } 
        else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } 
        else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } 
        else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpión";
        } 
        else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } 
        else {
            signo = "Capricornio";
        }

        // Calcular edad
        LocalDate fechaActual = LocalDate.now();

        int edad = fechaActual.getYear() - anio;

        // Verificar si ya cumplió años este año
        if (mes > fechaActual.getMonthValue() ||
            (mes == fechaActual.getMonthValue() && dia > fechaActual.getDayOfMonth())) {
            edad--;
        }

        System.out.println("\nSigno zodiacal: " + signo);
        System.out.println("Edad: " + edad + " años");

        sc.close();
    }
}
