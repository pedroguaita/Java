package exerciciosCondicionais;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal;
        int duracao;

        System.out.println("Digite a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou " + duracao + " Hora(s).");
        sc.close();
    }
}
