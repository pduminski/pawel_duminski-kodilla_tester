package com.kodilla.bank.homework;

public class BankRefactor {
    private CashMachineRefactor[] cashMachines;
    private int size;
    private int balanceFromAllCashMachines;
    private int withdrawalsFromAllMachines;
    private int payInsFromAllMachines;


    public BankRefactor() {
        this.size = 0;
        this.balanceFromAllCashMachines = 0;
        cashMachines = new CashMachineRefactor[0];
    }

    public void addCashMachine(CashMachineRefactor newCashMachine) {
        size++;
        CashMachineRefactor[] newTab = new CashMachineRefactor[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = newCashMachine;
        cashMachines = newTab;
    }

    public CashMachineRefactor[] getCashMachines() {
        return cashMachines;
    }

    public int balanceFromAllCashMachines() {
        int sum = 0;

        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].returnBalance();
        }
        this.balanceFromAllCashMachines = sum;

        return balanceFromAllCashMachines;
    }

    public int withdrawalsAmount() {
        int sum = 0;

        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].getWithdrawals();
        }
        this.withdrawalsFromAllMachines = sum;

        return this.withdrawalsFromAllMachines;
    }

    public int payInsAmount() {
        int sum = 0;

        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].getPayIns();
        }
        this.payInsFromAllMachines = sum;

        return this.payInsFromAllMachines;
    }

    public double averageWithdrawal() {
        int sum = 0;
        int helper = 0;

        if (cashMachines.length == 0) {
            return 0;
        }

        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if  (transactions[i] < 0) {
                    sum += transactions[i];
                    helper++;
                }
            }
        }

        return sum / helper;
    }

    public double averagePayIn() {
        int sum = 0;
        int helper = 0;

        if (cashMachines.length == 0) {
            return 0;
        }

        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if  (transactions[i] > 0) {
                    sum += transactions[i];
                    helper++;
                }
            }
        }

        return sum / helper;
    }
}
