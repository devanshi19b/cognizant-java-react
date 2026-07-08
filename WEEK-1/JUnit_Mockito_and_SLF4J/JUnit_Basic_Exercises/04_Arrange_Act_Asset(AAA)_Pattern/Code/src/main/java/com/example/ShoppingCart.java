package com.example;

/**
 * Exercise 4: Arrange-Act-Assert (AAA) Pattern,
 *             Test Fixtures, Setup and Teardown Methods in JUnit
 *
 * A ShoppingCart class used to demonstrate the AAA pattern
 * and @BeforeEach / @AfterEach lifecycle hooks.
 */
public class ShoppingCart {

    private int itemCount;
    private double totalPrice;

    public ShoppingCart() {
        this.itemCount = 0;
        this.totalPrice = 0.0;
    }

    public void addItem(double price) {
        if (price <= 0) throw new IllegalArgumentException("Price must be positive");
        itemCount++;
        totalPrice += price;
    }

    public void removeItem(double price) {
        if (itemCount == 0) throw new IllegalStateException("Cart is already empty");
        itemCount--;
        totalPrice -= price;
    }

    public void clear() {
        itemCount = 0;
        totalPrice = 0.0;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isEmpty() {
        return itemCount == 0;
    }
}
