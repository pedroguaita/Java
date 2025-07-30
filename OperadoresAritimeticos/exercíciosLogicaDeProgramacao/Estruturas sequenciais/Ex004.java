package exercicios;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        float horas, valor, salario;

        System.out.println("Informe o seu ID: "); id = sc.nextInt();
        System.out.println("Informe sua carga horária por mês: "); horas = sc.nextFloat();
        System.out.println("Informe o valor recebido por hora: "); valor = sc.nextFloat();

        salario = valor * horas;

        System.out.printf("ID: %d", id);
        System.out.printf("Salário: R$%.2f", salario);
    }
}
