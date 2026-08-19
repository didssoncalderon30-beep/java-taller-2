import java.util.Scanner;
public class Ejercicio29 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double venta1,venta2,venta3,salario,totalVentas,porcentaje1,porcentaje2,porcentaje3,salarioFinal;
        System.out.print("ingrese ventas del departamento 1: ");
        venta1=sc.nextDouble();
        System.out.print("ingrese ventas del departamento 2: ");
        venta2=sc.nextDouble();
        System.out.print("ingrese ventas del departamento 3: ");
        venta3=sc.nextDouble();
        System.out.print("ingrese el salario mensual: ");
        salario=sc.nextDouble();
        totalVentas=venta1+venta2+venta3;
        porcentaje1=(venta1/ totalVentas)*100;
        porcentaje2=(venta2/ totalVentas)*100;
        porcentaje3=(venta3/ totalVentas)*100;
        salarioFinal=salario;
        if(porcentaje1> 33){
            salarioFinal=salario*1.20;
            System.out.println("departamento 1 recibe el incentivo: ");
            System.out.println("salario final: " + salarioFinal);
            if(porcentaje2>33){
                salarioFinal=salario*1.20;
                System.out.println("depatamento 2 recine el incentivo: ");
                System.out.println("salario final: " + salarioFinal);
                if(porcentaje3>33){
                    salarioFinal=salario*1.20;
                    System.out.println("departamento 3 recibe el insentivo: ");
                    System.out.print("salario final: " + salarioFinal);
                }
            }

        }
    }
    
}
