package com.kodilla.bank.homework;

public class CashMachineNew {
    private int[] transactions;
    private int size;

    public CashMachineNew() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int amount) {
        if (amount < 0) {
            System.out.println("Lower than zero");
        }
        if ((getBalance() + amount) >= 0) {
            this.size++;
            int[] tempTab = new int[size];
            System.arraycopy(transactions, 0, tempTab, 0, transactions.length);
            tempTab[size - 1] = amount;
            this.transactions = tempTab;
        }
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getNumberOfDeposits() {
        int sum = 0;
        for(int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum++;
            }
        }
        return sum;
    }

    public int getNumberOfWithdrawals() {
        int sum = 0;
        for(int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum++;
            }
        }
        return sum;
    }

    public double getAverageDeposit() {
        double sum = 0;

        if (this.transactions.length == 0) {
            return 0.0;
        }

        if (getNumberOfDeposits() == 0) {
            return 0.0;
        }

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum += transactions[i];
            }
        }
        return sum / getNumberOfDeposits();
    }

    public double getAverageWithdrawal() {
        double sum = 0;

        if (this.transactions.length == 0) {
            return 0.0;
        }

        if (getNumberOfDeposits() == 0) {
            return 0.0;
        }

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
            }
        }
        return sum / getNumberOfWithdrawals();
    }
}
