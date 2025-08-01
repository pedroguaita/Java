import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, soma = 0;

        System.out.println("Digite números para realizar a soma deles. (digite 0 para finalizar):");
        num = sc.nextInt();

        while(num != 0){
            soma += num;
            num = sc.nextInt();
        }
        System.out.printf("A soma deu %d", soma);

        sc.close();
    }
}
