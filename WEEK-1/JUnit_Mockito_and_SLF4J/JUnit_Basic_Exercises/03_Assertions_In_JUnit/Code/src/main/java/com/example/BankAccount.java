package com.example;

/**
 * Exercise 3: Assertions in JUnit
 *
 * A BankAccount class whose methods will be used
 * to demonstrate all types of JUnit 5 assertions.
 */
public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
        if (amount > balance) throw new IllegalStateException("Insufficient funds");
        balance -= amount;
    }

    public boolean hasSufficientFunds(double amount) {
        return balance >= amount;
    }

    // Returns null if balance is zero
    public String getStatus() {
        if (balance == 0) return null;
        return balance > 0 ? "Active" : "Overdrawn";
    }
}
