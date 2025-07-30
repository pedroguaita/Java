package exerciciosCondicionais;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe um número: "); num = sc.nextInt();

        if((num % 2) == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Ímpar");
        }
    }
}
