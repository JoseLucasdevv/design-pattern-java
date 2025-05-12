package org.project.behavioral.strategy;

public class PayByPayPal implements PayStrategy {

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting PayPal payment details");
    }

    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying by PayPal: " + paymentAmount);
        return true;
    }


}