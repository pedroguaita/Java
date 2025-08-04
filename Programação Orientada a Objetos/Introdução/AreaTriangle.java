package exercicioscondicionais;

import java.util.Scanner;
import entities.Triangle;

public class AreaTriangle {
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

        double p = (x.a + x.b + x.c) / 2.0;
        areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
