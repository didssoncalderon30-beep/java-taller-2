import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double edad, hemoglobina;
        String sexo;
        double minimo;
        System.out.print("Ingrese la edad en años: ");
        edad = sc.nextDouble();
        System.out.print("Ingrese el sexo (M/F): ");
        sexo = sc.next();

        System.out.print("Ingrese la hemoglobina: ");
        hemoglobina = sc.nextDouble();

        if (edad <= 1.0 / 12) {
            minimo = 13;
        } else if (edad <= 0.5) {
            minimo = 10;
        } else if (edad <= 1) {
            minimo = 11;
        } else if (edad <= 5) {
            minimo = 11.5;
        } else if (edad <= 10) {
            minimo = 12.6;
        } else if (edad <= 15) {
            minimo = 13;
        } else if (sexo.equalsIgnoreCase("F")) {
            minimo = 12;
        } else {
            minimo = 14;
        }

        if (hemoglobina < minimo) {
            System.out.println("Resultado: POSITIVO - Tiene anemia.");
        } else {
            System.out.println("Resultado: NEGATIVO - No tiene anemia.");
        }
    }
}
