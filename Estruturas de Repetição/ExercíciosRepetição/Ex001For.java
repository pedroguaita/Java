package exerciciosrepeticao;

import java.util.Scanner;

public class Ex001For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, i;

        System.out.println("Insira um valor inteiro entre 1 e 1000: ");
        x = sc.nextInt();

        if(x < 1 || x > 1000){
            System.out.println("valor inválido");
        }

        for(i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.print(i + " | ");
            }
        }

        sc.close();
    }
}
