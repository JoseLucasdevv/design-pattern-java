package org.project.behavioral.strategy;

public class PaymentService {

    private final PayStrategy payStrategy;

    protected PaymentService(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }

    void pay(int amount){
        this.payStrategy.pay(amount);
    }

    void collectPaymentDetails(){
        this.payStrategy.collectPaymentDetails();
    }





}
