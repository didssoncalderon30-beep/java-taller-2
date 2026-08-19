import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hipoteca;
        double inversion;
        double persona;
        double socio;
        System.out.print("Ingrese el monto total de la inversion: ");
        inversion = sc.nextDouble();
        System.out.print("Ingrese el monto de la hipoteca: ");
        hipoteca = sc.nextDouble();
        if (hipoteca < 1000000) {
            persona = inversion * 0.50;
            socio = inversion * 0.50;
        } else {
            persona = hipoteca;
            double resto = inversion - hipoteca;
            persona = persona + resto / 2;
            socio = resto / 2;
        }
        System.out.println("Aporte de la persona: $" + persona);
        System.out.println("Aporte del socio: $" + socio);
    }
} 

