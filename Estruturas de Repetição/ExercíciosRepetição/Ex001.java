package exerciciosrepeticao;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;

        System.out.println("Digite a senha: ");
        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha inválida! Tente novamente.");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido.");

        sc.close();
    }
}
