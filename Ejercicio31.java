import java.util.Scanner;
public class Ejercicio31 {
    public static void man (String[]args){
        Scanner sc = new Scanner(System.in);
        double kilometros , pago;
        System.out.print("ingrese los kilometros recorridos ");
        kilometros:sc.nextDouble();
        if( kilometros<=300){
            pago=5000;

        }else if (kilometros<=1000){
            
         pago=5000+(kilometros-300)*200;
         }else{
            pago=5000+(1000-300)*200 +(kilometros - 1000)*150;

         }
        System.out.println("el total a pagar es:  " + pago);
    }
        
        {
    }


