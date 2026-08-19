import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hectareas;
        double metros;
        double pinos, oyameles, cedros;
        System.out.print("Ingrese las hectareas del bosque: ");
        hectareas = sc.nextDouble();
        metros = hectareas * 10000;
        if (metros > 1000000) {

            pinos = metros * 0.70;
            oyameles = metros * 0.20;
            cedros = metros * 0.10;

        } else {

            pinos = metros * 0.50;
            oyameles = metros * 0.30;
            cedros = metros * 0.20;
        }

        // Cantidad de árboles según las proporciones indicadas
        double cantidadPinos = (pinos / 10) * 8;
        double cantidadOyameles = (oyameles / 15) * 15;
        double cantidadCedros = (cedros / 18) * 10;

        System.out.println("Pinos: " + cantidadPinos);
        System.out.println("Oyameles: " + cantidadOyameles);
        System.out.println("Cedros: " + cantidadCedros);
    }
}
