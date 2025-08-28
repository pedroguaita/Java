package exercicios9.main;

import exercicios9.entities.Account;
import java.util.Scanner;

import static java.lang.System.exit;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //VARIABLES
        Account account;
        int number;
        String holder, answer;
        double initialDeposit, depositValue, withdrawValue;

        System.out.println("---------- Welcome! ----------");

        System.out.print("Enter account number: ");
        number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        holder = sc.nextLine();

        System.out.print("Is there an initial deposit(yes/no)? ");
        answer = sc.nextLine();   //char response = sc.next().charAt(0); -> caso usasse (y/n).

        answer = answer.trim().toLowerCase();
        if(answer.equals("yes") || answer.equals("y")){
            System.out.print("Enter your initial deposit value: ");
            initialDeposit = sc.nextDouble();
            sc.nextLine();

            account = new Account(number, holder, initialDeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println("\n---------- Account data ---------- ");
        System.out.println(account.toString());

        System.out.print("\nEnter a deposit value: ");
        depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("\n---------- Updated account data ---------- ");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("\n---------- Updated account data ---------- ");
        System.out.println(account);

        sc.close();
    }

}
