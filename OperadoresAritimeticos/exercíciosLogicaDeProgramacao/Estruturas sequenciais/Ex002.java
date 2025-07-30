package exercicios;

import java.util.Scanner;

public class Ex002 {
    public static final double PI = 3.14159;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.print("Insira o raio do círuclo: ");
        raio = sc.nextDouble();

        area = PI * Math.pow(raio, 2);

        System.out.printf("Área: %.4f", area);
    }
}
