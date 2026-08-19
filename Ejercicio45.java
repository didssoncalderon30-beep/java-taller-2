import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double D;
        double X1, X2;
        System.out.print("Ingrese A: ");
        A = sc.nextDouble();
        System.out.print("Ingrese B: ");
        B = sc.nextDouble();

        System.out.print("Ingrese C: ");
        C = sc.nextDouble();

        D = B * B - 4 * A * C;

        if (D == 0) {

            X1 = -B / (2 * A);
            X2 = X1;

            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);

        } else if (D > 0) {

            X1 = (-B + Math.sqrt(D)) / (2 * A);
            X2 = (-B - Math.sqrt(D)) / (2 * A);

            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);

        } else {

            System.out.println("No existen soluciones reales.");
        }
    }
}