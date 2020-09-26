package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

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

    }

    @Test
    public void shouldReturnZeroBalanceIfNoCashMachineIsAdded() {

    }

    @Test
    public void shouldReturnZeroBalanceIfNoTransactionIsAdded() {

    }
}
