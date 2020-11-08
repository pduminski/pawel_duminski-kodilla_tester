package com.kodilla.bank.homework;

public class CashMachineRefactor {
    private int[] transactions;
    private int balance;
    private int numberOfTransactions;
    private int size;
    private int withdrawals;
    private int payIns;

    public CashMachineRefactor() {
        this.size = 0;
        this.balance = 0;
        withdrawals = 0;
        payIns = 0;
        this.numberOfTransactions = 0;
        this.transactions = new int[0];
    }

    public void addTransaction(int transactionAmount) {
        size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0 , transactions.length);
        if (transactionAmount > 0) {
            payIns++;
            newTab[this.size - 1] = transactionAmount;              // ELIMINATE REPETITIONS
            balance += transactionAmount;
            transactions = newTab;
            numberOfTransactions++;
        } else if (transactionAmount < 0) {
            withdrawals++;
            newTab[this.size - 1] = transactionAmount;              // ELIMINATE REPETITIONS
            balance += transactionAmount;
            transactions = newTab;
            numberOfTransactions++;
        }                                                           // SHOULD WE ADD ELSE HERE?

    }

    public int[] getTransactions() {
        return transactions;
    }

    public int returnBalance() {
        return balance;
    }

    public int returnNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getPayIns() {
        return payIns;
    }

    public int getWithdrawals() {
        return withdrawals;
    }
}
