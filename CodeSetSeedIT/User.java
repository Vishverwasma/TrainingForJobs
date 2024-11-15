package CodeSetSeedIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account{
    private int id;
    private String name;
    private String address;
    private double balance;
    private double phNumber;

    public Account(){}

    public Account(int id, String name, String address, double balance, double phNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.phNumber = phNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(double phNumber) {
        this.phNumber = phNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", phNumber=" + phNumber +
                '}';
    }
}

class Bank extends Account{
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int id){
        for(Account ac : accounts){
            if(ac.getId()==id){
                System.out.println("Account of user "+ac.getName()+" is being removed ... ");
                accounts.remove(ac);
                System.out.println("After removal all accounts are : ");
                printAccounts();
                return;
            }
        }
    }

    public String accountUserName(int id){
        for(Account acc : accounts){
            if(acc.getId()==id){
                return acc.getName();
            }
        }
        return "NOT FOUND";
    }

    public void depositAmount(int id,int amount){
        int index = 0;
        for(Account acc : accounts){
            if(acc.getId()==id){
                acc.setBalance(acc.getBalance()+amount);
                accounts.set(index,acc);
                return;
            }
            index++;
        }
    }
    public void withdrawAmount(int id,int amount){
        int index = 0;
        for(Account acc : accounts){
            if(acc.getId()==id){
                acc.setBalance(acc.getBalance()-amount);
                accounts.set(index,acc);
                return;
            }
            index++;
        }
    }

    public void printSingleAccount(int id){
        if(accounts.isEmpty()){
            System.out.println("There are No accounts");
        }else{
            for(Account acc : accounts){
                if(acc.getId()==id) {
                    System.out.println("-> " + acc);
                }
            }
        }
    }

    public void printAccounts(){
        if(accounts.isEmpty()){
            System.out.println("There are No accounts");
        }else{
            for(Account acc : accounts){
                System.out.println("-> " + acc);
            }
        }
    }
}

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        Bank b = new Bank();
        do{
            System.out.println("Enter ID : ");
            int id = sc.nextInt();
            System.out.println("Enter Name : ");
            String name = sc.next();
            System.out.println("Enter Address : ");
            String add = sc.next();
            System.out.println("Enter Balance : ");
            double bal = sc.nextDouble();
            System.out.println("Enter Phone Number : ");
            double phNo = sc.nextDouble();
            Account acc = new Account(id , name , add , bal , phNo);
            b.addAccount(acc);
            System.out.println("Enter More Account : -1 : No , 1 : Yes : " );
            choice = sc.nextInt();
        }while(choice!=-1);
        b.printAccounts();
        System.out.println("Account ID to remove : ");
        int rId = sc.nextInt();
        b.removeAccount(rId);
        int action = 0;
        do{
        System.out.println("Enter a ID to deposit and Withdraw amount : ");
        int tId = sc.nextInt();
        System.out.println("What do You want to do in "+b.accountUserName(tId)+" : for deposit : 1 and to withdraw : 2 ");
        action = sc.nextInt();
        System.out.println("Enter a amount : ");
        int amount = sc.nextInt();
            switch (action){
                case 1:
                    b.depositAmount(tId,amount);
                    System.out.println("After Action of deposit new data is ");
                    b.printSingleAccount(tId);
                    break;
                case 2:
                    b.withdrawAmount(tId,amount);
                    System.out.println("After Action of withdrawl new data is ");
                    b.printSingleAccount(tId);
                    break;
                default:
                    action = 0;
            }
            action = 3;
        }while(action!=3);
        System.out.println("\nAfter all this actions the new Bank Details are : ");
        b.printAccounts();
    }
}
