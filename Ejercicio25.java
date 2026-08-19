import java.util.Scanner;
public class Ejercicio25{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        double sueldo, aumento,nuevoSueldo;
        System.out.print("ingrese su sueldo: ");
        sueldo=sc.nextDouble();
        if(sueldo<4000){
            aumento=sueldo*0.15;
        
        }else{
            aumento=sueldo*0.12;
        }
        nuevoSueldo=sueldo+aumento;
        System.out.println("aumento de sueldo: " + nuevoSueldo);
        System.out.println("nuevo sueldo: "+ nuevoSueldo);
        

    }
