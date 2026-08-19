import java.util.Scanner;
public class Ejercicio26 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);          
        double A,B,C,D,resultado;
        System.out.print("ingrese A: ");
        A=sc.nextDouble();
        System.out.print("ingrese B: ");
        B=sc.nextDouble();
        System.out.print("ingrese C: ");
        C=sc.nextDouble();
        System.out.print("ingrese D: ");
        D=sc.nextDouble();
        if(D==0){
            resultado=(A-C)*(A-C);
        }else if (D>0){
            resultado=(A-B)*(A-B)*(A-B)/100;

        }else{
            System.out.println("D debe ser mayor o igual a 0: ");
            
        }
        System.out.println("el resultado es : "+ resultado);
    }


}
