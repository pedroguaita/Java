import java.util.Scanner;
//import java.util.Locale;

public class EntradaDeDados {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        /*
        String x;
        int y;
        float z;
        char a;

        System.out.print("Digite algo: ");

        a = entrada.next().charAt(0);
        x = entrada.next();
        y = entrada.nextInt();
        z = entrada.nextFloat();           //Para ponto flutuante vai depender da localidade do sistema, ou seja, Pt-Br -> vírgula para separar. // para usar o "." (ponto), se utiliza: Locale.setDefault(Locale.US);

        System.out.printf("Você digitou: %.2f", z);       //println sempre usa . (ponto), ja o printf nao.
        System.out.println("\nVoce digitou: " + a);
        */

        //LER VARIOS DADOS NA MESMA LINHA, ou seja, separados por espaço

        String x;
        int y;
        float z;

        x = entrada.next();
        y = entrada.nextInt();
        z = entrada.nextFloat();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        entrada.close();
    }
}
