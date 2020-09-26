package com.kodilla.bank.homework;

public class CashMachineRefactor {
    private int[] transactions;
    private int balance;
    private int numberOfTransactions;
    private int size;

    public CashMachineRefactor() {
        this.size = 0;
        this.balance = 0;
        this.numberOfTransactions = 0;
        this.transactions = new int[0];
    }

    public void addTransaction(int transactionAmount) {
        size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0 , transactions.length);
        newTab[this.size - 1] = transactionAmount;
        balance += transactionAmount;
        transactions = newTab;
        numberOfTransactions++;
    }

    public int returnBalance() {
        return balance;
    }

    public int returnNumberOfTransactions() {
        return numberOfTransactions;
    }


}
