package org.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    @Test
    void testEsewaPayment() {
        Payment payment = new EsewaPayment();
        assertDoesNotThrow(() -> payment.pay(1999));
    }

    @Test
    void testKhaltiPayment() {
        Payment payment = new KhaltiPayment();
        assertDoesNotThrow(() -> payment.pay(2099));
    }

    @Test
    void testCardPayment() {
        Payment payment = new CardPayment();
        assertDoesNotThrow(() -> payment.pay(3990));
    }

    @Test
    void testBankTransfer(){
        Payment payment = new BankTransfer();
        assertDoesNotThrow(() -> payment.pay(2399));
    }
}