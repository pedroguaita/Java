package introducaopoo.exercicios;

import entitiesObject.CurrencyConverter;

import java.util.Scanner;

public class ex003ME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double quantity = sc.nextDouble();

        double value = CurrencyConverter.converter(price, quantity);
        System.out.println("Amount to be paid in reais = " + value);

        sc.close();
    }
}
