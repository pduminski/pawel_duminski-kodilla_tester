package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;
    private int startingBalance;
//    private int withdrawals = 0;
//    private int payIns = 0;
//    private int ignored = 0;

    public CashMachine(int startingBalance) {
        this.startingBalance = startingBalance;         // every CashMachine needs some starting ballance in order to be able to retrieve any money
        this.transactions = new int[0];         // table set to 0 since there are no transactions
    }

    public void addTransaction(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return this.transactions;
    }

    public int returnBalance() {
        if (this.transactions.length == 0) {
            return startingBalance;
        }

        int balance = startingBalance;

        for (int i = 0; i < this.transactions.length; i++) {
            if (balance + transactions[i] < 0) {
                continue;
            } else {
                balance += transactions[i];
            }
        }
        return balance;
    }

    public int returnNumberOfTransactions() {
        return this.transactions.length;
    }
}
