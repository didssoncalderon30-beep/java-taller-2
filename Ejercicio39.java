import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorInicial;
        double devaluacion;
        double valorizacion;
        double valorAuto;
        double valorTerreno;
        double perdidaAuto;
        double incrementoTerreno;
        System.out.print("Ingrese el valor inicial del automóvil y terreno: ");
        valorInicial = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de devaluación anual del automóvil: ");
        devaluacion = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de valorización anual del terreno: ");
        valorizacion = sc.nextDouble();

        valorAuto = valorInicial * Math.pow(1 - devaluacion / 100, 3);
        valorTerreno = valorInicial * Math.pow(1 + valorizacion / 100, 3);
        perdidaAuto = valorInicial - valorAuto;
        incrementoTerreno = valorTerreno - valorInicial;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Valor del automóvil después de 3 años: $" + valorAuto);
        System.out.println("Valor del terreno después de 3 años: $" + valorTerreno);
        System.out.println("Devaluación del automóvil: $" + perdidaAuto);
        System.out.println("Incremento del terreno: $" + incrementoTerreno);
        System.out.println("La mitad del incremento del terreno: $" + (incrementoTerreno / 2));
        if (perdidaAuto <= incrementoTerreno / 2) {
            System.out.println("Debe comprar el automóvil.");
        } else {
            System.out.println("No debe comprar el automóvil.");
        }

        sc.close();
    }
    
