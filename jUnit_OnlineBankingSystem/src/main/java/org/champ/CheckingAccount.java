package org.champ;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber,initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
