package exerciciosrepeticao;

import java.util.Scanner;

public class Ex002For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, valor;
        int in = 0;
        int out = 0;

        System.out.println("Informe um número: ");
        n = sc.nextInt();

        System.out.println("Informe valores: ");
        for(i = 0; i < n; i++){
            valor = sc.nextInt();

            if(valor > 9 && valor < 21){
               in++;
            }
            else {
              out++;
            }
        }
        System.out.printf("in: %d", in);
        System.out.printf("out: %d", out);
        sc.close();
    }
}
