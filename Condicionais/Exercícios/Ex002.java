package exerciciosCondicionais;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite dois valores: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if((a % b) == 0){
            System.out.println("São Múltiplos");
        }
        else if((b % a)== 0){
            System.out.println("São múltiplos");
        }
        else{
            System.out.println("Não são múltiplos");
        }
    }
}
