import java.util.Scanner;
public class Ejercicio27 {
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    double V1,V2,V3,areaTriangulo,areaCirculo,areaRectangulo;
    System.out.print("ingrese el valo 1: ");
    V1=sc.nextDouble();
    System.out.print("ingrese el valor 2: ");
    V2=sc.nextDouble();
    System.out.print("ingrese eñl valor 3");
    V3=sc.nextDouble();
    areaTriangulo=(V1*V2)/2;
    areaCirculo= V2*V1*V1;
    areaRectangulo=V1*V2;
    if(areaTriangulo==V3){
        System.out.println(" la figura es un triangulo: ");

    }else if(areaCirculo==V3){
        System.out.print("la figura e un circulo: ");
        
    }else if(areaRectangulo==V3){
    System.out.println("la figura es un rectanfulo: ");

    }else{
        System.out.println("no coinside con ninguna de las figuras: ");
    }

  }
  
    
}
