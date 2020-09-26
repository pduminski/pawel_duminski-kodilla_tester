package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldReturnZeroIfNoCashMachineIsAdded() {
        Bank bank = new Bank("mBank");
        bank.addCashMachine(5000);
        bank.addCashMachine(1000);
        bank.addCashMachine(2000);

        CashMachine[] cashMachines = bank.returnCreatedCashMachines();
        assertEquals(3, cashMachines);
    }
}
