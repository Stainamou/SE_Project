package test.java;
import week3.Account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testInitialBalance() {
        Account account = new Account();
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        Account account = new Account();
        account.deposit(200.0);
        double withdrawn = account.withdraw(150.0);
        assertEquals(150.0, withdrawn);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    void testWithdrawFail() {
        Account account = new Account();
        account.deposit(50.0);
        double withdrawn = account.withdraw(100.0);
        assertEquals(0.0, withdrawn);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        Account account = new Account();
        account.deposit(-20.0);
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Account account = new Account();
        account.deposit(100.0);
        double withdrawn = account.withdraw(-10.0);
        assertEquals(0.0, withdrawn);
        assertEquals(100.0, account.getBalance());
    }
}
