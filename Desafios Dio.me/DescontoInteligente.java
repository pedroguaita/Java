package desafiosdiome;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DescontoInteligente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorOriginal, valorFinal;
        double desconto;

        // TODO: Leia o valor original do produto:
        valorOriginal = scanner.nextDouble();

        // TODO: Leia a porcentagem de desconto:
        desconto = scanner.nextDouble();

        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if(desconto < 0 || desconto > 100){
            System.out.println("Desconto invalido");
        }
        else{
            // TODO: Calcule o valor final do produto:
            valorFinal = valorOriginal - (valorOriginal * desconto)/100;

            // Formata e exibe o valor com duas casas decimais
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(valorFinal));
        }
        scanner.close();
    }
}
