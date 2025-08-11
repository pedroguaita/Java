package introducaopoo;

import java.util.Scanner;
import entitiesObject.Triangle;

public class ProgramaTrianglePoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        double areaX, areaY;

        System.out.println("insira as medidas do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("insira as medidas do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areaX = x.area();
        areaY = y.area();

        System.out.printf("Area triangulo X: %.4f\n", areaX);
        System.out.printf("Area triangulo Y: %.4f\n", areaY);

        if(areaX > areaY){
            System.out.println("Maior: X");
        }
        else{
            System.out.println("Maior: Y");
        }
    }
}
