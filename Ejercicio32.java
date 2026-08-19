import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double P, Q;
        double resultado;

        System.out.print("Ingrese el valor de P: ");
        P = sc.nextInt();

        System.out.print("Ingrese el valor de Q: ");
        Q = sc.nextInt();

        resultado = Math.pow(P, 3) + Math.pow(Q, 4)
                  - 2 * Math.pow(P, 2);

        if (resultado > 680) {

            System.out.println("La expresión es mayor que 680.");
            System.out.println("P = " + P);
            System.out.println("Q = " + Q);

        } else {

            System.out.println("La expresión NO es mayor que 680.");
        }
    }
}
    

