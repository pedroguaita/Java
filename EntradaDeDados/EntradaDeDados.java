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
        */
        
        //LER UM TEXTO ATÉ QUEBRA DE LINHA
        int x;
        String s1, s2, s3;
        
        x = entrada.nextInt();       //é necessario um nextLine() para "consumir" a quebra de linha
        entrada.nextLine();
        s1 = entrada.nextLine();    //para ler a linha inteira precisa usar o Line.
        s2 = entrada.nextLine();
        s3 = entrada.nextLine();
        
        System.out.println("DADOS DIGITADOS");
        System.out.println("s1");
        System.out.println("s2");
        System.out.println("s3");
        
        entrada.close();
    }
}
