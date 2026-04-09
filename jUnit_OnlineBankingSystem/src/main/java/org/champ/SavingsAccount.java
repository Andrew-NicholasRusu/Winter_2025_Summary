package org.champ;

public class SavingsAccount extends BankAccount {
    private static final int MAX_WITHDRAWALS = 3;
    private int withdrawalCount = 0;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public boolean withdraw(double amount) {
        if (withdrawalCount >= MAX_WITHDRAWALS || amount > balance) {
            return false;
        }
        balance -= amount;
        withdrawalCount++;
        return true;
    }
}
