package exercicios;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        int diferenca;

        System.out.println("Digite quatro valores inteiros (na mesma linha): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.println("Números digitados:");
        System.out.printf("| %d | %d | %d | %d |\n", a, b ,c, d);

        diferenca = (a * b) - (c * d);

        System.out.format("Cálculo relizado -> (%d x %d) - (%d x %d)\n", a, b, c, d);
        System.out.printf("Resultado do cálculo: %d", diferenca);
    }
}
