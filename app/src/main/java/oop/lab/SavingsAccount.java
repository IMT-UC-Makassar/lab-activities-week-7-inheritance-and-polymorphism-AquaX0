package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService{
    public SavingsAccount(String accountHolder, String accountNumber, double balance) {
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
}
