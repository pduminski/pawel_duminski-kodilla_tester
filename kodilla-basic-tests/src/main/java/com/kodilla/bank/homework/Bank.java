package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine[] cashMachines;
    private int size = 0;

    public Bank(String name) {
        this.name = name;
        cashMachines = new CashMachine[0];
    }

    public void addCashMachine(int statingBalance) {
        size++;
        CashMachine[] newCashMachines = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newCashMachines, 0, this.size);
        newCashMachines[this.size - 1] = new CashMachine(statingBalance);
        cashMachines = newCashMachines;
    }

    public CashMachine[] returnCreatedCashMachines() {
        return this.cashMachines;
    }

    public int returnBalanceFromAllCashMachines() {
        return -1;
    }

    public int withdrawalAmount() {
        return -1;
    }

    public int payInsAmount() {
        return -1;
    }

    public double averageWithdrawal() {
        return -1.0;
    }

    public double averagePayIn() {
        return -1.0;
    }
}
