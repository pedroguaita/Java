package exerciciossequenciais;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC;
        double yA, yB, yC;
        double areaX, areaY;

        System.out.println("insira as medidas do triangulo x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("insira as medidas do triangulo y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
