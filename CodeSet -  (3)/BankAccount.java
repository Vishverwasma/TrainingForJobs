package Railworld.Day08;

public class BankAccount {
    private int account_number;
    private String account_holder;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int account_number, String account_holder, double balance) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance = balance+amount;
    }
    public void withdraw(double amount){
        this.balance = balance-amount;
    }
}
