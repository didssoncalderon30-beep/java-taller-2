import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la categoría del trabajador (1-4): ");
        int categoria = scanner.nextInt();
        System.out.print("Ingrese el sueldo actual del trabajador: ");
        double sueldoActual = scanner.nextDouble();
        double porcentajeAumento = 0;
        switch (categoria) {
            case 1:
                porcentajeAumento = 0.15; 
                break;
            case 2:
                porcentajeAumento = 0.10; 
                break;
            case 3:
                porcentajeAumento = 0.08; 
                break;
            case 4:
                porcentajeAumento = 0.07; 
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return;
        }
        double aumento = sueldoActual * porcentajeAumento;
        double nuevoSueldo = sueldoActual + aumento;
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Categoría del trabajador: " + categoria);
        System.out.printf("Nuevo sueldo: $%.2f\n", nuevoSueldo);

        scanner.close();
    }
}
