import java.util.Scanner;
public class Ejercicio30 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        double A,B,C,D,numero,resultado;
        System.out.print("ingrese A: ");
        A=sc.nextDouble();
        System.out.print("ingrese B: ");
        B=sc.nextDouble();
        System.out.print("ingrese C: ");
        C=sc.nextDouble();
        System.out.print("ingrese D: ");
        D=sc.nextDouble();
        numero=A*1000+ B*100+C*10+D;
        if(D>=5){
            resultado=numero+(10-D);

        }else{
            resultado=numero - D;

        }
        System.out.println("numero original: "+ numero);
        System.out.println("numero redondeado: "  + resultado);
        

        
    }
    
}
