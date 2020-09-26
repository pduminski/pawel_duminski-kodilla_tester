package com.kodilla.bank.homework;

public class BankRefactor {
    private CashMachineRefactor[] cashMachines;
    private int size;
    private int balanceFromAllCashMachines;

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

        for(int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].returnBalance();
        }
        this.balanceFromAllCashMachines = sum;

        return balanceFromAllCashMachines;
    }

    public int withdrawalsAmount() {
        return -1;
    }

    public int payInsAmount() {
        return -1;
    }

    public double averageWithdrawal() {
        return -1.0;
    }

    public double averagePayIn() {
        return -1;
    }
}
