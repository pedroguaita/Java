package exerciciosCondicionais;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if(num < 0){
            System.out.println("Negativo");
        }
        else if(num > 0){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Neutro");
        }
    }
}
