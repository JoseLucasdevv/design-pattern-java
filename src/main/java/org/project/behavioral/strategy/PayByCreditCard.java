package org.project.behavioral.strategy;

public class PayByCreditCard implements PayStrategy {

    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying by Credit Card: " + paymentAmount);
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting Credit Card payment details");
    }
}
