package exercicios9.entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    //CONSTRUTOR
    public Account(int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    //CONSTRUTOR
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    //GETTERS AND SETTERS
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    //METHODS
    public void saque(double value){
        balance -= value - 5;
    }

    public void deposit(double value){
        balance += value;
    }

    public double saldo(){
        return balance;
    }

    public String toString(){
        return "Account"
                + number
                + " ,Holder: "
                + holder
                + ", Balance: $"
                + balance;

    }
}
