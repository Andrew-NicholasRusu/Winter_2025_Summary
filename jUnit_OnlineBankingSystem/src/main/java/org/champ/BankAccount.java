package org.champ;

public abstract class BankAccount {

    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }


}
