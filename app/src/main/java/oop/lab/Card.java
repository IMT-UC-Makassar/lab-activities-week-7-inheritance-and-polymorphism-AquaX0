package oop.lab;

public class Card {
    private String cardNumber;
    private String cardHolder;

    public Card (String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    public double getInterestRate () {
        double rate = 10.0;
        System.out.println("Interest Rate : " + rate);
        return rate;
    }
}
