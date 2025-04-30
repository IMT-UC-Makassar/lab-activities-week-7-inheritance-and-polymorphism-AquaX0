package oop.lab;

public class BusinessAccount extends BankAccount implements LoanService, OnlineService{
    private String status;

    public BusinessAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * 0.03;
        deposit(interest);
        return interest;
    }

    @Override
    public void transferFunds(double amount, String accountNumber) {
        if (getBalance() >= amount) {
            withdraw(amount);
            System.out.println("payBills successful");
        } else {
            System.out.println("payBills failed");
        }
    }

    @Override
    public void payBills(double amount) {
        if (getBalance() >= amount) {
            withdraw(amount);
            System.out.println("payBills successful");
        } else {
            System.out.println("payBills failed");
        }
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Loan amount must be positive");
        }
        status = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        String status = "Pending";
        System.out.println("Loan Status : " + status);
        return status;
    }
}