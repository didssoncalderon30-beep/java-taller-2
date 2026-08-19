import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anterior, actual;
        double consumo, costo, total;
        System.out.print("Lectura anterior: ");
        anterior = sc.nextDouble();

        System.out.print("Lectura actual: ");
        actual = sc.nextDouble();

        consumo = actual - anterior;

        if (consumo <= 100) {

            costo = 2622.00;

        } else if (consumo <= 300) {

            costo = 79.78;

        } else if (consumo <= 500) {

            costo = 89.52;

        } else {

            costo = 97.95;
        }

        total = consumo * costo;

        System.out.println("Consumo: " + consumo + " KWh");
        System.out.println("Total a pagar: Bs. " + total);
    }
}
