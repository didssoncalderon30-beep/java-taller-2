import java.util.Scanner;

public class Ejercicio24{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        double inversion, interes , dineroFinal;
        System.out.print("ingrese el dinero invertido: ");
        inversion=sc.nextDouble();
        System.out.print("ingrese los intereses generados: ");
        interes=sc.nextDouble();
        if(interes>7000){
            dineroFinal=inversion+interes;
            System.out.println("los intereses superan los 7000:  ");
            System.out.println("los intereses seran reinveretido: ");
            System.out.println(" dinero final: "+ dineroFinal);

        }else{
            dineroFinal=inversion;
            System.out.println("los intereses no superan los 7000: ");
            System.out.println("no se reinvierte los intereses: ");
            System.out.println("dinero final: " + dineroFinal);
        }


    }
