package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankRefactorTestSuite {
    @Test
    public void shouldReturnCorrectAmountOfAddedCashMachines() {
        BankRefactor bank = new BankRefactor();
        bank.addCashMachine(new CashMachineRefactor());
        bank.addCashMachine(new CashMachineRefactor());

        CashMachineRefactor[] cashMachines;
        assertEquals(2, bank.getCashMachines().length);
    }

    @Test
    public void shouldReturnCorrectAmountIfNoCashMachineIsAdded() {
        BankRefactor bank = new BankRefactor();

        CashMachineRefactor[] cashMachines;
        assertEquals(0, bank.getCashMachines().length);
    }

    @Test
    public void shouldReturnCorrectBalanceForAllCashMachines() {
        BankRefactor bank = new BankRefactor();
        bank.addCashMachine(new CashMachineRefactor());
        bank.addCashMachine(new CashMachineRefactor());

        CashMachineRefactor[] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(100);
        cashMachines[0].addTransaction(-50);
        cashMachines[1].addTransaction(200);
        cashMachines[1].addTransaction(-100);

        assertEquals(150, bank.balanceFromAllCashMachines());
    }

    @Test
    public void shouldReturnZeroBalanceIfNoCashMachineIsAdded() {
        BankRefactor bank = new BankRefactor();

        assertEquals(0, bank.balanceFromAllCashMachines());
    }

    @Test
    public void shouldReturnZeroBalanceIfNoTransactionIsAdded() {
        BankRefactor bank = new BankRefactor();
        bank.addCashMachine(new CashMachineRefactor());
        bank.addCashMachine(new CashMachineRefactor());

        assertEquals(0, bank.balanceFromAllCashMachines());
    }

    @Test
    public void shouldReturnCorrectWithdrawalsAmount() {
        BankRefactor bank = new BankRefactor();
        bank.addCashMachine(new CashMachineRefactor());
        bank.addCashMachine(new CashMachineRefactor());

        CashMachineRefactor[] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(100);
        cashMachines[0].addTransaction(-50);
        cashMachines[1].addTransaction(200);
        cashMachines[1].addTransaction(-100);

        assertEquals(2, bank.withdrawalsAmount());
    }

    @Test
    public void shouldReturnCorrectPayInsAmount() {
        BankRefactor bank = new BankRefactor();
        bank.addCashMachine(new CashMachineRefactor());
        bank.addCashMachine(new CashMachineRefactor());

        CashMachineRefactor[] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(100);
        cashMachines[0].addTransaction(-50);
        cashMachines[1].addTransaction(200);
        cashMachines[1].addTransaction(-100);
        cashMachines[1].addTransaction(300);

        assertEquals(3, bank.payInsAmount());
    }

    @Test
    public void shouldReturnCorrectAverageWithdrawal() {
        BankRefactor bank = new BankRefactor();
        bank.addCashMachine(new CashMachineRefactor());
        bank.addCashMachine(new CashMachineRefactor());

        CashMachineRefactor[] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(-500);
        cashMachines[0].addTransaction(-100);
        cashMachines[1].addTransaction(-200);
        cashMachines[1].addTransaction(-200);

        assertEquals(-250.00, bank.averageWithdrawal(), 0.01);
    }

    @Test
    public void shouldReturnCorrectAveragePayIn() {
        BankRefactor bank = new BankRefactor();
        bank.addCashMachine(new CashMachineRefactor());
        bank.addCashMachine(new CashMachineRefactor());

        CashMachineRefactor[] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(100);
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(300);
        cashMachines[1].addTransaction(200);

        assertEquals(200.00, bank.averagePayIn(), 0.01);
    }
}
