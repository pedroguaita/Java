package exercicios;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo1, codigo2;
        int qtd1, qtd2;
        float preco1, preco2, valorTotal;

        System.out.print("Informe o código da peça 1: ");
        codigo1 = sc.nextInt();
        System.out.print("Informe o numero de peças da peça 1: ");
        qtd1 = sc.nextInt();
        System.out.print("Informe o valor unitário da peça 1: ");
        preco1 = sc.nextFloat();

        System.out.print("Informe o código da peça 2: ");
        codigo2 = sc.nextInt();
        System.out.print("Informe o numero de peças da peça 2: ");
        qtd2 = sc.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        preco2 = sc.nextFloat();

        valorTotal = (preco1 * qtd1) + (preco2 * qtd2);
        System.out.printf("Valor a pagar: R$%.2f", valorTotal);

        sc.close();
    }
}
