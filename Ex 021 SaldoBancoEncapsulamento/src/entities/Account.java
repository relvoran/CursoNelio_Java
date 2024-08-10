package entities;

import application.Program;

public class Account {

    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(String name, int number, double initialDeposit) {
        this.accountNumber = number;
        this.holderName = name;
        this.balance = initialDeposit;
    }

    public Account(String name, int number) {
        this.accountNumber = number;
        this.holderName = name;
    }
    //até aqui construtores!!!

    public double depositAmmount(double deposit) {
        return balance += deposit;
    }

    public double  withdrawAmmount(double withdraw) {
        return balance -= (withdraw+5);
    }
    //até aqui, métodos


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName(String name) {
        return holderName;
    }

    public void setHolderName(String name) {
        this.holderName = name;
    }

    public double getBalance() {
        return balance;
    }
    //getters e setters até aqui

    public String toString(){
        return "Account data: " + String.format("%n")
                + "Account " + accountNumber
                + ", Holder: " + holderName
                + " , Balance: $ " + String.format("%.2f", getBalance());

    }

}
