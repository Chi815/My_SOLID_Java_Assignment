package org.example;

public interface Payment {
    void pay(double amount);
}

class EsewaPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Esewa: " + amount);
    }
}

class KhaltiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Khalti: " + amount);
    }
}

class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }
}

class BankTransfer implements Payment {
    @Override
    public void pay(double amount) {
        System.out.print("Paid using Bank Transfer: " + amount);

    }
}





