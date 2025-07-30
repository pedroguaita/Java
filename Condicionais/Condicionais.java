import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //SIMPLES
        int x = 5;

        System.out.println("Bom dia!");

        if (x > 0) {
            System.out.println("Boa tarde");
        }

        //COMPOSTA
        int hora;

        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            System.out.println("Boa tarde");
        }


        /*ENCADEAMENTO -> duas possibilidades:

        if(condição 1){
            comando 1
        }
        else{
            if(condicao 2){
                comando 2
            }
            else{
                comando 3
            }
        }

        #OU

        if (condição 1){
            comandos
        }
        else if(condição 2){
            comandos
        }
        else if(condiçao 3){
            comandos
        }
        else{
            comandos
        }
         */

        sc.close();
    }
}
