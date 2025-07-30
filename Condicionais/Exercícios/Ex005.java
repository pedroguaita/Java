package exerciciosCondicionais;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, qtd;
        float valor = 0;

        System.out.print("Informe o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Informe a quantidade: ");
        qtd = sc.nextInt();

        if(codigo == 1){
            valor = qtd * 4;
        }
        else if(codigo == 2){
            valor = qtd * 4.50f;
        }
        else if(codigo == 3){
            valor = qtd * 5.00f;
        }
        else if(codigo == 4){
            valor = qtd * 2.0f;
        }
        else if(codigo == 5){
            valor = qtd * 1.50f;
        }
        else{
            System.out.println("Valor inválido");
        }

        System.out.printf("Total a pagar: R$%.2f", valor);
        
        sc.close();
    }
}
