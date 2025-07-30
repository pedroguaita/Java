package exercicios;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, raio;
        double areaT, areaC, areaTra, areaQ, areaR;

        System.out.print("Digite três valores: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        //ÁREA DO TRIÂNGULO
        areaT = (a * c)/2;

        //ÁREA DO CÍRCULO
        raio = c;
        areaC = Math.PI * Math.pow(raio, 2);

        //ÁREA DO TRAPÉZIO
        areaTra = ((a + b) * c)/2;

        //ÁREA DO QUADRADO
        areaQ = Math.pow(b, 2);

        //ÁREA DO RETÂNGULO
        areaR = a * b;

        System.out.printf("TRIÂNGULO: %.3f\n", areaT);
        System.out.printf("CÍRCULO: %.3f\n", areaC);
        System.out.printf("TRAPÉZIO: %.3f\n", areaTra);
        System.out.printf("QUADRADO: %.3f\n", areaQ);
        System.out.printf("RETÂNGULO: %.3f\n", areaR);
    }
}
