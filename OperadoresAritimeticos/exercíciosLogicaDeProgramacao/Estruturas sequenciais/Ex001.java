import java.util.Scanner;

public class Ex001{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println(" ---------------");
        System.out.println("|SOMA DE VALORES|");
        System.out.println(" ---------------");
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        soma = n1 + n2;

        System.out.printf("Soma: %d", soma);
    }
}
