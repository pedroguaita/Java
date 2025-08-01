package exerciciosrepeticao;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois pontos de uma coordenada (X, Y). Digite 0 em uma das partes para encerrar.");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0){
            if(x > 0  && y > 0){
                System.out.println("Primeiro quadrante");
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro quadrante");
            }
            else{
                System.out.println("Quarto quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
