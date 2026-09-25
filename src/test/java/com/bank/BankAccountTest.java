package com.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {

        BankAccount account =
                new BankAccount("BA1001", "Satvik", 10000);

        account.deposit(2000);

        assertEquals(12000, account.getBalance());
    }

    @Test
    void testWithdraw() {

        BankAccount account =
                new BankAccount("BA1001", "Satvik", 10000);

        account.withdraw(3000);

        assertEquals(7000, account.getBalance());
    }

    @Test
    void testTransfer() {

        BankAccount sender =
                new BankAccount("BA1001", "Satvik", 10000);

        BankAccount receiver =
                new BankAccount("BA1002", "Rahul", 5000);

        sender.transfer(receiver, 2000);

        assertEquals(8000, sender.getBalance());
        assertEquals(7000, receiver.getBalance());
    }

    @Test
    void testGetBalance() {

        BankAccount account =
                new BankAccount("BA1001", "Satvik", 15000);

        assertEquals(15000, account.getBalance());
    }
}