import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Fahrenheit (°F): ");
        double temp = scanner.nextDouble();
        String deporte;
        if (temp > 85) {
            deporte = "Natación";
        } else if (temp > 70) { 
            deporte = "Tenis";
        } else if (temp > 32) { 
            deporte = "Golf";
        } else if (temp > 10) { 
            deporte = "Esquí";
        } else {                
            deporte = "Marcha";
        }
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Temperatura ingresada: " + temp + " °F");
        System.out.println("Deporte apropiado: " + deporte);

        scanner.close();
    }
}
    

