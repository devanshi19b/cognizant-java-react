package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Exercise 3: Assertions in JUnit
 *
 * PDF Steps:
 * 1. Write tests using various JUnit assertions.
 *
 * PDF Solution Code (adapted to JUnit 5):
 *   - assertEquals
 *   - assertTrue
 *   - assertFalse
 *   - assertNull
 *   - assertNotNull
 */
public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }

    @Test
    public void testBankAccountAssertions() {
        BankAccount account = new BankAccount("Alice", 1000.0);
        BankAccount nullAccount = null;

        // assertEquals: verify owner name
        assertEquals("Alice", account.getOwner());

        // assertEquals: verify balance after deposit
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.001);

        // assertTrue: account has sufficient funds
        assertTrue(account.hasSufficientFunds(1000.0));

        // assertFalse: account does not have too many funds
        assertFalse(account.hasSufficientFunds(9999.0));

        // assertNotNull: account object exists
        assertNotNull(account);

        // assertNull: null reference is null
        assertNull(nullAccount);

        // assertThrows: withdrawal beyond balance throws exception
        assertThrows(IllegalStateException.class, () -> account.withdraw(99999.0));
    }

    @Test
    public void testGetStatusReturnsNullWhenBalanceIsZero() {
        BankAccount zeroAccount = new BankAccount("Bob", 0);

        // assertNull: status is null when balance is 0
        assertNull(zeroAccount.getStatus());
    }

    @Test
    public void testGetStatusReturnsActiveWhenBalanceIsPositive() {
        BankAccount activeAccount = new BankAccount("Carol", 500.0);

        // assertNotNull: status is not null
        assertNotNull(activeAccount.getStatus());

        // assertEquals: status is "Active"
        assertEquals("Active", activeAccount.getStatus());
    }
}
