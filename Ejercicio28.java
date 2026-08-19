import java.util.Scanner;
public class Ejercicio28 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        double compra,empresa,banco,credito,interes;
        System.out.print("ingrese el monto ttal de la compra: ");
        compra=sc.nextDouble();
        if (compra>5000){
            empresa=compra*0.55;
            banco=compra*0.30;
            credito=compra*0.15;

        }else{
            empresa=compra*0.70;
            banco=0;
            credito=compra*0.30;

        }
        interes=credito*0.20;
        System.out.println("resultados: ");
        System.out.println("dinero de la empresa: " + empresa);
        System.out.println("credito del fabricante: " + credito);
        System.out.println("intereses: " + interes);
        System.out.println("prestamo del banco: " + banco);

    }
    
}
