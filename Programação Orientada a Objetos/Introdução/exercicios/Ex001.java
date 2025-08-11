package introducaopoo.exercicios;

import entitiesObject.Rectangle;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle medidas;
        medidas = new Rectangle();

        System.out.println("Entre com as medidas do retangulo:");
        medidas.largura = sc.nextDouble();
        medidas.altura = sc.nextDouble();

        System.out.printf("Area: %.2f%n", medidas.area());
        System.out.printf("Perímetro: %.2f%n", medidas.perimetro());
        System.out.printf("Diagonal: %.2f%n", medidas.diagonal());
    }
}
