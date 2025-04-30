package oop.lab;

public interface OnlineService {
    default void transferFunds(double amount, String accountNumber) {}
    default void payBills(double amount) {}
}
