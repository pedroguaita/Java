package exerciciosrepeticao;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, gasolina, alcool, diesel;
        gasolina = 0;
        alcool = 0;
        diesel = 0;

        System.out.println("Informe o tipo de combustível utilizado:");
        System.out.println("1: Álcool\n2:Gasolina\n3:Diesel\n4:Encerrar");

        while(true){
            codigo = sc.nextInt();

            if(codigo == 4){
                break;
            }
            switch(codigo){
                case 1:
                    gasolina++;
                    break;
                case 2:
                    alcool++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        }
        System.out.println(gasolina);
        System.out.println(alcool);
        System.out.println(diesel);
    }
}
