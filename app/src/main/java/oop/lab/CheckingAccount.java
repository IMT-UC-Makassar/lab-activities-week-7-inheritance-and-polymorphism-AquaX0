package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService{
    public CheckingAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return 0;
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