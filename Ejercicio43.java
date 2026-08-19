import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capital;
        double prestamo = 0;
        double presupuesto;
        double insumos;
        double incentivos;
        System.out.print("Ingrese el capital actual: ");
        capital = sc.nextDouble();
        if (capital < 0) {
            prestamo = 10000 - capital;
            presupuesto = 10000;
        } else if (capital <= 20000) {
            prestamo = 20000 - capital;
            presupuesto = 20000;
        } else {

            prestamo = 0;
            presupuesto = capital;
        }

        presupuesto = presupuesto - 5000 - 2000;

        insumos = presupuesto / 2;
        incentivos = presupuesto / 2;

        System.out.println("Prestamo bancario: $" + prestamo);
        System.out.println("Para insumos: $" + insumos);
        System.out.println("Para incentivos: $" + incentivos);
    }
}
