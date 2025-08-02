import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, i;
        int soma = 0;
        int num = 0;

        System.out.print("Informe um valor inteiro: ");
        valor = sc.nextInt();
        System.out.printf("Agora, digite %d números para a realização de uma soma:\n", valor);

        for(i = 0; i < valor; i++){
            num = sc.nextInt();
            soma += num;
        }
        System.out.printf("Soma: %d", soma);

        sc.close();
    }
}
