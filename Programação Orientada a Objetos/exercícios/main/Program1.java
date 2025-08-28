package exercicios9.main;

import exercicios9.entities.Account;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        String holder, answer;
        double balance;

        System.out.println("---------- Welcome! ----------");

        System.out.print("Enter account number: ");
        number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        holder = sc.nextLine();

        System.out.print("Is there an initial deposit(yes/no)? ");
        answer = sc.nextLine();

        answer = answer.trim().toLowerCase();
        if(answer.equals("yes") || answer.equals("y")){
            System.out.print("Enter your initial deposit value: ");
            balance = sc.nextDouble();
            sc.nextLine();

            Account account = new Account(number, holder, balance);

            System.out.println("\n---------- Account data ---------- ");
            System.out.println(account.toString());
        }
        else if(answer.equals("no") || answer.equals("n")){
            Account account = new Account(number, holder);

            System.out.println("\n---------- Account data ---------- ");
            System.out.println(account.toString());
        }
        else{
            System.out.println("Try again...");
        }

        sc.close();
    }
}
