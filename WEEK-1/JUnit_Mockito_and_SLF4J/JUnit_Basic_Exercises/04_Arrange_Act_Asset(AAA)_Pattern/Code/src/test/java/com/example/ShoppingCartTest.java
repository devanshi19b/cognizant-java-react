package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Exercise 4: Arrange-Act-Assert (AAA) Pattern,
 *             Test Fixtures, Setup and Teardown Methods in JUnit
 *
 * PDF Steps:
 * 1. Write tests using the AAA pattern.
 * 2. Use @BeforeEach and @AfterEach annotations for setup and teardown methods.
 *    (PDF refers to @Before / @After which are JUnit 4 equivalents;
 *     in JUnit 5 these are @BeforeEach / @AfterEach)
 */
public class ShoppingCartTest {

    private ShoppingCart cart;

    // --- Test Fixture: Setup ---
    // Runs before EVERY test method
    @BeforeEach
    public void setUp() {
        System.out.println("[Setup] Creating a fresh ShoppingCart...");
        cart = new ShoppingCart();
    }

    // --- Test Fixture: Teardown ---
    // Runs after EVERY test method
    @AfterEach
    public void tearDown() {
        System.out.println("[Teardown] Clearing and releasing ShoppingCart...");
        cart = null;
    }

    @Test
    public void testAddItemIncreasesCount() {
        // Arrange
        double itemPrice = 29.99;

        // Act
        cart.addItem(itemPrice);

        // Assert
        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testAddItemUpdatesTotalPrice() {
        // Arrange
        double itemPrice = 49.99;

        // Act
        cart.addItem(itemPrice);

        // Assert
        assertEquals(49.99, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testAddMultipleItems() {
        // Arrange
        double price1 = 10.0;
        double price2 = 25.0;
        double price3 = 15.0;

        // Act
        cart.addItem(price1);
        cart.addItem(price2);
        cart.addItem(price3);

        // Assert
        assertEquals(3, cart.getItemCount());
        assertEquals(50.0, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testCartIsEmptyAfterClear() {
        // Arrange
        cart.addItem(100.0);
        cart.addItem(200.0);
        assertFalse(cart.isEmpty());

        // Act
        cart.clear();

        // Assert
        assertTrue(cart.isEmpty());
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testRemoveItemFromEmptyCartThrowsException() {
        // Arrange
        assertTrue(cart.isEmpty());

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> cart.removeItem(10.0));
    }

    @Test
    public void testAddItemWithNonPositivePriceThrowsException() {
        // Arrange
        double invalidPrice = -5.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> cart.addItem(invalidPrice));
    }
}
