package com.spring_tutorial.store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount + " paid");
    }
}
