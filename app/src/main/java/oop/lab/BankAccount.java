package oop.lab;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit (double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit failed");
        } else {
            System.out.println("Deposited" + amount);
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > balance || amount < 0) {
            throw new IllegalArgumentException("Withdraw Failed");
        } else {
            System.out.println("Withdrawed " + amount);
            balance -= amount;
        }
        return balance;
    }

    public abstract double calculateInterest();
}