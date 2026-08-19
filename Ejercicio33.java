import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nombre;
        double compra;
        double descuento;
        double montoPagar;

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = sc.nextDouble();

        System.out.print("Ingrese el monto de la compra: ");
        compra = sc.nextDouble();

        if (compra < 500) {

            descuento = 0;

        } else if (compra <= 1000) {

            descuento = compra * 0.05;

        } else if (compra <= 7000) {

            descuento = compra * 0.11;

        } else if (compra <= 15000) {

            descuento = compra * 0.18;

        } else {

            descuento = compra * 0.25;
        }

        montoPagar = compra - descuento;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto de la compra: $" + compra);
        System.out.println("Descuento recibido: $" + descuento);
        System.out.println("Monto a pagar: $" + montoPagar);
    }
}
