import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double S, area;
        System.out.print("Ingrese el lado A: ");
        A = sc.nextDouble();

        System.out.print("Ingrese el lado B: ");
        B = sc.nextDouble();

        System.out.print("Ingrese el lado C: ");
        C = sc.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {

            S = (A + B + C) / 2;

            area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

            System.out.println("Si forman un triangulo.");

            if (A == B && B == C) {

                System.out.println("Es equilatero.");

            } else if (A == B || A == C || B == C) {

                System.out.println("Es isosceles.");

            } else {

                System.out.println("Es escaleno.");
            }

            System.out.println("Area = " + area);

        } else {

            System.out.println("No forman un triangulo.");
        }
    }
}
