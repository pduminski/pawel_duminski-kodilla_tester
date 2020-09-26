package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.function.ToDoubleBiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldReturnCorrectAmountOfTransactionsWithCorrectData() {
        CashMachine cashMachine = new CashMachine(5000);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-300);

        int[] values = cashMachine.getTransactions();
        assertEquals(2, values.length);
        assertEquals(500, values[0]);
        assertEquals(-300, values[1]);
    }
    @Test
    public void shouldReturnCorrectBalanceIfNoTransactionWasDone() {
        CashMachine cashMachine = new CashMachine(5000);

        assertEquals(5000, cashMachine.returnBalance());
    }

    @Test
    public void shouldReturnCorrectBalanceAfterTransactions() {
        CashMachine cashMachine = new CashMachine(5000);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(700);
        cashMachine.addTransaction(-300);

        assertEquals(5500, cashMachine.returnBalance());
    }

    @Test
    public void shouldReturnNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine(5000);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(700);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(100);

        assertEquals(4, cashMachine.returnNumberOfTransactions());
    }

    @Test
    public void shouldNotBeAbleToAddTransactionIfTheNextWithdrawalWouldTakeBalanceBelowZero() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(-300);

        assertEquals(2, cashMachine.returnNumberOfTransactions()); // transaction is added anyway, this needs fixing - TODO
        assertEquals(200, cashMachine.returnBalance()); // GOOD but thats not what we want. We want transaction to not be added
    }
//    @Test
//    public void countersForPayInWithdrawalAndIgnoreWork() {
//        CashMachine cashMachine = new CashMachine(2000);
//        cashMachine.addTransaction(100);
//        cashMachine.addTransaction(-1800);
//        cashMachine.addTransaction(-500);
//
//        assertEquals(1, cashMachine.getPayIns());
//        assertEquals(1, cashMachine.getWithdrawals());
//        assertEquals(1, cashMachine.getIgnored());
//    }


}
