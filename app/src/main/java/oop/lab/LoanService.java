package oop.lab;

public interface LoanService {
    default void applyForLoan (double amount) {}
    default String checkLoanStatus () {
        return null;
    }
}
