package org.project.behavioral.strategy;

public class RunStrategy {

    public static void main(String[] args) {
        PaymentService paymentService1 = new PaymentService(new PayByCreditCard());
         PaymentService paymentService2 = new PaymentService(new PayByPayPal());

         paymentService1.pay(100);
        paymentService1.collectPaymentDetails();

        paymentService2.pay(50);
        paymentService2.collectPaymentDetails();



    }



}
