package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineRefactorTestSuite {
    @Test
    public void shouldReturnCorrectBalance() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(200);

        assertEquals(400, cashMachine.returnBalance());
    }

    @Test
    public void shouldReturnCorrectBalanceWhenNoTransactionsPresent() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();

        assertEquals(0, cashMachine.returnBalance());
    }

    @Test
    public void shouldReturnCorrectAmountOfTransactions() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(200);

        assertEquals(3, cashMachine.returnNumberOfTransactions());
    }

    @Test
    public void shouldReturnCorrectAmountOfTransactionsWhenNoTransactionsPresent() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();

        assertEquals(0, cashMachine.returnNumberOfTransactions());
    }

    @Test
    public void shouldReturnCorrectAmountOfWithdrawals() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(-200);

        assertEquals(2, cashMachine.getWithdrawals());
    }

    @Test
    public void shouldReturnZeroIfNoWithdrawalsWereDone() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(300);

        assertEquals(0, cashMachine.getWithdrawals());
    }

    @Test
    public void shouldReturnCorrectAmountOfPayIns() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(200);

        assertEquals(3, cashMachine.getPayIns());
    }

    @Test
    public void shouldReturnZeroIfNoPayInsWereDone() {
        CashMachineRefactor cashMachine = new CashMachineRefactor();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);

        assertEquals(0, cashMachine.getPayIns());
    }

}
